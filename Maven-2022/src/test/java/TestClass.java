

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import facebook.HelpCenter;
import facebook.MessangerLink;
import facebook.ReturnToMessage;
import facebook.RoomPage;


public class TestClass {

	public static void main(String[] args) 
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		MessangerLink loginOrSignUpPage = new MessangerLink (driver);
		loginOrSignUpPage.openMessanger();
		
		String messangerPageURL = driver.getCurrentUrl();
		
		if(messangerPageURL.equals("https://www.messenger.com/"))
		{
			System.out.println("Test_1 Messanger URL is verified");
		}
		else
		{
			System.out.println("Test_1 Messanger URL is wrong");
		}
		
		
		
		RoomPage messangerpage = new RoomPage(driver);
		messangerpage.openRooms();
		
        String messangerRoomPageURL = driver.getCurrentUrl();
		
		if(messangerRoomPageURL.equals("https://www.messenger.com/rooms"))
		{
			System.out.println("Test_2 Messanger room page URL is verified");
		}
		else
		{
			System.out.println("Test_2 Messanger room page URL is wrong");
		}
		
		
		
		ReturnToMessage roomspage = new ReturnToMessage (driver);
		roomspage.goBackToMessanger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
		{
			System.out.println("Test_3 Case PASS");
		}
		else
		{
			System.out.println("Test_3 Case FAIL");
		}
		
		
		messangerpage.openRooms();
		HelpCenter helpCenter = new HelpCenter(driver);
		helpCenter.contactToHelpCenter();
		
		String url_1 = driver.getCurrentUrl();
		String title_1 = driver.getTitle();
		
		if(url_1.equals("https://www.messenger.com/help") && title_1.equals("Messenger Help Centre"))
		{
			System.out.println("Test_4 Case PASS");
		}
		else
		{
			System.out.println("Test_4 Case FAIL");
		}

	}

}
