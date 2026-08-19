## Semana 1. Guía de laboratorio / actividad práctica

### Título de la actividad
Configuración del entorno de desarrollo y estructura inicial de un proyecto backend en Java/Spring Boot.

### Objetivo
Configurar correctamente el entorno de desarrollo Java/Spring Boot y generar la estructura inicial de un proyecto backend siguiendo el patrón de arquitectura en capas, exponiendo un primer endpoint REST funcional.

### Competencias que se desarrollan
- Análisis de problemas (identificación de requerimientos técnicos del entorno)
- Diseño y desarrollo de soluciones (estructuración inicial del backend)
- Uso de herramientas (IDE, gestor de dependencias, Spring Initializr)

### Materiales o recursos
- Computadora con JDK 17 (o superior) instalado
- IDE: IntelliJ IDEA o Visual Studio Code con extensiones Java
- Acceso a internet (Spring Initializr: https://start.spring.io)
- Gestor de dependencias Maven o Gradle
- Navegador web o Postman para probar el endpoint

### Procedimiento paso a paso
1. **Verificar el entorno:** confirmar la instalación del JDK ejecutando `java -version` en la terminal.
2. **Generar el proyecto:** ingresar a Spring Initializr, seleccionar Maven, Java, la versión estable de Spring Boot, y agregar la dependencia `Spring Web`, siguiendo el procedimiento oficial de configuración inicial (VMware, Inc., 2025).
3. **Descargar e importar:** descomprimir el proyecto e importarlo en el IDE como proyecto Maven.
4. **Explorar la estructura:** identificar la clase principal (`@SpringBootApplication`), el archivo `pom.xml` y la carpeta `src/main/java`.
5. **Crear los paquetes base:** dentro del paquete principal, crear los subpaquetes `controller`, `service`, `repository` y `model`, anticipando la arquitectura en capas que se profundizará en las siguientes semanas.
6. **Crear un controlador REST inicial:** implementar una clase anotada con `@RestController` que exponga un endpoint `GET /api/saludo` devolviendo un mensaje de texto o JSON simple.
7. **Ejecutar la aplicación:** correr la clase principal y verificar en el navegador o Postman que el endpoint responde correctamente en `http://localhost:8080/api/saludo`.
8. **Documentar la evidencia:** capturar pantalla de la estructura del proyecto y de la respuesta del endpoint.

### Producto esperado
Proyecto Spring Boot funcional, con la estructura de paquetes por capas creada y un endpoint REST inicial operativo, junto con evidencia (capturas) de su ejecución.

### Preguntas de análisis o reflexión
- ¿Qué ventajas identificas al organizar el proyecto en paquetes por capa desde el inicio?
- ¿Qué ocurriría si todo el código estuviera en una sola clase o paquete?
- ¿Cómo se relaciona el endpoint que creaste con el concepto de arquitectura cliente-servidor?

### Criterios de evaluación
| Criterio | Descripción |
|---|---|
| Configuración del entorno | El JDK y el proyecto Spring Boot fueron configurados correctamente. |
| Estructura por capas | Se crearon los paquetes controller/service/repository/model de forma coherente. |
| Endpoint funcional | El endpoint REST responde correctamente al ser probado. |
| Documentación de evidencia | Se presentan capturas claras del proceso y resultado. |
| Reflexión técnica | Las respuestas a las preguntas de análisis muestran comprensión conceptual. |

---

## Ejercicios para estudiantes

### I. Ejercicios conceptuales
1. Explica con tus propias palabras la diferencia entre arquitectura N-capas y patrón MVC. ¿Son lo mismo? Justifica tu respuesta.
2. Enumera los verbos HTTP más usados en servicios REST e indica a qué operación CRUD corresponde cada uno.
3. ¿Qué rol cumple HTML/CSS dentro de una arquitectura MVC del lado del servidor?

### II. Ejercicios aplicados
1. Una empresa de logística necesita un sistema para consultar el estado de sus envíos desde una app móvil y desde una web. Propón, en un diagrama simple, cómo estructurarías la arquitectura cliente-servidor y en qué capa ubicarías la lógica de cálculo de tiempos de entrega.
2. Diseña la firma (nombre y verbo HTTP) de tres endpoints REST necesarios para gestionar un CRUD básico de "empleados" en un sistema de recursos humanos.

### III. Mini caso práctico
Una startup de salud digital está diseñando el backend de una aplicación para el seguimiento de pacientes con anemia en postas médicas rurales (vinculado al ODS 9). El equipo técnico debe decidir, desde la primera semana del proyecto, cómo organizar su backend en Java/Spring Boot.

**Consigna:** en los grupos conformados para el proyecto, propongan la estructura de capas (controller, service, repository, model) que usarían, identifiquen qué información viajaría por un endpoint REST típico del sistema (por ejemplo, registrar un nuevo paciente), y sustenten brevemente por qué esa organización favorece la mantenibilidad del proyecto a lo largo del semestre.
