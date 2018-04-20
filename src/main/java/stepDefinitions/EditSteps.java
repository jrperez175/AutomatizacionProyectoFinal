package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import configuration.ShareDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.EditPage;
import pages.IndexPage;
import pages.RegisterPage;
import pages.HomePage;

public class EditSteps {

	WebDriver driver;
	HomePage startpage;
	IndexPage indexpage;
	EditPage editpage;
	RegisterPage registerpage;
	
	   
    @And ("el usuario hace click en la opcion Editar (.*)")
    public void usuarioHaceClicOpcionEditar(String identificacion) {
		indexpage.usuarioClicOpcionEditUsario(identificacion);
	}
    
    @And ("el usuario digita Identificacion (.*)")
    public void usuarioIngresaIdentificaion(String identificacion) {
		registerpage.usuarioIngresaIdentificacion(identificacion);
	}
    @And ("el usuario digita Razon Social (.*)")
    public void usuarioIngresaRazonSocial(String razon) {
		registerpage.usuarioIngresaRazonSocial(razon);
	}
    
    @And ("el usuario digita Ciudad (.*)")
    public void usuarioIngresaCiudad(String ciudad) {
		registerpage.usuarioIngresaCiudad(ciudad);
	}
    
    @And ("el usuario digita Tipo de Cliente (.*)")
    public void usuarioIngresaTipoCliente(String tipo) {
		registerpage.usuarioIngresaTipoCliente(tipo);
	}
    
    @And ("el usuario digita Nivel de Riesgo (.*)")
    public void usuarioIngresaNivelRiesgo(String nivel) {
		registerpage.usuarioIngresaTipoNivelRiesgo(nivel);
	}
    
    @And ("el usuario realiza click en el boton Save")
    public void usuarioHaceClicBotonSave() {
		editpage.usuarioClicBotonEdit();
	}
    
    
    @Then ("validacion exitosa Modificacion de la razon social (.*) del id (.*)$")
    public void validacionExitosa(String razon, String identificacion) throws InterruptedException {
    	Thread.sleep(3000);
    	String resultado = indexpage.validarCampoModificado(identificacion);
    	assertEquals(razon, resultado);
    }
	
	public EditSteps(ShareDriver sharedriver,HomePage startpage, RegisterPage registerpage, EditPage editpage, IndexPage indexpage ) {
		driver = sharedriver;
		this.startpage = startpage;
		this.registerpage = registerpage;
		this.editpage = editpage;
		this.indexpage = indexpage;
		
	}
	
	
	
}
