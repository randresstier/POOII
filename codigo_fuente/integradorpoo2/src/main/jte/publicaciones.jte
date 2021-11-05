@param com.tulabor.tulabor.paginas.ModeloPublicaciones modelo

@tag.header()

    <h2> Publicaciones </h2>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Título</th>
                    <th class="col-1" scope="col">Descripción</th>
                    <th class="col-1" scope="col">Fecha Limite</th>
                    <th class="col-1" scope="col">Sueldo</th>
                    <th class="col-1" scope="col">Modalidad</th>
                    <th class="col-1" scope="col">Empresa</th>
                    <th class="col-1" scope="col">Categoría</th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                </tr>
            </thead>

            <tbody>
                @for (var c : modelo.publicaciones)
                    <tr>
                        <td scope="row">${c.getId()}</td>
                        <td>${c.getTitulo()}</td>
                        <td>${c.getDescripcion()}</td>
                        <td>${c.getFechaLimite()}</td>
                        <td>${c.getSueldo()}</td>
                        <td>${c.getModalidad()}</td>
                        <td>${c.getEmpresa().getNombre()}</td>
                        <td>${c.getCategoria().getNombre()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info no-gutters" href="/"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick=""> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>

        </table>
    </div>


<script src="/js/empresas.js"></script>


@tag.footer()