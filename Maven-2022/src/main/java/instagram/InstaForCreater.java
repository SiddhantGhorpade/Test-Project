package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaForCreater 
{
	@FindBy (xpath = "//a[text()='For creators']")
	private WebElement forCreater;
	
	public InstaForCreater(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnforCreater()
	{
		forCreater.click();
	}

}
