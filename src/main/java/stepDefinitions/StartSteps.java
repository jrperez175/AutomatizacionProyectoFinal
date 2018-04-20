package stepDefinitions;

import org.openqa.selenium.WebDriver;

import configuration.ShareDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;

public class StartSteps {

	WebDriver driver;
	HomePage startpage;
	
	
	@Given ("Dado que el usuario esta en la pagina de CeibaProyectoFinal")
	public void usuarioEstaEnPaginaLogin() {
		startpage.ingresarUrl();
	}
	
    @When ("el usuario realiza click en la opcion Manage Customer")
    public void usuarioHaceClicOpcionManageCustomer() {
		startpage.opcionManageCustomers();
	}
    	
	public StartSteps(ShareDriver sharedriver, HomePage startpage ) {
		driver = sharedriver;
		this.startpage=startpage;
		
		
	}
	
}
