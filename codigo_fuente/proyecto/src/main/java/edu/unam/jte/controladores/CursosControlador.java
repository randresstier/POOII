package edu.unam.jte.controladores;

import java.sql.SQLException;
import java.util.Collections;

import edu.unam.jte.paginas.ModeloCursos;
import edu.unam.jte.modelo.Curso;
import edu.unam.jte.paginas.ModeloCurso;
import edu.unam.jte.repositorio.CursosRepositorio;
import edu.unam.jte.repositorio.RepositorioExcepcion;
import io.javalin.http.Context;

public class CursosControlador {

    private final CursosRepositorio cursosRepositorio;

    public CursosControlador(CursosRepositorio cursosRepositorio) {
        this.cursosRepositorio = cursosRepositorio;
    }

    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloCursos();
        modelo.cursos = cursosRepositorio.listar();
        ctx.render("cursos.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void nuevo(Context ctx) throws SQLException {
        ctx.render("crearCurso.jte", Collections.singletonMap("modelo", null));        
    }

    public void crear(Context ctx) throws SQLException {
        var curso = new Curso(ctx.formParam("nombre", String.class).get());
        this.cursosRepositorio.crear(curso);
        ctx.redirect("/cursos");        
    }

    public void borrar(Context ctx) throws SQLException, RepositorioExcepcion {
        System.out.println(ctx.pathParam("id", Integer.class).get());
        this.cursosRepositorio.borrar(this.cursosRepositorio.obtener(ctx.pathParam("id", Integer.class).get()));
        ctx.redirect("/cursos");  
    }

    public void modificar(Context ctx) throws SQLException, RepositorioExcepcion {
        var modelo = new ModeloCurso();
        modelo.curso = this.cursosRepositorio.obtener(ctx.pathParam("id", Integer.class).get());
        ctx.render("editarCurso.jte", Collections.singletonMap("modelo", modelo));
    }

}
