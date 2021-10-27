package edu.unam.jte.repositorio;

import java.util.List;
import edu.unam.jte.modelo.Curso;

public interface CursosRepositorio {

    List<Curso> listar() throws RepositorioExcepcion;
    int crear (Curso curso) throws RepositorioExcepcion;
    boolean borrar (Curso curso) throws RepositorioExcepcion;
    boolean modificar (Curso curso) throws RepositorioExcepcion;
    Curso obtener (int id) throws RepositorioExcepcion;
    
}
