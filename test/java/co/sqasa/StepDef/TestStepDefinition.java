package co.sqasa.StepDef;

import co.sqasa.Steps.DatePickerSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestStepDefinition {

    @Steps
    DatePickerSteps steps;

    // Pasos comunes
    @Given("^que abro el navegador$")
    public void queAbroElNavegador() {
        steps.abrirNavegador();
    }

    @Given("^que abro la página principal de JQuery Datepicker$")
    public void queAbroLaPáginaPrincipalDeJQueryDatepicker() {
        steps.abrirNavegador();
        steps.navegarAUrl("https://jqueryui.com/datepicker/");
    }

    @When("^cambio al iframe donde se encuentra el calendario$")
    public void cambioAlIframeDondeSeEncuentraElCalendario() {
        steps.cambiarAIframe();
    }

    @When("^hago clic en el campo de selección de fecha$")
    public void hagoClicEnElCampoDeSelecciónDeFecha() {
        steps.hacerClicEnCampoFecha();
    }

    // Escenario 1 - Seleccionar día del mes actual
    @When("^selecciono el día \"([^\"]*)\" del mes actual$")
    public void seleccionoElDíaDelMesActual(String dia) {
        steps.seleccionarDiaMesActual(dia);
    }

    // Escenario 2 - Navegar al próximo mes
    @When("^navego hasta el próximo mes$")
    public void navegoHastaElPróximoMes() {
        steps.navegarProximoMes();
    }

    @When("^selecciono el día \"([^\"]*)\" del próximo mes$")
    public void seleccionoElDíaDelPróximoMes(String dia) {
        steps.seleccionarDiaProximoMes(dia);
    }

    // Escenario 3 - Validación de campo bloqueado
    @When("^intento ingresar una fecha manualmente en el campo de texto \"([^\"]*)\"$")
    public void intentoIngresarUnaFechaManualmenteEnElCampoDeTexto(String fecha) {
        steps.intentarIngresarFechaManualmente(fecha);
    }

    // Validaciones comunes
    @Then("^valido que la fecha seleccionada aparece en el campo de texto$")
    public void validoQueLaFechaSeleccionadaApareceEnElCampoDeTexto() {
        steps.validarFechaSeleccionada();
    }

    @Then("^valido que el campo permite edición manual con formato válido$")
    public void validoQueElCampoPermiteEdiciónManualConFormatoVálido() {
        steps.validarCampoBloqueado();
    }

    @Then("^valido que es posible seleccionar una fecha desde el calendario$")
    public void validoQueEsPosibleSeleccionarUnaFechaDesdeElCalendario() {
        steps.validarSoloCalendario();
    }

    @Then("^cierro el navegador$")
    public void cierroElNavegador() {
        steps.cerrarNavegador();
    }
}
