package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    Thread.sleep(3000);
	    
	    List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	    
		for(int i = 0; i < col.size(); i++)
		{
			System.out.println(col.get(i).getText()+" ");
		}

	}

}
