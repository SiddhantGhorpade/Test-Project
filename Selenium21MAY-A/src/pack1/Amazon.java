package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Automation\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(5000);
        // WebElement backTo = driver.findElement(By.xpath("//div[@class='navFooterBackToTop']"));
        
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        // Thread.sleep(5000);
        //js.executeScript("arguments[0].scrollIntoView(true);",backTo);
        //System.out.println("end");
         
       /* WebElement signIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
       
        WebElement yourOrder = driver.findElement(By.xpath("//span[text()='Your Orders']"));
        
       Actions act = new Actions(driver);
        
       act.moveToElement(signIn).moveToElement(yourOrder).click().build().perform();
        
        */
	}

}
