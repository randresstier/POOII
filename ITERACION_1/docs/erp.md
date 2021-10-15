# Especificación de requisitos de software

## Enunciado del problema

Al momento de buscar y presentar nuestro perfil a diferentes puestos de trabajo, en la mayoria de los casos, el proceso se vuelve engorroso.
Los motivos de esto son, la manera de ingresar los datos requeridos en la plataforma, realizar un adecuado seguimiento al proceso de seleccion.

## Clientes potenciales
Los clientes potenciales de **Tulabor** pueden ser, cualquier empresa que desee publicar en la bolsa de trabajo y cualquier persona que quiera aplicar a estos puestos.

## Solución propuesta 

Crear una plataforma denominada **Tulabor** con el concepto de bolsa de trabajo, donde cada empresa tenga la capacidad de publicar sus vacantes y que los usuarios interesados puedan aplicar a estos puestos.
La solucion buscada, sería una plataforma con flujos agiles, donde las acciones de publicar una vacante y aplicar a esta sea de la forma mas rapida y concisa posible.


**Requisitos funcionales**: 
- Como usuario quiero cargar el cv para poder adjuntarlo en la publicación.
- Como usuario quiero ver ingresar mis datos basicos en mi perfil.
- Como usuario quiero ver mis datos en mi perfil para validarlos
- Como usuario quiero ver las publicaciones de la bolsa de trabajo.
- Como usuario quiero ver los detalles de alguna publicacion para ver datos relevantes.
- Como usuario quiero poder solicitar postular en la publicacion seleccionada.
- Como usurario quiero ver el historial de mis postulaciones.
- Como usuario quiero ver el el estado de cada postulacion.
- Como empresa quiero crear anuncios para poder publicarlos,
- Como empresa quiero crear un perfil con datos basicos.
- Como empresa quiero ver mi perfil con los datos correspondietes.
- Como empresa deseo ver los perfiles de los usuarios que postularon al anuncio.
 
## Arquitectura de software

**Tulabor** será una aplicación web aprovechando, la ventajas de esacalbilidad y capacidad de tener la plataforma en multiples instancias,bajo la arquitectura Cliente-Servidor.

- Para el backend, será una API en Java usando el framework Javalin.
- La base de datos será PostgreSQL para proporcionar persistencia.
- Para Frontend, usaré HTML, CSS y JavaScript.