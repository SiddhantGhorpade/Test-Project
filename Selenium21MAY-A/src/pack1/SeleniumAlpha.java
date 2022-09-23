package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAlpha 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		//String text = userName.getTagName();
		//System.out.println(text);
		//WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		//userName.sendKeys("ffdsf");
		
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//Thread.sleep(5000);
		//String title = driver.getTitle();
		//System.out.println(title);
		
		 
		}
		
		
		//WebElement custom = driver.findElement(By.xpath("//input[@id='u_3_4_WT']"));
		//Thread.sleep(5000);
		//custom.click();
		
		//Thread.sleep(5000);
		//WebElement pronaun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		

		//Thread.sleep(5000);
		//boolean result = pronaun.isDisplayed();
		//Syste//
		//WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		//boolean result = loginButton.isEnabled();
		//System.out.println(result);
		
		
		
		
		
	}


