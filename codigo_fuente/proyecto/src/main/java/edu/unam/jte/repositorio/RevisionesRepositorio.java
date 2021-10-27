package edu.unam.jte.repositorio;

import java.util.List;
import edu.unam.jte.modelo.Revision;

public interface RevisionesRepositorio {

    List<Revision> listarPorCursoId(int id) throws RepositorioExcepcion;
    int crear(Revision revision) throws RepositorioExcepcion;
    boolean borrar(Revision revision) throws RepositorioExcepcion;
}
