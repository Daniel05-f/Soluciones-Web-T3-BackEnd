[← Volver al inicio](../../README.md)

## Ejercicios para practicar

### II Ejercicios conceptuales
1. Explica la diferencia entre el Product Backlog y el Sprint Backlog.
2. ¿Por qué se dice que los criterios de aceptación deben ser "verificables"? Da un ejemplo de uno que no lo sea y corrígelo.
3. Explica con tus propias palabras por qué concatenar texto de entrada del usuario dentro de una consulta JPQL es una mala práctica de seguridad (LearnHubly, 2026).

### II Ejercicios aplicados
1. Redacta una historia de usuario para un sistema de biblioteca ("como usuario, quiero...") junto con dos criterios de aceptación en formato SMART.
2. Escribe una consulta JPQL segura (con parámetro nombrado) que busque todos los libros de un autor específico.

### III Mini caso práctico
El equipo del sistema de seguimiento de pacientes con anemia (ODS 9) planifica su Sprint 3, que incluye la historia de usuario "como personal de salud, quiero consultar los pacientes con niveles críticos de hemoglobina para priorizar su atención". Consigna: en grupos de 3 a 4 estudiantes, (a) redacten el criterio de aceptación de esta historia de usuario, (b) diseñen la Named Query necesaria para resolverla, y (c) expliquen qué riesgo de seguridad existiría si esta consulta se implementara concatenando directamente el valor del umbral ingresado por el usuario.