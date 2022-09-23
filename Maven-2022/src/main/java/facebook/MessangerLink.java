package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessangerLink
{
	
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement messangerLink;
	
	public MessangerLink(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void openMessanger() 
	{
		messangerLink.click();
		
	}
	


}
