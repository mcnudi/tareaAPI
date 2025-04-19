# API REST de Gestión de Tareas

Proyecto backend desarrollado con Java y Spring Boot. Forma parte de una aplicación full stack donde el frontend está hecho con Angular. Permite realizar operaciones CRUD sobre tareas.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Endpoints principales

- `GET /tareas` – Obtener todas las tareas
- `GET /tareas/{id}` – Obtener una tarea por ID
- `POST /tareas` – Crear una nueva tarea
- `PUT /tareas/{id}` – Actualizar una tarea existente
- `DELETE /tareas/{id}` – Eliminar una tarea

## Cómo ejecutar

1. Clona el repositorio:
2. Abre el proyecto en tu IDE (IntelliJ o Eclipse)
3. Ejecuta la clase `TareaApiApplication.java`

## Configuración de base de datos

En el archivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tarea
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## Estructura del proyecto

- `model`: Clase entidad `Tarea`
- `repository`: Interfaz JPA
- `service`: Lógica de negocio
- `controller`: Endpoints REST

Puedes ver el frontend en Angular en: https://github.com/mcnudi/tareaAPI_Angular.git

Esta aplicación se irá ampliando a corto plazo.
## Autora

Mª Carmen Ñudi Monje  
[GitHub](https://github.com/mcnudi) | [LinkedIn](www.linkedin.com/in/mari-carmen-nudi-monje)
