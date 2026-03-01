# UMUBoard
#### Plantilla de la práctica de Trello (PDS 2026)
Este repositorio es un ejemplo para ver cómo podría usarse Git para la organización del código de la práctica de PDS 2026. La idea 
es ver qué información mínima debería de tener el repositorio y marcar varias ideas de flujos de trabajo para facilitar el trabajo
entre los alumnos.

<p align="center">
  <img src="logo.png" width="300"/>
</p>

## Integrantes
- José Antonio García Díaz <joseantonio.garcia8@um.es> (Grupo 2)

## Descripción del Proyecto
Aplicación para la gestión de tableros de tareas colaborativas inspirada en herramientas como Trello.

La aplicación permite:
- Crear y modificar tableros
- Gestionar listas dentro de cada tablero
- Crear tarjetas
- Marcar tarjetas como completadas
- Registrar historial de acciones
- Compartir tableros mediante URL privada

Como funcionalidad extra, se han implementado las siguientes funcionalidades:
- Bloqueo temporal de tableros
  Un tablero puede bloquearse para impedir la creación de nuevas tarjetas, permitiendo únicamente el movimiento entre listas existentes.

- Filtrado de tarjetas por etiquetas  
  El sistema permite filtrar dinámicamente las tarjetas visibles en un tablero según sus etiquetas.


## Arquitectura
El sistema está dividido en dos proyectos independientes:

### Backend
Responsable de la lógica de negocio y la exposición de una API REST.
- Arquitectura Hexagonal (Ports & Adapters)
- Enfoque Domain-Driven Design (DDD)
- Persistencia con JPA
- Pruebas unitarias del modelo de dominio

El backend expone una API REST consumida por el frontend.

```
http://localhost:8080
```

### Frontend

Aplicación de escritorio desarrollada con JavaFX.

- Patrón MVC
- Separación clara entre vista, controlador y modelo de presentación
- Comunicación con el backend mediante peticiones HTTP REST


## Cómo arrancar la aplicación
1. Arranca el servidor Web desde Eclipse
2. Arranca la aplicación del frontend desde Eclipse

### Test de pruebas
Para arrancar la suite de pruebas, ejecuta desde el backend:
```
mvn test
```


### Información útil
- [docs/workflow.md]() Sugerencia del flujo de trabajo dentro de GIT. 

