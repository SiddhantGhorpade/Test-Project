import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import facebook.HelpCenter;
import facebook.MessangerLink;
import facebook.ReturnToMessage;
import facebook.RoomPage;
import instagram.InstaBusiness;
import instagram.InstaForCreater;
import instagram.InstaGoCreate;
import instagram.InstaLogIn;

public class Instagram
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       // System.setProperty("webdriver.gecko.driver", "C:\\Selenium Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		
		InstaLogIn loginOrSignUpPage = new InstaLogIn (driver);
		loginOrSignUpPage.clickOnAbout();
		
		String URL = driver.getCurrentUrl();
		
		if(URL.equals("https://www.instagram.com/accounts/login/"))
		{
			System.out.println("Test_1 Pass");
		}
		else
		{
			System.out.println("Test_1 Fail");
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement business = driver.findElement(By.xpath("//a[text()='Business']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",business);
		
		InstaBusiness businesspage = new InstaBusiness(driver);
		businesspage.clickOnBusiness();
		
        String businesspageURL = driver.getCurrentUrl();
		
		if(businesspageURL.equals("https://business.instagram.com/"))
		{
			System.out.println("Test_2 Pass");
		}
		else
		{
			System.out.println("Test_2 Fail");
		}
		
		
		
		InstaForCreater forCreaterpage = new InstaForCreater (driver);
		forCreaterpage.clickOnforCreater();
		
		String url = driver.getCurrentUrl();
		//String title = driver.getTitle();
		
		if(url.equals("https://creators.instagram.com/") )
		{
			System.out.println("Test_3 Case PASS");
		}
		else
		{
			System.out.println("Test_3 Case FAIL");
		}
		
		
		
		InstaGoCreate goCreate = new InstaGoCreate(driver);
		goCreate.clickOngoCreate();
		
		String url_1 = driver.getCurrentUrl();
		//String title_1 = driver.getTitle();
		
		if(url_1.equals("https://creators.instagram.com/create") )
		{
			System.out.println("Test_4 Case PASS");
		}
		else
		{
			System.out.println("Test_4 Case FAIL");
		}

}
}
