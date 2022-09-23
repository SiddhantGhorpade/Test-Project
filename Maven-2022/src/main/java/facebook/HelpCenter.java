package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenter 
{
	@FindBy (xpath = "//a[text()=' Visit our help center ']")
	private WebElement helpCenter;
	
	public HelpCenter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void contactToHelpCenter()
	{
		 helpCenter.click();
	}


}
