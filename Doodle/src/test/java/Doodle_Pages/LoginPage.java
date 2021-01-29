package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	By uName = By.name("email");
	
	By pswd = By.name("password");
	
	By loginBtn = By.xpath("//*[@id=\"login-tab-panel\"]/form/button[1]");
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
}