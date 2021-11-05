@param com.tulabor.tulabor.paginas.ModeloCategorias categoria
@param com.tulabor.tulabor.paginas.ModeloEmpresas empresa


@tag.header()

<h2> Crear Publicación </h2>
<form action="/empresa/guardar-publicacion" method="post">
    <div class="col-md-3">
        <label for="titulo" class="form-label">Título</label>
        <input type="text" class="form-control" id="titulo" value="" required name="titulo">
        <div class="valid-feedback">
            ok!
        </div>
    </div>
    <div class="col-md-3">
        <label for="descripcion" class="form-label">descripcion</label>
        <input type="text" class="form-control" id="descripcion" value="" required name="descripcion">
        <div class="valid-feedback">
            ok!
        </div>
    </div>
    <div class="col-md-3">
        <label for="fechaLimite" class="form-label">Fecha Limite</label>
        <input type="date" name="fechaLimite">
        <div class="invalid-feedback">
            Please select.
        </div>
    </div>
    <div class="col-md-3">
        <label for="modalidad" class="form-label">Modalidad</label>
        <select class="form-select" id="modalidad" required name="modalidad">
            <option selected value="presencial">Presencial</option>
            <option value="remoto">Remoto</option>
            <option value="mixto">Mixto</option>
        </select>
        <div class="invalid-feedback">
            Please select.
        </div>
    </div>
    <div class="col-md-3">
        <label for="sueldo" class="form-label">Sueldo</label>
        <input type="text" class="form-control" id="sueldo" required name="sueldo">
        <div class="valid-feedback">
            ok!
        </div>
    </div>
    <div class="col-md-3">
        <label for="categoria" class="form-label">Categoría</label>
        <select class="form-select" id="categoria" required name="categoria">
            @for (var c : categoria.categorias)
            <option value="${c.getId()}">${c.getNombre()}</option>
            @endfor
        </select>
        <div class="invalid-feedback">
            Please select.
        </div>
    </div>
    <div class="col-md-3">
        <label for="empresa" class="form-label">Empresa</label>
        <select class="form-select" id="empresa" required name="empresa">
            @for (var e : empresa.empresas)
            <option value="${e.getId()}">${e.getNombre()}</option>
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