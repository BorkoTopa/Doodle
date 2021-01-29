package Doodle_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDoodleVotePage {

	WebDriver driver;

	public CreateDoodleVotePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By vote = By.xpath("//*[@id=\"d-pollView\"]/article/div/div/div/ul/li[1]/label/div[2]");
	
	By send = By.xpath("//*[@id=\"d-pollActionBarView\"]/div/div/div[3]/button");
		
	public void clickVote() {
		driver.findElement(vote).click();
	}
		
	public void clickSend() {
		driver.findElement(send).click();
	}
		
}