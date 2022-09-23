import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class LinkedinTesstNG 
{   
	private WebDriver driver;
	@BeforeTest
	public void LounchBrowser(String BrowserName)
	{
	   if(BrowserName.equals("Chrome"))
	   {
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
	   }
	   if(BrowserName.equals("FireFox"))
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Selenium Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
	   }
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	}
	
	

}
