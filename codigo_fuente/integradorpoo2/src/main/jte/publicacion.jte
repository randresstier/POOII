@param com.tulabor.tulabor.paginas.ModeloPublicacion modelo

@tag.header()

<h1 class="heading">Detalle Publicación</h1>
    <div class="article-loop">
      <h3>${modelo.publicacion.getTitulo()}</h3>
      <p>${modelo.publicacion.getDescripcion()}</p>
      <p>Fecha Limite: ${modelo.publicacion.getFechaLimite()}</p>
      <p>Sueldo: ${modelo.publicacion.getSueldo()}</p>
      <p>Modalidad: ${modelo.publicacion.getModalidad()}</p>
      <p>Empresa: ${modelo.publicacion.getEmpresa().getNombre()}</p>
      <p>Cantidad Empleados: ${modelo.publicacion.getEmpresa().getCantidadEmpleados()}</p>
      <p>Categoría: ${modelo.publicacion.getCategoria().getNombre()}</p>
      <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="location.href='/publicaciones/'">Postular</button></td>
    </div>

<script src="/js/empresas.js"></script>


@tag.footer()