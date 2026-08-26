## Ejercicios para practicar

### I. Ejercicios conceptuales
1. Explica la diferencia entre el patrón Factory y el patrón Decorator. ¿En qué se parecen y en qué se diferencian?
2. ¿Por qué se dice que el patrón Repository "desacopla" la lógica de negocio del acceso a datos?
3. Menciona dos vulnerabilidades del OWASP API Security Top 10 y una recomendación para mitigarlas (OWASP Foundation, 2023).

### II. Ejercicios aplicados
1. Una empresa de e-commerce necesita generar distintos tipos de comprobantes (boleta, factura, nota de crédito) según el tipo de cliente. Propón qué patrón de diseño usarías para esta creación de objetos y justifica tu elección.
2. Diseña la firma de un endpoint `POST /api/pedidos` indicando qué datos de entrada debería validar antes de registrar el pedido.

### III. Mini caso práctico
Continuando con el sistema de seguimiento de pacientes con anemia (ODS 9), el equipo debe registrar nuevos pacientes desde la aplicación web. Consigna: en grupos de 3 a 4 estudiantes, definan (a) qué patrón de diseño aplicarían para la creación de distintos tipos de reportes clínicos, (b) cómo estructurarían el `PacienteRepository`, y (c) qué validaciones de seguridad incluirían en el endpoint `POST /api/pacientes` para prevenir el registro de datos incompletos o maliciosos, siguiendo las recomendaciones de OWASP (2023).

[← Volver al inicio](../../README.md)
