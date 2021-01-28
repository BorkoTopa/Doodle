package Doodle_Test_cases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Doodle_Pages.HomePage;
import Doodle_Pages.CreateDoodleInitiatorPage;
import Doodle_Pages.CreateDoodleOptionsPage;
import Doodle_Pages.CreateDoodlePage;
import Doodle_Pages.CreateDoodleSettingsPage;

public class MakeSurvey {
	@Test
	public void makeSurvey() {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://doodle.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  HomePage home = new HomePage(driver);
		  CreateDoodleInitiatorPage crtInitiator = new CreateDoodleInitiatorPage(driver);
		  CreateDoodleOptionsPage crtOption = new CreateDoodleOptionsPage(driver);
		  CreateDoodlePage crt = new CreateDoodlePage(driver);
		  CreateDoodleSettingsPage crtSettings = new CreateDoodleSettingsPage(driver);
		  
		  home.clickCreateDoodle();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  crt.enterTitle("Survey");
		  crt.addLocation("Online");
		  crt.addNote("Select favorite color");
		  crt.clickContinue();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  crtOption.clickText();
		  crtOption.enterOption1("RED");
		  crtOption.enterOption2("GREEN");
		  crtOption.enterOption3("BLUE");
		  crtOption.clickContinue();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  crtSettings.clickYesNoIf();
		  crtSettings.clickContinue();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  crtInitiator.enterName("Borko Topalovic");
		  crtInitiator.enterEmail("usermail@company.com");
		  crtInitiator.clickFinish();
		  
	}

}
