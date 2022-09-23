package angelOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Market 
{
	@FindBy (xpath = "//a[@id='mnMarkets']")
	private WebElement market;
	
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement searchBox;
	
	
	
	public Market  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void toOpenMarkets()
	{
		market.click();
	}
	
	public void toSearch()
	{
		searchBox.sendKeys("BHEL");
	}
	
	

}
