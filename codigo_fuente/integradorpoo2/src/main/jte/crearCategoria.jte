

@tag.header()

<h2> Crear Categoría </h2>
<form action="/admin/guardar-categoria" method="post">
    <div class="form-group row">
        <label for="nombre" class="col-sm-2 col-form-label"> Nombre Categoría </label>
        <div class="col-sm-8">
            <input class="form-control" type="text" placeholder="categoría" name="nombre"/>
        </div>
    </div>
    <button type="submit" class="btn btn-primary"> Guardar </button>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
</form>

@tag.footer()
