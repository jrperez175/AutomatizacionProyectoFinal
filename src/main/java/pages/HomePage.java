package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public void ingresarUrl() {
		String url = "http://ceibapruebasbanco.azurewebsites.net/";

		// Maximizar la ventana del navegador
		driver.manage().window().maximize();

		// Ingresar a la URL
		driver.get(url);

	}
	
	public void opcionManageCustomers() {
		driver.findElement(By.linkText("Manage Customers")).click();;
	}
	
	public HomePage(WebDriver driver) { // constructor
		this.driver = driver;

	}
	
}
