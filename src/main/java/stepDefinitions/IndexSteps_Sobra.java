package stepDefinitions;

import org.openqa.selenium.WebDriver;

import configuration.ShareDriver;
import pages.RegisterPage;
import pages.HomePage;

public class IndexSteps_Sobra {

	WebDriver driver;
	
	
	public IndexSteps_Sobra(ShareDriver sharedriver,HomePage startpage, RegisterPage registerpage ) {
		driver = sharedriver;
		
		
	}
	
	
	
}
