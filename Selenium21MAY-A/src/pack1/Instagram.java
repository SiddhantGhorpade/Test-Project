package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		

		/*WebElement logIn = driver.findElement(By.xpath("//div[text()='Log In']"));
		boolean result = logIn.isEnabled();
        System.out.println(result);*/
        for(int i = 1; i <=5; i++)
        {	
        TakesScreenshot take =  (TakesScreenshot)driver;
        File src = take.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\HP\\Desktop\\screenshot\\Test"+i+".jpeg");
        FileHandler.copy(src, dest);
	}

}
}
