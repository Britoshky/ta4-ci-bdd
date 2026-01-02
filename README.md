# Taller TA_4 — Automatización de Pruebas (Unidad II)

## Objetivo
Implementar un flujo profesional de automatización de pruebas en Java con Maven, incorporando:
- Control de versiones (Git) con ramas y commits frecuentes
- Tests unitarios atómicos (JUnit)
- BDD con Cucumber (Gherkin + Steps + Helpers)
- Pipeline CI (GitHub Actions) con ejecución automática
- Reporting navegable (HTML) y artifacts
- Prueba básica de performance (k6) con umbrales

## ¿Qué es Integración Continua (CI) y beneficios?
CI es la práctica de integrar cambios frecuentemente al repositorio y validar automáticamente mediante build + pruebas, entregando feedback rápido y evitando acumulación de defectos.

## Flujo Git (ramas y commits)
- main: rama estable
- feature/primer-test: desarrollo inicial

> Adjuntar capturas: git init, creación de ramas y git log

## Estructura del proyecto
- src/main/java: código base (Calculator, AuthService, SimpleLoginServer)
- src/test/java/unit: pruebas unitarias (SumaTest, RestaTest)
- src/test/resources/features: escenarios Gherkin
- src/test/java/bdd: runner + steps + helpers
- perf/: script k6
- .github/workflows/ci.yml: pipeline CI

## Atomicidad de tests
Cada test valida un solo comportamiento y no depende de otros, facilitando diagnóstico y ejecución repetible.

## Ejecución local
```bash
mvn clean test
```

## CI (GitHub Actions)
El pipeline se ejecuta en cada push/PR:
- Checkout + setup Java + cache Maven
- Build + ejecución de unit tests y BDD (genera reportes)
- Levanta servidor local y ejecuta k6 con thresholds
- Publica artifacts: surefire-reports y cucumber-html-report

## Reportes y evidencias
- Unit tests: target/surefire-reports (artifact en Actions)
- BDD: target/cucumber-html-report (artifact en Actions)
- Performance: salida del job + thresholds (falla si excede)

## Dashboard y alertas (simulación)
- Dashboard: pestaña Actions + artifacts + historial de ejecuciones/tiempos (tendencia).
- Alertas: notificación automática por email de GitHub al fallar el workflow; adicionalmente se podría integrar Slack via webhook (descrito en docs).

## Capturas requeridas (checklist)
- mvn test local (BUILD SUCCESS)
- git branch y git log (≥3 commits)
- workflow run exitoso en GitHub Actions
- artifacts publicados (surefire + cucumber report)
- ejecución de k6 con thresholds

---

## Evidencias
Las capturas de pantalla se encuentran en la carpeta `evidencias/`.

## Referencias
- Material ME_3 y ME_4
- Documentación oficial de Maven, JUnit, Cucumber, k6, GitHub Actions
