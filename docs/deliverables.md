# Evidencias y documentación recomendada para la entrega
Este documento describe los artefactos que deberían acompañar al proyecto
más allá del código fuente.

El objetivo es justificar el diseño, demostrar calidad y facilitar la evaluación.

## 1. Historias de usuario
Se recomienda incluir un conjunto de historias de usuario que describan
las funcionalidades implementadas.

Ejemplo:

- Como *usuario propietario de un tablero** quiero *bloquear el tablero temporalmente* para *impedir la creación de nuevas tarjetas*.

Las historias de usuario pueden almacenarse:

- En GitHub Issues con una etiqueta para marcarlos bien.
- En un documento `/docs/user-stories.md`

#### Consejos
- No es mejor tener más historias, sino historias mejor definidas.
  Una historia puede implicar varias operaciones internas.
- Evitar historias excesivamente pequeñas, como ```añadir etiqueta a tarjeta```.
- Pensar en bloques funcionales completos.
- Si se trabaja con GitHub Issues, la información detallada puede añadirse en el propio Issue.
- Si se usa un documento Markdown, debe incluir criterios de aceptación claros.


#### Ejemplo
```
## HU-01: Gestión de Tableros

Como usuario  
quiero poder crear, modificar y eliminar un tablero  
para gestionar mi espacio de trabajo colaborativo.

### Criterios de aceptación
- Se puede crear un tablero indicando un nombre.
- El sistema generaun ID único.
- Se puede modificar el nombre del tablero.
- Se puede eliminar el tablero.
- Solo el propietario puede eliminarlo.
```
