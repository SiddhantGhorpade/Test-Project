package practiceTestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




import facebook.HelpCenter;
import facebook.MessangerLink;
import facebook.ReturnToMessage;
import facebook.RoomPage;

public class VerifyRoomPage 
{
	private WebDriver driver;
	private MessangerLink loginOrSignUpPage;
	private RoomPage messangerpage;
	private ReturnToMessage roomspage;
	private HelpCenter helpCenter;
	private SoftAssert Soft;
	
	@Parameters ("browser")
	
	
	@BeforeTest
	public void LounchBrowser(String BrowserName)
	{
	   if(BrowserName.equals("Chrome"))
	   {
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
			
			 driver = new ChromeDriver();
	   }
	   if(BrowserName.equals("FireFox"))
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Selenium Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
	   }
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	}
	
    
	
	@BeforeClass
	public void createPOMobject() 
	{
		loginOrSignUpPage = new MessangerLink (driver);
		messangerpage = new RoomPage(driver);
		roomspage = new ReturnToMessage (driver);
		helpCenter = new HelpCenter(driver);
		
	}
	
	@BeforeMethod
	public void openRoomPage()
	{
        driver.navigate().to("https://www.facebook.com/");
		
		loginOrSignUpPage.openMessanger();
		
		 Soft = new SoftAssert();
		
		 messangerpage.openRooms();
		
	}
	@Test
	public void A_verifyingGoBackToMessengerPage()
    {

		roomspage.goBackToMessanger();
        String URL = driver.getCurrentUrl();
        
        Soft.assertEquals(URL, "https://www.messenger.com/");
		Soft.assertAll();
	
	}
		
		@Test
		public void B_verifyingVisitHelpCenterPage()
		{
			
			helpCenter.contactToHelpCenter();
			
			String url_1 = driver.getCurrentUrl();
			 Soft.assertEquals(url_1, "https://www.messenger.com/help");
			 Soft.assertAll();
		}
		
		@AfterMethod
		public void logOut()
		{
			System.out.println("Log Out");
		}
		
		
		@AfterClass
		public void cleanPOMobject()
		{
			loginOrSignUpPage = null;
			messangerpage = null;
			roomspage = null;
			helpCenter =null;
	   }
	   @AfterTest
	   public void closeBrowesr()
	   {
		   System.out.println("After Test");
		   driver.close();
		   driver = null;
		   System.gc();
	   }
	}

