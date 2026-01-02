Feature: Login
  Como usuario del sistema
  Quiero iniciar sesión
  Para acceder a funcionalidades protegidas

  Scenario: Login exitoso con credenciales válidas
    Given que tengo el usuario "admin" y la contraseña "1234"
    When intento iniciar sesión
    Then el resultado del login debe ser "exitoso"

  Scenario Outline: Login falla con combinaciones inválidas
    Given que tengo el usuario "<user>" y la contraseña "<pass>"
    When intento iniciar sesión
    Then el resultado del login debe ser "fallido"

    Examples:
      | user  | pass |
      | admin | 0000 |
      | user  | 1234 |
      | test  | test |