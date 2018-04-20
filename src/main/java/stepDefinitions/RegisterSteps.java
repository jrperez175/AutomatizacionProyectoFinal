package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import configuration.ShareDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.IndexPage;
import pages.RegisterPage;
import pages.HomePage;

public class RegisterSteps {

	WebDriver driver;
	HomePage startpage;
	RegisterPage registerpage;
	IndexPage indexpage;
	
	
    @And ("el usuario realiza click en la opcion Create New")
    public void usuarioHaceClicOpcionCreateNew() {
		indexpage.usuarioClicOpcionCrearManageCustomers();
	}
    
    @And ("el usuario ingresa Identificacion (.*)")
    public void usuarioIngresaIdentificaion(String identificacion) {
		registerpage.usuarioIngresaIdentificacion(identificacion);
	}
    @And ("el usuario ingresa Razon Social (.*)")
    public void usuarioIngresaRazonSocial(String razon) {
		registerpage.usuarioIngresaRazonSocial(razon);
	}
    
    @And ("el usuario ingresa Ciudad (.*)")
    public void usuarioIngresaCiudad(String ciudad) {
		registerpage.usuarioIngresaCiudad(ciudad);
	}
    
    @And ("el usuario ingresa Tipo de Cliente (.*)")
    public void usuarioIngresaTipoCliente(String tipo) {
		registerpage.usuarioIngresaTipoCliente(tipo);
	}
    
    @And ("el usuario ingresa Nivel de Riesgo (.*)")
    public void usuarioIngresaNivelRiesgo(String nivel) {
		registerpage.usuarioIngresaTipoNivelRiesgo(nivel);
	}
    
    @And ("el usuario realiza click en el boton Create")
    public void usuarioHaceClicBotonCreate() {
		registerpage.usuarioClicBotonCrear();
	}
    
    
    @Then ("validacion exitosa Creacion (.*)")
    public void usuarioCreaCuentaExitosa(String identificacion) throws InterruptedException {
    	Thread.sleep(3000);
    	String resultado = indexpage.validacionExitosa(identificacion);
    	assertEquals(identificacion, resultado);
    }
	
	public RegisterSteps(ShareDriver sharedriver,HomePage startpage, RegisterPage registerpage, IndexPage indexpage ) {
		driver = sharedriver;
		this.startpage = startpage;
		this.registerpage = registerpage;
		this.indexpage = indexpage;
		
	}
	
	
	
}
