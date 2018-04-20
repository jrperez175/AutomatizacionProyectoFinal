package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
	WebDriver driver;
	
	public void usuarioClicOpcionCrearManageCustomers() {
		driver.findElement(By.linkText("Create New")).click();
	}
	
	
	public void usuarioClicOpcionEditUsario(String identificacion) {
		String id = "Edit_"+ identificacion;
		driver.findElement(By.name(id)).click();
	}
	
	
	public void usuarioClicOpcionDelete(String identificacion) {
		String id = "Delete_"+ identificacion;
		driver.findElement(By.name(id)).click();
	}
	
	public String validacionExitosa(String identificacion) {
		return driver.findElement(By.id(identificacion)).getText();	
	}
	
	public String validarCampoModificado(String identificacion) {
         return driver.findElement(By.xpath("//*[@id='" + identificacion + "']/../../td[2]")).getText().trim();
 } 

	
	
	public IndexPage (WebDriver driver) {
		this.driver = driver;
	}

}
