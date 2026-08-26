## Ejercicios para practicar

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

[← Volver al inicio](../../README.md)
