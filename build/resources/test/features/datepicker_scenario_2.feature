@datepicker
Feature: JQuery Datepicker - Escenario 2
  Como usuario de JQuery Datepicker
  Quiero poder seleccionar una fecha de un mes diferente
  Para poder programar citas futuras

  Scenario: Selección de una fecha específica en un mes diferente
    Given que abro la página principal de JQuery Datepicker
    When cambio al iframe donde se encuentra el calendario
    And hago clic en el campo de selección de fecha
    And navego hasta el próximo mes
    And selecciono el día "10" del próximo mes
    Then valido que la fecha seleccionada aparece en el campo de texto
