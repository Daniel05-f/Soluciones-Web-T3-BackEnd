# Sistema Web para gestión de citas médicas - Backend

Si su IDE no incluye un generator para Spring Boot use [Spring Initializr](https://start.spring.io/)

Backend para la aplicación web de citas médicas, el frontend está desarrollado en Angular 22.

Este proyecto es desarrollado como parte del curso Soluciones Web y Aplicaciones Distribuidas con NRC 16045, correspondiente al período UPN 2026-2

- ARQUITECTURA: n-capas

## Configuración
- Project: Maven
- Language: Java
- Spring Boot: 4.1.1
- Packaging: jar
- Java: 25
- Archivo de configuración: application.properties

La API debe evolucionar según el modelo de madurez de Richardson, revise la documentación de [Richardson Maturity Model](https://martinfowler.com/articles/richardsonMaturityModel.html) según Martin Fowler

## Recomendaciones
Cuando clone el proyecto revise los siguientes archivos de configuración:
- `application.properties` para validar puertos en los que ejecuta la aplicación, base de datos, usuario y contraseña de la base de datos
- `pom.xml` dependencias y sus versiones que se usan en el proyecto

## Guías de Laboratorio
- [Semana 1: Estructura inicial del proyecto backend](docs/semana-01/guialaboratorio.md)
- [Semana 2: Patrones de diseño:Inyección de dependencias, Singleton](docs/semana-02/guialaboratorio.md)
- [Semana 3: JPA y conexión a base de datos](docs/semana-03/guialaboratorio.md)

## Documentación General
- [Conexión a Base de datos](docs/general/basededatos.md)
- [Modelo de madurez Richardson](docs/general/modelomadurez.md)

