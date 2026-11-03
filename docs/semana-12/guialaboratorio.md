[← Volver al inicio](../../README.md)

## Semana 4. Guía de laboratorio / actividad práctica

### Título de la actividad
Implementación de un CRUD completo con `JpaRepository`, consultas JPQL y Named Queries seguras frente a inyección SQL.

### Objetivo
Completar las operaciones CRUD del proyecto usando `JpaRepository`, implementar una consulta JPQL y una Named Query, y aplicar parámetros nombrados para prevenir la inyección SQL.

### Competencias que se desarrollan
- Análisis de problemas (redacción de criterios de aceptación verificables)
- Diseño y desarrollo de soluciones (implementación del CRUD completo y consultas personalizadas)
- Uso de herramientas (Spring Data JPA, control de versiones para organizar el sprint)

### Materiales o recursos
- Proyecto Spring Boot con entidad, repositorio y conexión a base de datos (Semana 3)
- IDE y Postman
- Documentación oficial de Spring Data JPA (Spring Data JPA Team, 2025)
- Plantilla de historia de usuario con criterios de aceptación

### Procedimiento paso a paso
1. **Redactar el Sprint Backlog:** seleccionen 2 a 3 historias de usuario del proyecto y redacten sus criterios de aceptación en formato SMART (Agile Academy, 2025).
2. **Completar el método `show`:** implementen `findById()` en el controlador para consultar un recurso específico.
3. **Completar el método `create`:** verifiquen o implementen el método POST usando `save()`.
4. **Implementar el método `update`:** usen `save()` sobre una entidad existente para actualizar sus datos.
5. **Implementar el método `delete`:** usen `deleteById()` para eliminar un recurso.
6. **Escribir una consulta JPQL:** definan un método en el repositorio usando `@Query` con parámetros nombrados (por ejemplo, buscar por un atributo específico) (LearnHubly, 2026).
7. **Definir una Named Query:** agreguen una anotación `@NamedQuery` en la entidad para una consulta de uso frecuente del proyecto.
8. **Verificar la seguridad de las consultas:** revisen que ninguna consulta concatene directamente valores de entrada del usuario; todas deben usar parámetros nombrados.
9. **Probar el CRUD completo:** ejecuten la aplicación y verifiquen las cuatro operaciones con Postman, incluyendo la consulta JPQL y la Named Query.

### Producto esperado
Proyecto Spring Boot con CRUD completo (GET, POST, PUT/actualización, DELETE) funcionando, una consulta JPQL y una Named Query implementadas con parámetros nombrados, y un Sprint Backlog breve con criterios de aceptación redactados.

### Preguntas de análisis o reflexión
- ¿Por qué un criterio de aceptación ambiguo puede generar retrabajo en un sprint?
- ¿Qué diferencia existe entre una consulta JPQL escrita con `@Query` y una Named Query?
- ¿Qué pasaría si tu consulta JPQL concatenara directamente el texto ingresado por el usuario? Da un ejemplo de cómo lo explotaría un atacante.

### Criterios de evaluación
| Criterio | Descripción |
|---|---|
| Sprint Backlog | Las historias de usuario tienen criterios de aceptación claros y verificables. |
| CRUD completo | Las cuatro operaciones (Create, Read, Update, Delete) funcionan correctamente. |
| Consultas personalizadas | La consulta JPQL y la Named Query están correctamente implementadas. |
| Seguridad de las consultas | Todas las consultas usan parámetros nombrados, sin concatenación de texto de entrada. |
| Reflexión técnica | Las respuestas evidencian comprensión de los riesgos de inyección SQL y su prevención. |

## Tarea de la semana
Para aplicar lo aprendido, resuelve los [ejercicios de esta semana](ejercicios.md).
