package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDoodleSettingsPage {

	WebDriver driver;

	public CreateDoodleSettingsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By yesNoIf = By.id("d-ifneedbeCheckboxContainer");
	
	By contn = By.xpath("//*[@id=\"d-wizardSettingsNavigationView\"]/div/div/div[2]/button[2]");
		
	public void clickYesNoIf() {
		driver.findElement(yesNoIf).click();
	}
		
	public void clickContinue() {
		driver.findElement(contn).click();
	}
		
}