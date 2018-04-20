package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage {
	WebDriver driver;
	
	public void usuarioClicBotonDelete() {
		driver.findElement(By.id("Delete")).click();
	}
	
	
	
	public DeletePage (WebDriver driver) {
		this.driver = driver;
	}

}
