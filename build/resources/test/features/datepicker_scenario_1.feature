@datepicker
Feature: JQuery Datepicker - Escenario 1
  Como usuario de JQuery Datepicker
  Quiero poder seleccionar una fecha del mes actual
  Para poder realizar una reserva de cita

  Scenario: Reserva de una cita seleccionando una fecha en el calendario
    Given que abro la página principal de JQuery Datepicker
    When cambio al iframe donde se encuentra el calendario
    And hago clic en el campo de selección de fecha
    And selecciono el día "15" del mes actual
    Then valido que la fecha seleccionada aparece en el campo de texto
