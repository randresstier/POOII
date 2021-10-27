@param edu.unam.jte.paginas.ModeloCurso modelo

@tag.header()

<h2> Datos del curso </h2>

<p> Curso ${modelo.curso.getId()}</p>
<p> Nombre ${modelo.curso.getNombre()}</p>

<a href="/cursos" type="button" class="btn btn-secondary"> Volver </a>

@tag.footer()