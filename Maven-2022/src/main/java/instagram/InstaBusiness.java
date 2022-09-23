package instagram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaBusiness 
{
	@FindBy (xpath = "(//a[text()='Business'])[2]")
	private WebElement business;
	
	public InstaBusiness(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//js.executeScript("arguments[0].scrollIntoView(true);",business)
	
	public void clickOnBusiness()
	{
		business.click();
	}


}
