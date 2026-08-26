[← Volver al inicio](../../README.md)

## Semana 3. Guía de laboratorio / actividad práctica

### Título de la actividad
Diseño técnico de endpoints REST y construcción de la capa de persistencia con JPA, Entity Manager y Repository.

### Objetivo
Diseñar técnicamente los endpoints REST del proyecto a partir de sus requerimientos funcionales, e implementar la capa de persistencia mediante entidades JPA, acceso con `EntityManager` y el patrón Repository, conectando la aplicación a una base de datos.

### Competencias que se desarrollan
- Análisis de problemas (traducción de requerimientos a diseño técnico)
- Diseño y desarrollo de soluciones (implementación de la capa de persistencia)
- Uso de herramientas (Spring Data JPA, motor de base de datos, IDE)

### Materiales o recursos
- Proyecto Spring Boot con controlador, servicio y patrones ya implementados (Semana 2)
- Motor de base de datos (MySQL, PostgreSQL o H2 en memoria para pruebas)
- IDE y Postman
- Documentación oficial de Jakarta Persistence y Spring Data JPA (Jakarta EE Working Group, 2024; Spring Data JPA Team, 2025)

### Procedimiento paso a paso
1. **Diseñar el endpoint:** a partir de un requerimiento funcional de su proyecto, especifiquen el recurso, el verbo HTTP, la ruta y la estructura de datos de entrada/salida.
2. **Configurar la conexión a la base de datos:** agreguen en `application.properties` el driver, la URL, el usuario y la contraseña del motor elegido (VMware, Inc., 2025).
3. **Definir la entidad:** creen una clase anotada con `@Entity` y `@Id` que represente el recurso principal, con sus atributos mapeados.
4. **Implementar el Repository:** creen una interfaz que extienda `JpaRepository<Entidad, Long>` (Spring Data JPA Team, 2025).
5. **Usar el Entity Manager (alternativa manual):** en un método de prueba o servicio, inyecten `EntityManager` y utilicen `persist()` para guardar una instancia de la entidad (Jakarta EE Working Group, 2024).
6. **Conectar el endpoint con la persistencia:** modifiquen el controlador y el servicio de la Semana 2 para que el método POST guarde el dato mediante el Repository, y el método GET lo consulte.
7. **Probar la persistencia:** ejecuten la aplicación, registren un dato mediante Postman y verifiquen que se guardó correctamente consultándolo con GET.
8. **Documentar el diseño técnico:** elaboren una tabla breve con los endpoints diseñados (recurso, verbo, ruta, entrada, salida).

### Producto esperado
Documento breve de diseño técnico de al menos dos endpoints, y proyecto Spring Boot con la entidad, el repositorio y la conexión a base de datos funcionando, evidenciado con un registro persistido y consultado correctamente.

### Preguntas de análisis o reflexión
- ¿Qué riesgos de proyecto se hubieran evitado si el diseño técnico de la API se hubiera hecho antes de programar?
- ¿Qué diferencia práctica existe entre usar `EntityManager` directamente y usar `JpaRepository`?
- ¿Qué pasaría si la configuración de conexión a la base de datos tuviera un error? ¿En qué fase de PMI se debería haber previsto ese riesgo?

### Criterios de evaluación
| Criterio | Descripción |
|---|---|
| Diseño técnico | Los endpoints están correctamente especificados (recurso, verbo, entrada, salida). |
| Entidad y mapeo | La entidad JPA está correctamente definida y mapeada. |
| Persistencia funcional | El registro se guarda y se consulta correctamente desde la base de datos. |
| Conexión a base de datos | La configuración de conexión es correcta y funcional. |
| Reflexión técnica | Las respuestas evidencian comprensión de la relación entre gestión de proyecto y diseño técnico. |

## Tarea de la semana
Para aplicar lo aprendido, resuelve los [ejercicios de esta semana](ejercicios.md).
