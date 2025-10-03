# Prueba Técnica de Automatización - JQuery Datepicker

## Descripción
Esta prueba técnica implementa automatización de pruebas usando SerenityBDD + Cucumber + POM para automatizar la página JQuery Datepicker.

## URL de la página a automatizar
https://jqueryui.com/datepicker/

## Escenarios implementados

### Escenario 1: Reserva de una cita seleccionando una fecha en el calendario
- Abrir la página principal de JQuery Datepicker
- Cambiar al iframe donde se encuentra el calendario
- Hacer clic en el campo de selección de fecha
- Seleccionar el día 15 del mes actual
- Validar que la fecha seleccionada aparece en el campo de texto

### Escenario 2: Selección de una fecha específica en un mes diferente
- Abrir la página principal de JQuery Datepicker
- Cambiar al iframe donde se encuentra el calendario
- Hacer clic en el campo de selección de fecha
- Navegar hasta el próximo mes
- Seleccionar el día 10 del próximo mes
- Validar que la fecha seleccionada aparece en el campo de texto

### Escenario 3: Validación de campo bloqueado
- Abrir la página principal de JQuery Datepicker
- Intentar ingresar una fecha manualmente en el campo de texto
- Validar que no se permite la edición manual y que solo es posible seleccionar una fecha desde el calendario

## Tecnologías utilizadas
- Java
- SerenityBDD
- Cucumber
- POM (Page Object Model)
- Selenium WebDriver
- Gradle
- ChromeDriver

## Estructura del proyecto
```
Reto_Tecnico/
├── src/main/java/co/sqasa/
│   ├── pageObjects/Objects.java          # Page Objects
│   └── Steps/DatePickerSteps.java        # Steps de Serenity
├── test/java/co/sqasa/
│   ├── StepDef/TestStepDefinition.java   # Step Definitions de Cucumber
│   └── runners/testRunner.java           # Runner de Cucumber
├── test/resources/features/
│   ├── datepicker_scenario_1.feature     # Feature Escenario 1
│   ├── datepicker_scenario_2.feature     # Feature Escenario 2
│   └── datepicker_scenario_3.feature     # Feature Escenario 3
├── serenity.properties                   # Configuración de Serenity
└── build.gradle                          # Configuración de Gradle
```

## Comandos de ejecución

### Compilar el proyecto
```bash
.\gradlew.bat build
```

### Ejecutar todas las pruebas
```bash
.\gradlew.bat test
```

### Ejecutar pruebas específicas
```bash
.\gradlew.bat test --tests "*testRunner*"
```

### Generar reportes de Serenity
```bash
.\gradlew.bat aggregate
```

## Configuración requerida

### Java
- JDK 8 o superior
- JAVA_HOME configurado

### ChromeDriver
- Descargar desde https://chromedriver.chromium.org/
- Colocar en la carpeta `driver/`
- Configurar la ruta en `serenity.properties`

### Dependencias
- Gradle 9.0 o superior
- SerenityBDD 2.0.80
- Cucumber 1.9.45
- Selenium 3.141.59

## Reportes
Los reportes de Serenity se generan en la carpeta `target/site/serenity/` después de ejecutar `.\gradlew.bat aggregate`.

## Autor
Implementado como parte de la prueba técnica para Ingeniero de Automatización.

## Entrega
- URL del repositorio: [URL del repositorio]
- Imagen del reporte HTML de SerenityBDD con los escenarios ejecutándose correctamente
