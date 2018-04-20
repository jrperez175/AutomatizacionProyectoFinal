package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
	WebDriver driver;
	
	public void usuarioClicBotonEdit() {
		driver.findElement(By.id("Save")).click();
	}
	
	
	
	public EditPage (WebDriver driver) {
		this.driver = driver;
	}

}
