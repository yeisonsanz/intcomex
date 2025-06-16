# API de Gestión de Productos y Categorías

Este proyecto es una API RESTful desarrollada con **Spring Boot** y **Java** para la gestión de productos y categorías. Permite crear, listar y administrar productos y categorías mediante endpoints seguros y estructurados.

## Características

- CRUD de productos y categorías
- Autenticación básica para proteger recursos sensibles
- Arquitectura modular y extensible
- Integración sencilla con herramientas como Postman

## Tecnologías

- Java 17+
- Spring Boot
- Maven

## Ejecución

1. Clona el repositorio.
2. Ejecuta `mvn spring-boot:run`.
3. Accede a la API en `http://localhost:8080`.

## Autenticación

Los endpoints requieren autenticación básica:

- **Usuario:** admin
- **Contraseña:** admin123

## Ejemplo de Endpoints

- `POST /api/categories` — Crear categoría
- `GET /api/categories` — Listar categorías
- `POST /api/products` — Crear producto
- `GET /api/products` — Listar productos

## Pruebas con Postman

1. Selecciona el método y la URL correspondiente.
2. En la pestaña **Authorization**, elige **Basic Auth** e ingresa las credenciales.
3. Envía la petición y revisa la respuesta.

---

Proyecto ideal para sistemas de inventario, catálogos o e-commerce.