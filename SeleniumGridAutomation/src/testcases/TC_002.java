package testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.LoginPage;



public class TC_002 {

	@Test
	public void tc001() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win3\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		/*LoginPage login = new LoginPage(driver);
		login.enterUsername("HELLLO");
		login.enterPassword("asdasda");
		login.clickSignin(); */
		
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		act1.sendKeys("Hello").perform();
		//act1.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		Select s = new Select(driver.findElementById("day"));
		
		
		
		
		
		
		
	}
	
}
