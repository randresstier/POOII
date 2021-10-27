@param com.tulabor.tulabor.paginas.ModeloCategorias modelo

@tag.header()

    <h2> Categorias </h2>
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
                @for (var categoria : modelo.categorias)
                    <tr>
                        <td scope="row">${categoria.getId()}</td>
                        <td>${categoria.getNombre()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info no-gutters" href="categorias/${categoria.getId()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${categoria.getId()})"> Eliminar </button></td>
                        <td class="col-1"> <a href="/categorias/${categoria.getId()}/revisiones" type="button" class="btn btn-secondary"> Revisiones </a> </td>
                    </tr>
                @endfor
            </tbody>

        </table>
    </div>


<script src="/js/categorias.js"></script>


@tag.footer()