@param edu.unam.jte.paginas.ModeloCursos modelo

@tag.header()

    <h2> Cursos </h2>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                </tr>
            </thead>

            <tbody>
                @for (var curso : modelo.cursos)
                    <tr>
                        <td scope="row">${curso.getId()}</td>
                        <td>${curso.getNombre()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info no-gutters" href="cursos/${curso.getId()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${curso.getId()})"> Eliminar </button></td>
                        <td class="col-1"> <a href="/cursos/${curso.getId()}/revisiones" type="button" class="btn btn-secondary"> Revisiones </a> </td>
                    </tr>
                @endfor
            </tbody>

        </table>
    </div>


<script src="/js/cursos.js"></script>


@tag.footer()