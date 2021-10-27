package edu.unam.jte;

import io.javalin.*;
import io.javalin.http.Context;
import java.util.Collections;

import org.sql2o.Sql2o;

import edu.unam.jte.controladores.CursosControlador;
import edu.unam.jte.controladores.RevisionesControlador;
import edu.unam.jte.paginas.*;
import edu.unam.jte.repositorio.RepositorioExcepcion;
import edu.unam.jte.repositorio.Sql2oCursosRepositorio;
import edu.unam.jte.repositorio.Sql2oRevisionesRepositorio;

// para usar routes
import static io.javalin.apibuilder.ApiBuilder.*;

/**
 * Aplicación de ejemplo usando jte y sql2o
 * 
 */
public class App {
    
    
    /** 
     * @param args argumento que recibe la aplicación
     */
    public static void main(String[] args) {
        // conexión usando sql2o
        // para crear un superusuario en postgres
        // sudo -u postgres createuser -s $(whoami);
        // dentro de postgres (ej: psql): alter user USUARIO password 'XXXX';
        var sql2o = new Sql2o("jdbc:postgresql://localhost:5432/revisiones", "cbiale", "cbiale");

        // repositorios y controladores
        var cursosRepositorio = new Sql2oCursosRepositorio(sql2o);
        var cursosControlador = new CursosControlador(cursosRepositorio);
        var revisionesRepositorio = new Sql2oRevisionesRepositorio(sql2o);
        var revisionesControlador = new RevisionesControlador(revisionesRepositorio, cursosRepositorio);

        // creo servidor
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public");
        })
        .exception(RepositorioExcepcion.class, (e, ctx) -> { ctx.status(404); }) 
        .start(7000);


        // defino rutas

/*
        // forma alternativa de definir rutas
        app.routes(() -> {            
            path("/", () -> {
                get(App::mostrarIndex);
                post(App::validarUsuario);
                path("cursos", () -> { 
                    get( cursosControlador::listar);
                    post(cursosControlador::crear);
                    path("nuevo", () -> {
                        get(cursosControlador::nuevo);
                    });
                    path(":id", () -> {
                        get(cursosControlador::modificar);
                        delete(cursosControlador::borrar);
                        path("revisiones", () -> {
                            get(revisionesControlador::listarPorCursoId);
                            post(revisionesControlador::crear);
                            path("nuevo", () -> {
                                get(revisionesControlador::nuevo);
                            });
                        });
                    });
                });
            });
        });
        // final forma alternativa de definir rutas
*/

        app.get("/", App::mostrarIndex); // muestra el index
        app.post("/", App::validarUsuario); // "valida usuario" 
        app.get("/cursos", cursosControlador::listar); // lista los cursos
        app.get("/cursos/nuevo", cursosControlador::nuevo); // pantalla de nuevo curso
        app.post("/cursos", cursosControlador::crear); // crea un curso
        app.get("/cursos/:id", cursosControlador::modificar); // devuelve datos del curso
        app.delete("/cursos/:id", cursosControlador::borrar); // borra un curso
        app.get("/cursos/:id/revisiones", revisionesControlador::listarPorCursoId); // lista revisiones por curso
        app.post("/cursos/:id/revisiones", revisionesControlador::crear); // Crear una nueva revision 
        // donde cargar una revision nueva?
        // creo una pagina nueva o uso una existente (en este ejemplo)
        app.get("/cursos/:id/revisiones/nuevo", revisionesControlador::nuevo);
        // o alternativamente uso revisionesControlador::listar para Alta de revision        

    }

    
    /** 
     * @param ctx Contexto de la petición
     */
    private static void mostrarIndex(Context ctx) {
        var modelo = new ModeloIndex();
        // controlo por cookie
        if (ctx.cookie("nombreUsuario") != null) {
            modelo.nombreUsuario = ctx.cookie("nombreUsuario");
        } else {
            modelo.nombreUsuario = "";
        }
        ctx.render("index.jte", Collections.singletonMap("modelo", modelo));
    }


    
    /** 
     * @param ctx Contexto de la petición
     */
    private static void validarUsuario(Context ctx) {
        // obtengo valor enviado en el formulario
        var valor = ctx.formParam("nombreUsuario", String.class).get();
        // creo el cookie (antes se debe validar sobre la base de datos o alguna otra forma)
        // recibo el elemento y hago un trim para guardarlo en el cookie
        ctx.cookie("nombreUsuario", valor.trim());
        // redirecciono a / 
        ctx.redirect("/");
    }    
}
