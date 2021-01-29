package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By LoginBtn = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/header/section/div/nav/ul[2]/li[1]/div/button[2]");
	
	By CreateDoodle = By.className("CreatePollMenu-createMenuLabel");
	
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
	
	public void clickCreateDoodle() {
		driver.findElement(CreateDoodle).click();
	}
}