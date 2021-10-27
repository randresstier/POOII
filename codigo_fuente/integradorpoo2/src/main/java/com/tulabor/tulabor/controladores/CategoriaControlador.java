package com.tulabor.tulabor.controladores;

import com.tulabor.tulabor.modelo.Categoria;
import com.tulabor.tulabor.paginas.ModeloCategorias;
import io.javalin.http.Context;
import java.sql.SQLException;
import java.util.Collections;
/*
import edu.unam.jte.paginas.ModeloCursos;
import edu.unam.jte.modelo.Curso;
import edu.unam.jte.paginas.ModeloCurso;
import edu.unam.jte.repositorio.CursosRepositorio;
import edu.unam.jte.repositorio.RepositorioExcepcion;
import io.javalin.http.Context;
*/
import com.tulabor.tulabor.repositorio.CategoriaRepositorio;
import java.util.List;

public class CategoriaControlador {
    /*
    private final CursosRepositorio cursosRepositorio;

    public CategoriaControlador(CursosRepositorio cursosRepositorio) {
        this.cursosRepositorio = cursosRepositorio;
    */

    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloCategorias();
        var c = new CategoriaRepositorio();
        modelo.categorias=c.listar();
        System.out.println("MODELO");
        System.out.println(modelo.categorias);
        ctx.render("categorias.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void nuevo(Context ctx) throws SQLException {
        ctx.render("crearCategoria.jte", Collections.singletonMap("modelo", null));        
    }
    public void crear(Context ctx) throws SQLException {
        
        var categoria = new Categoria(ctx.formParam("nombre"));
        System.out.println(categoria);
        CategoriaRepositorio c = new CategoriaRepositorio();
        c.crear(categoria);
        ctx.redirect("/categorias");        
    }
/*
    public void borrar(Context ctx) throws SQLException, RepositorioExcepcion {
        System.out.println(ctx.pathParam("id", Integer.class).get());
        this.cursosRepositorio.borrar(this.cursosRepositorio.obtener(ctx.pathParam("id", Integer.class).get()));
        ctx.redirect("/cursos");  
    }

    public void modificar(Context ctx) throws SQLException, RepositorioExcepcion {
        var modelo = new ModeloCurso();
        modelo.curso = this.cursosRepositorio.obtener(ctx.pathParam("id", Integer.class).get());
        ctx.render("editarCurso.jte", Collections.singletonMap("modelo", modelo));
    }*/

}
