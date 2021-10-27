package edu.unam.jte.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import edu.unam.jte.modelo.Curso;
import edu.unam.jte.modelo.Revision;

public class Sql2oRevisionesRepositorio implements RevisionesRepositorio {

    private final Sql2o sql2o;

    public Sql2oRevisionesRepositorio(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<Revision> listarPorCursoId(int id) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            var revisiones = new ArrayList<Revision>();
            String sql = "SELECT r.*, c.nombre FROM revisiones r, cursos c WHERE r.curso_id = c.id and curso_id = :id;";
            var resultado = conn.createQuery(sql)
                .addParameter("id", id)
                .executeAndFetchTable()
                .asList();
            for (var o : resultado) {
                var revision = new Revision();
                var curso = new Curso();
                revision.setId((int) o.get("id"));
                revision.setCalificacion((int) o.get("calificacion"));
                revision.setComentario(o.get("comentario").toString());
                revision.setConsejo(o.get("consejo").toString());
                curso.setId((int) o.get("curso_id"));
                curso.setNombre(o.get("nombre").toString());
                revision.setCurso(curso);
                revisiones.add(revision);
                System.out.println(revision);
            }
            // no conviene usar convertidores
            // dado que se deben usar conexiones a la base de datos adicionales
            // obtengo los datos en forma de lista de map y realizo conversion a mano
            return revisiones;
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public int crear(Revision revision) throws RepositorioExcepcion {
        // TODO Auto-generated method stub
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO revisiones (calificacion, comentario, consejo, curso_id) VALUES (:calificacion, :comentario, :consejo, :cursoId );";
            return (int) conn.createQuery(sql)
                .bind(revision)
                .addParameter("cursoId", revision.getCurso().getId())
                .executeUpdate()
                .getKey();
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public boolean borrar(Revision revision) throws RepositorioExcepcion {
        // TODO Auto-generated method stub
        return false;
    }

}
