@param edu.unam.jte.index.ModeloIndex modelo

<html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Revisiones</title>
    </head>

    <body>
        @if (modelo.nombreUsuario.trim().isEmpty()) 
            <p>Hola ${modelo.nombreUsuario}!</p>
            <p> Ver <a href="/cursos">Cursos</a> </p>
        @else        
            <form action="/" method="post">
                <label> Usuario </label>
                <input type="text" placeholder="nombreUsuario" name="nombreUsuario">
                <button>Ingresar</button>
            </form>
        @endif

    </body>
</html>