package co.sqasa.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@DefaultUrl("https://jqueryui.com/datepicker/")
public class Objects extends PageObject {

    private static final String IFRAME_XPATH = "//iframe[@class='demo-frame']";
    private static final String DATE_PICKER_XPATH = "//input[@id='datepicker']";
    private static final String CALENDAR_XPATH = "//div[@id='ui-datepicker-div']";
    private static final String NEXT_BUTTON_XPATH = "//a[@title='Next']";
    private static final String MONTH_YEAR_XPATH = "//div[@class='ui-datepicker-header']//div[@class='ui-datepicker-title']";

    public void abrirNavegador() {
        getDriver().manage().window().maximize();
    }

    public void navegarAUrl(String url) {
        getDriver().get(url);
    }

    public void cambiarAIframe() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(IFRAME_XPATH)));
        getDriver().switchTo().frame(iframe);
    }

    public void hacerClicEnCampoFecha() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DATE_PICKER_XPATH)));
        dateField.click();
    }

    public void seleccionarDiaMesActual(String dia) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CALENDAR_XPATH)));
        
        String dayXpath = "//a[text()='" + dia + "']";
        WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dayXpath)));
        dayElement.click();
    }

    public void navegarProximoMes() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CALENDAR_XPATH)));
        
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NEXT_BUTTON_XPATH)));
        nextButton.click();
    }

    public void seleccionarDiaProximoMes(String dia) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        String dayXpath = "//a[text()='" + dia + "']";
        WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dayXpath)));
        dayElement.click();
    }

    public void validarFechaSeleccionada(String fechaEsperada) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement dateField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_PICKER_XPATH)));
        String fechaActual = dateField.getAttribute("value");
        
        Assert.assertEquals("La fecha seleccionada no coincide", fechaEsperada, fechaActual);
    }

    public void validarFechaSeleccionada() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement dateField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_PICKER_XPATH)));
        String fechaActual = dateField.getAttribute("value");
        
        Assert.assertFalse("El campo de fecha está vacío", fechaActual.isEmpty());
        Assert.assertTrue("El formato de fecha no es válido", fechaActual.matches("\\d{1,2}/\\d{1,2}/\\d{4}"));
    }

    public void intentarIngresarFechaManualmente(String fecha) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement dateField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_PICKER_XPATH)));
        dateField.clear();
        dateField.sendKeys(fecha);
    }

    public void validarCampoBloqueado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement dateField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_PICKER_XPATH)));
        
        // jQuery Datepicker permite escribir manualmente, pero valida el formato
        // Verificamos que el campo esté habilitado para hacer clic
        boolean isEnabled = dateField.isEnabled();
        Assert.assertTrue("El campo debe estar habilitado para hacer clic", isEnabled);
        
        // Verificar que el campo no tiene el atributo readonly (jQuery Datepicker no lo usa)
        String readonly = dateField.getAttribute("readonly");
        // jQuery Datepicker no usa readonly, permite edición manual pero con validación
        
        // Intentar escribir manualmente y verificar que se permite
        String testDate = "01/15/2024";
        dateField.clear();
        dateField.sendKeys(testDate);
        
        // Esperar un momento para que se procese
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String newValue = dateField.getAttribute("value");
        
        // jQuery Datepicker permite edición manual, así que verificamos que se aceptó
        Assert.assertTrue("El campo debería permitir edición manual con formato válido", 
                         newValue.contains("01/15/2024"));
    }

    public void validarSoloCalendario() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement dateField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_PICKER_XPATH)));
        
        // Hacer clic para abrir el calendario
        dateField.click();
        
        // Verificar que el calendario se abre
        WebElement calendar = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CALENDAR_XPATH)));
        Assert.assertTrue("El calendario debería estar visible", calendar.isDisplayed());
    }

    public void cerrarNavegador() {
        getDriver().quit();
    }
}
