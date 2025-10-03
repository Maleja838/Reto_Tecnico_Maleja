Feature: Verificación básica del sistema
  Como usuario
  Quiero poder verificar que el sistema funciona
  Para asegurarme de que la automatización está configurada correctamente

  Scenario: Verificar que el navegador se abre correctamente
    Given que abro el navegador
    When navego a la página "https://www.google.com"
    Then debería ver la página de Google
    And cierro el navegador
