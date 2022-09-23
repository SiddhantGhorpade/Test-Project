package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLogIn 
{
	@FindBy (xpath = "//div[text()='About']")
	private WebElement about;
	
	
	public InstaLogIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
	
	public void clickOnAbout()
	{
		about.click();
	}

}
