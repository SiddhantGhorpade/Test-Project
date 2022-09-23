package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver105\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement messanger = driver.findElement(By.xpath("//a[text()='Messenger']")) ;
		messanger.click();
		Thread.sleep(3000);
		
		//WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		//Select d = new Select(day);
		//d.selectByValue("21");
		//Thread.sleep(3000);
		
		
		//WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//Select s = new Select(month);
		//s.selectByValue("5");
		//Thread.sleep(3000);
		
		
		//WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		//Select y = new Select(year);
	    //y.selectByVisibleText("1997");
	    
	   /* WebElement proNoun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	   
	    boolean result =  proNoun.isDisplayed();
	    System.out.println(result);
	    Thread.sleep(3000);*/
	    
	   /* WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
	    boolean result1 =  custom.isEnabled();
	    System.out.println(result1);*/
	    
	    //WebElement logIn = driver.findElement(By.xpath("//button[@id='u_0_5_1a']"));
	    //boolean result = logIn.isEnabled();
	    //System.out.println(result);
		
		/*if(result1==true)
		{
			System.out.println("pass");
	    }
		else
		{
			System.out.println("fail");
		}*/
	}

	
		
	}


