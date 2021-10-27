package edu.unam.jte.repositorio;

import java.util.List;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import edu.unam.jte.modelo.Curso;

public class Sql2oCursosRepositorio implements CursosRepositorio {

    private final Sql2o sql2o;

    public Sql2oCursosRepositorio(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<Curso> listar() throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Cursos;";
            return conn.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Curso.class);
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public Curso obtener(int id) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Cursos WHERE id = :id;";
            return conn.createQuery(sql)
                .addParameter("id", id)
                .throwOnMappingFailure(false)
                .executeAndFetchFirst(Curso.class);
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
     }

    @Override
    public int crear(Curso curso) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO Cursos (nombre) VALUES (:nombre);";
            return (int) conn.createQuery(sql)
                .bind(curso)
                .executeUpdate()
                .getKey();
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public boolean borrar(Curso curso) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "DELETE FROM Cursos WHERE id = :id;";
            int filas = (int) conn.createQuery(sql)
                .addParameter("id", curso.getId())
                .executeUpdate()
                .getResult();
            return filas > 0;
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public boolean modificar(Curso curso) throws RepositorioExcepcion {
        // TODO Auto-generated method stub
        return false;
    }

}
