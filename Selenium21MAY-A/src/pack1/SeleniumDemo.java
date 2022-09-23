package pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		//d.get("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		d.navigate().to ("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//d.navigate().back();
		//Thread.sleep(3000);
		//d.navigate().forward();
		//Thread.sleep(3000);
		//d.navigate().refresh();
		
		//Thread.sleep(3000);
		//d.manage().window().maximize();
		//Thread.sleep(3000);
		//d.manage().window().minimize();
		
		//d.close();
		//Dimension p = new Dimension(50,100);  
		//d.manage().window().setSize(p);
		
		//Thread.sleep(3000);
		//Point t = new Point(50,-100);
		//d.manage().window().setPosition(t);
		//d.get("http://www.facebook.com/");
		
		
		WebElement createnew  = d.findElement(By.xpath("//a[text()='Create New Account']"));
		Thread.sleep(3000);
		createnew .click();
		
		Thread.sleep(3000);
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		month.click();
		Select s = new Select(month);
		
		Thread.sleep(3000);
		s.selectByValue("7");
		
		
		
		
		
	}
	
	

}