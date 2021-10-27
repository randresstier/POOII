@param edu.unam.jte.paginas.ModeloRevisiones modelo


@tag.header()

<h2> Revisiones del curso ${modelo.cursoId} </h2>
<a href="/cursos" type="button" class="btn btn-secondary"> Volver </a>
<a href="/cursos/${modelo.cursoId}/revisiones/nuevo" type="button" class="btn btn-primary"> Agregar </a>

<div class="table-responsive">
    <table class="table table-hover table-striped">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Calificación</th>
                <th scope="col">Comentario</th>                            
                <th scope="col">Consejo</th>
            </tr>
        </thead>
            
        <tbody>

            @for (var revision : modelo.revisiones)
                <tr>
                    <td>${revision.getId()}</td>
                    <td>${revision.getCalificacion()}</td>
                    <td>${revision.getComentario()}</td>
                    <td>${revision.getConsejo()}</td>
                </tr>
            @endfor
        </tbody>
    </table>
</div>

@tag.footer()