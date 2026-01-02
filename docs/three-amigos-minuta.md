# Minuta Three Amigos

## Funcionalidad: Login simple (usuario/contraseña)

### Roles:
- **Negocio/PO:** Define reglas (“usuario válido entra”, “inválido ve error”)
- **QA:** Define criterios de aceptación y ejemplos
- **Dev:** Define comportamiento y cómo automatizar

### Criterios de aceptación (AC):
- Si user=admin y pass=1234 ⇒ login exitoso
- Cualquier otra combinación ⇒ login rechazado con mensaje “Credenciales inválidas”

### Ejemplos discutidos:
- admin/1234 (ok)
- admin/0000 (fail)
- user/1234 (fail)