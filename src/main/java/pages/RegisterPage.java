package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	
	public void usuarioClicOpcionCrearManageCustomers() {
		driver.findElement(By.linkText("Create New")).click();
	}
	
	public void usuarioIngresaIdentificacion(String identificacion) {
		
		driver.findElement(By.id("txtIdentificacion")).clear();
		driver.findElement(By.id("txtIdentificacion")).sendKeys(identificacion);

	}
	
	public void usuarioIngresaRazonSocial(String razon) {
		
		driver.findElement(By.id("txtRazonSocial")).clear();
		driver.findElement(By.id("txtRazonSocial")).sendKeys(razon);

	}
	
	public void usuarioIngresaCiudad(String ciudad) {
		
		driver.findElement(By.id("txtCiudad")).clear();
		driver.findElement(By.id("txtCiudad")).sendKeys(ciudad);

	}
	
	public void usuarioIngresaTipoCliente(String tipo) {
		
		driver.findElement(By.id("txtTipoCliente")).clear();
		driver.findElement(By.id("txtTipoCliente")).sendKeys(tipo);

	}
	
	public void usuarioIngresaTipoNivelRiesgo(String riesgo) {
		
		driver.findElement(By.id("txtNivelRiesgo")).clear();
		driver.findElement(By.id("txtNivelRiesgo")).sendKeys(riesgo);

	}
	
	
	public void usuarioClicBotonCrear() {
		driver.findElement(By.id("btnCreate")).click();
	}
	
	
	
	
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
	}

}
