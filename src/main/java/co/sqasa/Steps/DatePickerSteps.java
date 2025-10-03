package co.sqasa.Steps;

import co.sqasa.pageObjects.Objects;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DatePickerSteps extends ScenarioSteps {

    Objects objects;

    @Step
    public void abrirNavegador() {
        objects.abrirNavegador();
    }

    @Step
    public void navegarAUrl(String url) {
        objects.navegarAUrl(url);
    }

    @Step
    public void cambiarAIframe() {
        objects.cambiarAIframe();
    }

    @Step
    public void hacerClicEnCampoFecha() {
        objects.hacerClicEnCampoFecha();
    }

    @Step
    public void seleccionarDiaMesActual(String dia) {
        objects.seleccionarDiaMesActual(dia);
    }

    @Step
    public void navegarProximoMes() {
        objects.navegarProximoMes();
    }

    @Step
    public void seleccionarDiaProximoMes(String dia) {
        objects.seleccionarDiaProximoMes(dia);
    }

    @Step
    public void validarFechaSeleccionada() {
        objects.validarFechaSeleccionada();
    }

    @Step
    public void intentarIngresarFechaManualmente(String fecha) {
        objects.intentarIngresarFechaManualmente(fecha);
    }

    @Step
    public void validarCampoBloqueado() {
        objects.validarCampoBloqueado();
    }

    @Step
    public void validarSoloCalendario() {
        objects.validarSoloCalendario();
    }

    @Step
    public void cerrarNavegador() {
        objects.cerrarNavegador();
    }
}
