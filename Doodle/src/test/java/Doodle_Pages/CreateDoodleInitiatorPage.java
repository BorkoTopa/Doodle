package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDoodleInitiatorPage {

	WebDriver driver;

	public CreateDoodleInitiatorPage(WebDriver driver) {
		this.driver=driver;
	}
		
	By name = By.id("d-initiatorName");
		
	By email = By.id("d-initiatorEmail");
	
	By finish = By.id("d-persistPollButton");
		
	public void enterName(String user) {
		driver.findElement(name).sendKeys(user);
	}

	public void enterEmail(String pass) {
		driver.findElement(email).sendKeys(pass);
	}
		
	public void clickFinish() {
		driver.findElement(finish).click();
	}
		
}