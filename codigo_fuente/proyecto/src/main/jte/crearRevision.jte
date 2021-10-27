@param edu.unam.jte.paginas.ModeloRevision modelo

@tag.header()

<h2> Crear revisión </h2>
<form action="/cursos/${modelo.cursoId}/revisiones" method="post">
    <div class="form-group row">
        <label for="calificacion" class="col-sm-2 col-form-label"> Calificación </label>
        <div class="col-sm-2">
            <input class="form-control" type="text" placeholder="Calificación del curso" name="calificacion"/>
        </div>
    </div>
    <div class="form-group row">
        <label for="comentario" class="col-sm-2 col-form-label"> Comentario </label>
        <div class="col-sm-8">
            <input class="form-control" type="text" placeholder="Comentario sobre el curso" name="comentario"/>
        </div>
    </div>
    <div class="form-group row">
        <label for="consejo" class="col-sm-2 col-form-label"> Consejo </label>
        <div class="col-sm-8">
            <input class="form-control" type="text" placeholder="Consejo de como encarar el curso" name="consejo"/>
        </div>
    </div>

    <button type="submit" class="btn btn-primary"> Guardar </button>
    <a href="/cursos/${modelo.cursoId}/revisiones" type="button" class="btn btn-secondary"> Volver </a>
</form>

@tag.footer()
