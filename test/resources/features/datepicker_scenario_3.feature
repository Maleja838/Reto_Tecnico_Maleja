@datepicker
Feature: JQuery Datepicker - Escenario 3
  Como usuario de JQuery Datepicker
  Quiero validar que el campo esté bloqueado para edición manual
  Para asegurar que solo se pueda seleccionar fechas desde el calendario

  Scenario: Validación de campo bloqueado
    Given que abro la página principal de JQuery Datepicker
    When cambio al iframe donde se encuentra el calendario
    And intento ingresar una fecha manualmente en el campo de texto "01/15/2024"
    Then valido que el campo permite edición manual con formato válido
    And valido que es posible seleccionar una fecha desde el calendario
