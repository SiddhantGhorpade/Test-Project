package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaGoCreate 
{
	@FindBy (xpath = "//a[text()='GO CREATE']")
	private WebElement goCreate;
	
	public InstaGoCreate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOngoCreate()
	{
		goCreate.click();
	}

}
