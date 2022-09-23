import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import linkedin.PrivacyPolicy;
import linkedin.SignIn;
import linkedin.UserAgreement;

public class Linkedin {

	public static void main(String[] args) 
	{
		       // System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
		
				//WebDriver driver = new ChromeDriver();
				
		        System.setProperty("webdriver.gecko.driver", "C:\\Selenium Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("https://www.linkedin.com/login");
				
				
				SignIn signin = new SignIn(driver);
				signin.clickOnPrivacyPolicy();
				
				PrivacyPolicy privacy = new PrivacyPolicy(driver);
				privacy.clickOnUserAgreement();
				
				UserAgreement intro = new UserAgreement(driver);
				intro.clickOnIntroduction();
				
				String url = driver.getCurrentUrl();
				if(url.equals("https://www.linkedin.com/legal/user-agreement#introduction"))
				{
					System.out.println("Test 1 Pass");
				}
				else
				{
					System.out.println("Test 1 Fail");
				}
				
				//driver.get("https://www.linkedin.com/login");
				//signin.clickOnPrivacyPolicy();
				privacy.clickOnUserAgreement();
				UserAgreement obli = new UserAgreement(driver);
				obli.clickOnObligations();
				
				String url1 = driver.getCurrentUrl();
				if(url1.equals("https://www.linkedin.com/legal/user-agreement#obligations"))
				{
					System.out.println("Test 2 Pass");
				}
				else
				{
					System.out.println("Test 2 Fail");
				}
				
				
				
				
				
		

	}

}
