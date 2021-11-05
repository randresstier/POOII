@param com.tulabor.tulabor.paginas.ModeloCategorias modelo


@tag.header()
<form action="/empresa/guardar-empresa" method="post" class="row g-3 needs-validation" novalidate>
    <div class="col-md-3">
        <label for="nombre" class="form-label">Nombre Empresa</label>
        <input type="text" class="form-control" id="nombre" value="" required name="empresa">
        <div class="valid-feedback">
        ok!
        </div>
    </div>
    <div class="col-md-3">
        <label for="correo" class="form-label">Email</label>
        <input type="email" class="form-control" id="correo" placeholder="name@example.com" name="correo">
        <div class="invalid-feedback">
            Please select.
        </div>
    </div>
    <div class="col-md-3">
        <label for="empleados" class="form-label">Cantidad Empleados</label>
        <select class="form-select" id="empleados" required name="empleados">
        <option selected value="1-10">1-10</option>
        <option  value="10-50">10-50</option>
        <option  value="50-10">50-100</option>
        <option  value="+100">+100</option>
        </select>
        <div class="invalid-feedback">
        Please select.
        </div>
    </div>
    
    <div class="col-md-3">
        <label for="descripcion" class="form-label">Descripción Empresa</label>
        <input type="text" class="form-control" id="descripcion" value="" required name="descripcion">
        <div class="valid-feedback">
        ok!
        </div>
    </div>

    <div class="col-md-3">
        <label for="categoria" class="form-label">Categoría</label>
        <select class="form-select" id="categoria" required name="categoria">
        @for (var categoria : modelo.categorias)
        <option  value="${categoria.getId()}">${categoria.getNombre()}</option>
        @endfor
        </select>
        <div class="invalid-feedback">
            Please select.
        </div>

    </div>
    <button type="submit" class="btn btn-primary"> Guardar </button>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
</form>




@tag.footer()
