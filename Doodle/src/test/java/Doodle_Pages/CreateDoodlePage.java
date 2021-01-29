package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDoodlePage {

	WebDriver driver;

	public CreateDoodlePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By eTitle = By.xpath("//*[@id=\"d-pollTitle\"]");
		
	By aLocation = By.xpath("//*[@id=\"d-pollLocation\"]");
		
	By aNote = By.xpath("//*[@id=\"d-pollDescription\"]");
		
	By contn = By.className("d-actionButtons");
		
	public void enterTitle(String user) {
		driver.findElement(eTitle).sendKeys(user);
	}

	public void addLocation(String pass) {
		driver.findElement(aLocation).sendKeys(pass);
	}
		
	public void addNote(String user) {
		driver.findElement(aNote).sendKeys(user);
	}
		
	public void clickContinue() {
		driver.findElement(contn).click();
	}
}