@param com.tulabor.tulabor.paginas.ModeloPublicaciones modelo

@tag.header()

<h1 class="heading">Publicaciones</h1>
    @for (var c : modelo.publicaciones)
        <div class="article-loop">
          <h3>${c.getTitulo()}</h3>
          <p>${c.getDescripcion()}</p>
          <p>Fecha Limite: ${c.getFechaLimite()}</p>
          <p>Sueldo: ${c.getSueldo()}</p>
          <p>Modalidad: ${c.getModalidad()}</p>
          <p>Empresa: ${c.getEmpresa().getNombre()}</p>
          <p>Categoría: ${c.getCategoria().getNombre()}</p>
          <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="location.href='/publicaciones/${c.getId()}'">Ver</button></td>
        </div>
    @endfor

<script src="/js/empresas.js"></script>


@tag.footer()