# API REST Empleados - Prueba Técnica

Este proyecto consiste en una API REST en Java + Spring Boot que permite realizar operaciones CRUD sobre empleados y departamentos, cumpliendo los requisitos de la prueba técnica.

## 🚀 Funcionalidades

- Crear un empleado
- Crear un departamento
- Listar empleados por departamento
- Obtener un empleado concreto
- Modificar un empleado
- Borrar un empleado

## 🧪 Pruebas de la API

Se incluye un archivo `test-api.http` para probar fácilmente los endpoints desde Visual Studio Code usando la extensión **REST Client**.

## 🗃️ Base de Datos

Se utiliza una base de datos H2 en memoria, accesible en `http://localhost:8080/h2-console`.

## 🧾 Prueba SQL (PL/SQL)

Se incluye el archivo `Prueba_SQL_PL_edgar_nunez.sql` con:

- Definición de tablas `PROVINCIAS`, `MUNICIPIOS`, `USUARIOS`
- Consultas con cursor implícito y explícito
- Paquete PL/SQL `PCK_EJERCICIO_PRUEBA` con la función `F_Municipios_Validos`

## 📦 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## 🧑 Autor

**Edgar Nunez**
