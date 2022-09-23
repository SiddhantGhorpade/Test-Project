import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import angelOne.Bhel;
import angelOne.LogInAngelOne;
import angelOne.Market;
import angelOne.Order;
import facebook.MessangerLink;
import facebook.RoomPage;

public class VerifyingOrderPage
{
	private WebDriver driver;
	private  LogInAngelOne user,pwd,signin,popup;
	private Market market,searchbox;
	private Bhel buy,submit,confirm; 
	private  Order modify,cancel,ele,ele1;
	
	@BeforeClass
	public void launchBrowser() 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
	@BeforeMethod
	public void openOrderPage()
	{
        driver.navigate().to("https://trade.angelbroking.com/login/");
		
		
        user = new LogInAngelOne (driver);
        user.userName();
		
		pwd = new LogInAngelOne (driver);
		pwd.passward();
		 
		 signin  = new LogInAngelOne (driver);
		 signin.signIn();
		 
		popup  = new LogInAngelOne (driver);
		popup.popup();
		 
		 
		
		
		String loginPageURL = driver.getCurrentUrl();
		
		if(loginPageURL.equals("https://trade.angelbroking.com/login/"))
		{
			System.out.println("Test_1 Login Page URL is verified");
		}
		else
		{
			System.out.println("Test_1 Login Page URL is wrong");
		}
		
		market = new Market(driver);
		market.toOpenMarkets();
		

		String marketPageURL = driver.getCurrentUrl();
		
		if(marketPageURL.equals("https://trade.angelbroking.com/trade/trading/watchlist"))
		{
			System.out.println("Test_2 Market Page URL is verified");
		}
		else
		{
			System.out.println("Test_2 Market Page URL is wrong");
		}
		
		searchbox = new Market(driver);
		searchbox.toSearch();
		
		buy = new Bhel(driver);
		buy.buy();
		
		submit = new Bhel(driver);
		submit.clickOnSubmit();
		
		confirm = new Bhel(driver);
		confirm .clickOnConfirm();
	}
	  @Test
	  public void verifyingModifyOrder()
	  {	
		modify = new Order(driver);
		modify.toModifyOrder();
		 
		 String modifyPageURL = driver.getCurrentUrl();
			
			if(modifyPageURL.equals("https://trade.angelbroking.com/trade/trading/orderbook"))
			{
				System.out.println("Test_3 Pass");
			}
			else
			{
				System.out.println("Test_3 Fail");
			}
	  }
	  @Test
	  public void toVerifyingCancelOrder()
	  {
		cancel = new Order(driver);
		cancel.toCancelOrder();
		
		ele = new Order(driver);
		ele.toCancelOrder();
		
		ele1 = new Order(driver);
		ele1.toCancelOrder();
		
		String modifyPageURL = driver.getCurrentUrl();
		
		if(modifyPageURL.equals("https://trade.angelbroking.com/trade/trading/orderbook"))
		{
			System.out.println("Test_4 Pass");
		}
		else
		{
			System.out.println("Test_4 Fail");
		}
	  }
	  @AfterMethod
	  public void logout()
	  {
		  System.out.println("log out");
	  }
	  @AfterClass
	  public void closeApp()
	  {
		  driver.close();
		  System.out.println("Close");
	  }
}	
		  
		 
		 
		 
		 
		 
		 
		 
		 
	  
		
		
		
		
		
		
		
		
		
		
		
		
	
	

