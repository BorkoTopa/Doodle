package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDoodleOptionsPage {

	WebDriver driver;

	public CreateDoodleOptionsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By clkTxt = By.xpath("//*[@id=\"d-monthWeekTabSwitchView\"]/section/ul/li[3]/a");
	
	By opt1 = By.xpath("//*[@id=\"d-wizardChoicesView0\"]");
		
	By opt2 = By.xpath("//*[@id=\"d-wizardChoicesView1\"]");
		
	By opt3 = By.xpath("//*[@id=\"d-wizardChoicesView2\"]");
	
	By contn = By.xpath("//*[@id=\"d-wizardOptionsNavigationView\"]/div/div/div[2]/button[2]");
		
	public void clickText() {
		driver.findElement(clkTxt).click();
	}
		
	public void enterOption1(String user) {
		driver.findElement(opt1).sendKeys(user);
	}

	public void enterOption2(String pass) {
		driver.findElement(opt2).sendKeys(pass);
	}
		
	public void enterOption3(String user) {
		driver.findElement(opt3).sendKeys(user);
	}
		
	public void clickContinue() {
		driver.findElement(contn).click();
	}
		
}