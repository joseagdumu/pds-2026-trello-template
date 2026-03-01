# Flujo de trabajo basado en Issues y Pull Requests
Este documento describe un posible flujo de trabajo recomendado para organizar el desarrollo del proyecto en GitHub.

Una vez especificadas todas o algunas de las historias de usuario, el flujo de trabajo recomendado es:
```
1 Issue → 1 Rama → 1 Pull Request → Merge en main
```

Esta forma de trabajo aporta:
- Organización del desarrollo
- Trazabilidad de cambios
- Revisión de código
- Una rama ```main``` estable y siempre ejecutable

## 1. ¿Qué es un Issue?
Un **Issue** representa una tarea concreta dentro del proyecto.

Puede ser una funcionalidad nueva, un error detectado, o una mejora técnica, por poner algunos ejemplos. Los issues deben describir claramente: 
(1) Qué se quiere hacer, (2) Por qué se quiere hacer y (3) Cuáles son los criterios de aceptación; es decir, cuándo se considera terminado.

Las ventajas de usar issues es que permiten asignar responsabilidad, disponer de un mecanismo de trazabilidad y, además relacionar código con funcionalidades concretas

**Ejemplo: **. Puedes ver un ejemplo de issue para el CRUD del tablero [aquí](https://github.com/joseagdumu/pds-2026-trello-template/issues/1)

## 2. ¿Qué es un Pull Request (PR)?

Un **Pull Request** es una propuesta de cambio sobre la rama principal del proyecto (`main`).

Un flujo de trabajo puede ser:
1. Crear una rama nueva a partir de un Issue.
2. Desarrollar la funcionalidad en esa rama.
3. Abrir un Pull Request.
4. Revisar el código de la Pull Request.
5. Fusionar con la rama principal.


## Ejemplo
Vamos a implementar el método ```GET```del tablero.

1. Creamos el issue: Implementar GET ```/boards```, y obtiene el ID 12.
2. Creamos la rama: `12-get-boards`
3. Creamos la PR: `Implementación de listado de tableros closes #12`
