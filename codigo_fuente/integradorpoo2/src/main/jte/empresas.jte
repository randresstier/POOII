@param com.tulabor.tulabor.paginas.ModeloEmpresas modelo

@tag.header()

    <h2> Empresas Registradas </h2>
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
                @for (var empresa : modelo.empresas)
                    <tr>
                        <td scope="row">${empresa.getId()}</td>
                        <td>${empresa.getNombre()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info no-gutters" href="empresa/${empresa.getId()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${empresa.getId()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>

        </table>
    </div>


<script src="/js/empresas.js"></script>


@tag.footer()