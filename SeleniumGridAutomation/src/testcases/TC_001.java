package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void tcases() throws InterruptedException, MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
	
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), cap);
		Thread.sleep(20000);
		driver.get("https://www.facebook.com");
		
	}
	
}
