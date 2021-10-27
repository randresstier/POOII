package edu.unam.jte.controladores;

import java.sql.SQLException;
import java.util.Collections;

import edu.unam.jte.modelo.Revision;
import edu.unam.jte.paginas.ModeloRevision;
import edu.unam.jte.paginas.ModeloRevisiones;
import edu.unam.jte.repositorio.CursosRepositorio;
import edu.unam.jte.repositorio.RevisionesRepositorio;
import io.javalin.http.Context;

public class RevisionesControlador {
    
    private final RevisionesRepositorio revisionesRepositorio;
    private final CursosRepositorio cursosRepositorio;
    

    public RevisionesControlador(RevisionesRepositorio revisionesRepositorio, CursosRepositorio cursosRepositorio) {
        this.revisionesRepositorio = revisionesRepositorio;
        this.cursosRepositorio = cursosRepositorio;
    }

    public void listarPorCursoId(Context ctx) throws SQLException {
        var cursoId = ctx.pathParam("id", Integer.class).get();
        var modelo = new ModeloRevisiones();
        modelo.cursoId = cursoId;
        modelo.revisiones = revisionesRepositorio.listarPorCursoId(cursoId);
        ctx.render("revisiones.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void nuevo(Context ctx) throws SQLException {
        var cursoId = ctx.pathParam("id", Integer.class).get();
        var modelo = new ModeloRevision();
        modelo.cursoId = cursoId;
        ctx.render("crearRevision.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void crear(Context ctx) throws SQLException {
        // obtengo parámetro de la URL
        var cursoId = ctx.pathParam("id", Integer.class).get();
        
        // obtengo datos del formulario
        var calificacion = ctx.formParam("calificacion", Integer.class).get();
        var comentario = ctx.formParam("comentario", String.class).get();
        var consejo = ctx.formParam("consejo", String.class).get();

        // obtengo curso
        var curso = cursosRepositorio.obtener(cursoId);

        // creo objeto Revision
        var revision = new Revision(calificacion, comentario, consejo, curso);
        
        // inserto en base de datos
        this.revisionesRepositorio.crear(revision);

        // redireciono
        ctx.redirect("/cursos/" + cursoId + "/revisiones");        
    }


}