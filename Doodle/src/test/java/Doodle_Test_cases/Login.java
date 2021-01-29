package Doodle_Test_cases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Doodle_Pages.HomePage;
import Doodle_Pages.LoginPage;


public class Login {
	@Test
	public void login() {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://doodle.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  HomePage home = new HomePage(driver);
		  
		  LoginPage login = new LoginPage(driver);
		  
		  home.clickLogin();	  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		  login.enterUsername("markovicmarinkaaabg@gmail.com");
		  login.enterPassword("12345678");
		  login.clickLogin();
		  
	}

}
