package com.tulabor.tulabor;

import com.tulabor.tulabor.controladores.CategoriaControlador;
import io.javalin.*;
import io.javalin.http.Context;
import java.util.Collections;

//import org.sql2o.Sql2o;
/*
import edu.unam.jte.controladores.CursosControlador;
import edu.unam.jte.controladores.RevisionesControlador;
import edu.unam.jte.paginas.*;
import edu.unam.jte.repositorio.RepositorioExcepcion;
import edu.unam.jte.repositorio.Sql2oCursosRepositorio;
import edu.unam.jte.repositorio.Sql2oRevisionesRepositorio;
*/
// para usar routes
import static io.javalin.apibuilder.ApiBuilder.*;

/**
 * Aplicación de ejemplo usando jte y sql2o
 * 
 */
import  com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.Categoria;
import com.tulabor.tulabor.paginas.ModeloIndex;
import io.javalin.http.staticfiles.Location;
import com.tulabor.tulabor.controladores.CategoriaControlador;
import com.tulabor.tulabor.controladores.EmpresaControlador;
import com.tulabor.tulabor.controladores.PublicacionControlador;

public class App {
    
    
    /** 
     * @param args argumento que recibe la aplicación
     */
    public static void main(String[] args) {
        //inicio servicio de datos
        DataService service = new DataService(); 

        // creo servidor
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public", Location.CLASSPATH);
        }).exception(Exception.class, (e, ctx) -> { 
            ctx.status(404);
            ctx.result(e.toString());
        
        }).start(7000);
        
        
        var CategoriaControlador = new CategoriaControlador(service);
        var EmpresaControlador = new EmpresaControlador(service);
        var PublicacionControlador = new PublicacionControlador(service);
        // defino rutas
        app.get("/", App::mostrarIndex); // muestra el index
        app.get("/publicaciones",PublicacionControlador::listar);

        
        //admin
        app.get("/admin/nueva-categoria", CategoriaControlador::nuevo); // muestra el index
        app.get("/admin/categorias", CategoriaControlador::listar); // muestra el index
        app.post("/admin/guardar-categoria", CategoriaControlador::crear); // muestra el index
        app.get("/admin/empresas", EmpresaControlador::listar); // muestra el index

        
        //user empresa
        app.get("/empresa/registro", EmpresaControlador::nuevo); // muestra el index
        app.post("/empresa/guardar-empresa", EmpresaControlador::crear); // muestra el index
        app.get("/empresa/crear-publicacion",PublicacionControlador::nuevo); 
        app.post("/empresa/guardar-publicacion",PublicacionControlador::crear);

        //app.post("/empresa/perfil", EmpresaControlador::listar); // muestra el index

        
    } 
    /** 
     * @param ctx Contexto de la petición
    */
    private static void mostrarIndex(Context ctx) {
        System.out.println("index");
        var modelo = new ModeloIndex();
        ctx.render("index.jte", Collections.singletonMap("modelo", modelo));
    }
    
}


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
/*
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
*/
    //}

    
    /** 
     * @param ctx Contexto de la petición
     */
/*    private static void mostrarIndex(Context ctx) {
        var modelo = new ModeloIndex();
        // controlo por cookie
        if (ctx.cookie("nombreUsuario") != null) {
            modelo.nombreUsuario = ctx.cookie("nombreUsuario");
        } else {
            modelo.nombreUsuario = "";
        }
        ctx.render("index.jte", Collections.singletonMap("modelo", modelo));
    }
*/

    
    /*    /**
    * @param ctx Contexto de la petición
    */
/*    private static void validarUsuario(Context ctx) {
        // obtengo valor enviado en el formulario
        var valor = ctx.formParam("nombreUsuario", String.class).get();
        // creo el cookie (antes se debe validar sobre la base de datos o alguna otra forma)
        // recibo el elemento y hago un trim para guardarlo en el cookie
        ctx.cookie("nombreUsuario", valor.trim());
        // redirecciono a /
        ctx.redirect("/");
    }
}*/