# HU-01 – Gestión de tableros (CRUD)

Este es un ejemplo de una historia de usuario. El nivel de detalle puede variar por grupo. La idea es que esta historia de usuario refleje lo que
tiene que hacer el sistema como requisitos y sirva un poco para documentar otros requisitos de alto nivel necesarios.

Una historia de usuario puede implementarse mediante uno o varios `issues`.

## Historia
**Como** usuario  
**quiero** crear, consultar, modificar y eliminar tableros  
**para** gestionar mi trabajo mediante listas y tarjetas.

## Notas
- Al crear un tablero, el sistema genera un **identificador único público** (_uid_).
- No se requiere autenticación.

## Criterios de aceptación
### Crear tablero
- Dado un nombre válido, se puede crear un tablero.
- Al crear un tablero, el sistema genera:
  - un identificador interno (uso interno del sistema),
  - y un identificador único público, utilizado para acceder al tablero.
- El sistema devuelve el identificador único público asociado al tablero.

### Consultar tablero
- Se puede obtener un tablero a partir de su identificador único público.
- Si el tablero no existe, el sistema indica que no puede encontrarse.

### Listar tableros
- Se puede obtener un listado de tableros disponibles.
- El listado debe ir paginado cuando el número de tableros sea elevado (_opcional_)

### Modificar tablero
- Se puede cambiar el nombre de un tablero existente.
- No se permiten nombres vacíos.

### Eliminar tablero
- Se puede eliminar un tablero existente.
- Si el tablero no existe, se informa del error.
