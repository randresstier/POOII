@param edu.unam.jte.paginas.ModeloIndex modelo

@tag.header()

@if (!modelo.nombreUsuario.trim().isEmpty()) 
    <h2><b> Hola ${modelo.nombreUsuario}! </b></h2>
    <nav class="navbar navbar-dark navbar-expand-sm bg-primary">

        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="navbar-brand" href="/cursos"> Ver cursos </a>
            </li>
            <li class="nav-item">
                <a class="navbar-brand" href="/cursos/nuevo"> Agregar curso </a>
            </li>
        </ul>
    </nav>
@else        
    <form action="/" method="post" onsubmit="return validarUsuario();">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"> Usuario </label>
            <input class="form-control col-sm-4" type="text" placeholder="nombre del usuario" id="nombreUsuario" name="nombreUsuario"/>
        </div>
        <button class="btn btn-primary"> Ingresar </button>
    </form>
@endif

<script src="/js/validarUsuario.js"></script>
@tag.footer()