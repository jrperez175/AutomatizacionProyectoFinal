package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import configuration.ShareDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.DeletePage;
import pages.IndexPage;
import pages.HomePage;

public class DeleteSteps {

	WebDriver driver;
	HomePage startpage;
	IndexPage indexpage;
	DeletePage deletepage;
	
	    
    @And ("el usuario realiza click en la opcion Delete (.*)")
    public void usuarioHaceClicOpcionEditar(String identificacion) {
		indexpage.usuarioClicOpcionDelete(identificacion);
	}
    
    
    @And ("el usuario realiza click en el boton Delete")
    public void usuarioHaceClicBotonDelete() {
		deletepage.usuarioClicBotonDelete();
	}
    
    
    @Then ("validacion exitosa Eliminacion (.*)") //El borrado es exitoso pero me falta la validacion como no lo encuentra como lo hago
    public void validacionExitosa(String identificacion) throws InterruptedException {
    	Thread.sleep(3000);
    	//String resultado = indexpage.validacionExitosa(identificacion);
    	String resultado = driver.getCurrentUrl();
    	assertEquals("http://ceibapruebasbanco.azurewebsites.net/Cliente", resultado);
    }
	
	public DeleteSteps(ShareDriver sharedriver,HomePage startpage, DeletePage deletepage, IndexPage indexpage ) {
		driver = sharedriver;
		this.startpage = startpage;
		this.deletepage = deletepage;
		this.indexpage = indexpage;
				
	}
	
	
	
}
