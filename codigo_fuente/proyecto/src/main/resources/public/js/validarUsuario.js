function validarUsuario() {
    // obtengo elemento de la pagina con id nombreUsuario
    const nombreUsuario = document.getElementById("nombreUsuario");
    console.log(nombreUsuario);
    if (nombreUsuario.value.trim().length < 1) {
        alert("El usuario debe tener un nombre");
        return false;
    } else {
        return true;
    }
}