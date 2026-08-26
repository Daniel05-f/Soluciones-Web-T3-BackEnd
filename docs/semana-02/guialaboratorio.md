## Semana 2. Guía de laboratorio / actividad práctica

### Título de la actividad
Implementación de patrones de diseño (Singleton, Factory, Decorator, Repository) y construcción de un servicio REST con métodos GET y POST en Spring Boot.

### Objetivo
Aplicar los patrones de diseño Singleton, Factory, Decorator y Repository en el backend del proyecto, y construir un controlador REST con métodos GET y POST que exponga la entidad definida, aplicando recomendaciones básicas de seguridad.

### Competencias que se desarrollan
- Análisis de problemas (modelado del proceso y definición de requerimientos funcionales)
- Diseño y desarrollo de soluciones (aplicación de patrones de diseño y construcción del CRUD parcial)
- Uso de herramientas (Spring Boot, Spring Data JPA)

### Materiales o recursos
- Proyecto Spring Boot configurado en la Semana 1
- IDE (IntelliJ IDEA o VS Code)
- Postman o navegador para probar los endpoints
- Documentación oficial de Spring Boot y Spring Data JPA (VMware, Inc., 2025; Spring Data JPA Team, 2025)

### Procedimiento paso a paso
1. **Modelar el proceso:** en equipo, definan brevemente el proceso a automatizar en su proyecto y listen 3 a 5 requerimientos funcionales.
2. **Crear la entidad:** definan una clase anotada con `@Entity` que represente el recurso principal del proceso modelado.
3. **Implementar el Repository:** creen una interfaz que extienda `JpaRepository<Entidad, Long>` (Spring Data JPA Team, 2025).
4. **Implementar el Service:** creen una clase `@Service` que use el repositorio y contenga la lógica de negocio básica.
5. **Aplicar un patrón Singleton:** creen una clase de configuración (por ejemplo, de parámetros generales del sistema) que garantice una única instancia.
6. **Aplicar un patrón Factory:** implementen una clase fábrica que decida, según un parámetro, qué tipo de objeto relacionado crear.
7. **Aplicar un patrón Decorator:** añadan una funcionalidad adicional a un objeto existente sin modificar su clase original.
8. **Construir el controlador:** implementen un `@RestController` con un método `@GetMapping` para listar/consultar y un método `@PostMapping` para registrar un nuevo recurso.
9. **Aplicar seguridad básica:** validen los datos de entrada del método POST (por ejemplo, campos obligatorios) siguiendo las recomendaciones de OWASP (2023).
10. **Probar los endpoints:** ejecuten la aplicación y verifiquen ambos métodos con Postman o el navegador.

### Producto esperado
Proyecto Spring Boot con los cuatro patrones de diseño implementados, entidad y repositorio funcionales, y un controlador con métodos GET y POST operativos, incluyendo validación básica de datos de entrada.

### Preguntas de análisis o reflexión
- ¿Por qué el patrón Repository facilita el cambio futuro del motor de base de datos?
- ¿Qué riesgo de seguridad existiría si el método POST no validara los datos recibidos?
- ¿En qué otro punto de tu proyecto podrías aplicar el patrón Decorator?

### Criterios de evaluación
| Criterio | Descripción |
|---|---|
| Modelado del proceso | Se identificaron con claridad los requerimientos funcionales del proceso elegido. |
| Implementación de patrones | Los cuatro patrones (Singleton, Factory, Decorator, Repository) están correctamente aplicados. |
| Endpoints funcionales | Los métodos GET y POST responden correctamente y devuelven los datos esperados. |
| Validación y seguridad | Se aplicó al menos una validación de entrada alineada a buenas prácticas de seguridad. |
| Reflexión técnica | Las respuestas a las preguntas de análisis evidencian comprensión conceptual. |

## Tarea de la semana
Para aplicar lo aprendido, resuelve los [ejercicios de esta semana](ejercicios.md).
