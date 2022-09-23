package angelOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInAngelOne 
{

	@FindBy (xpath = "//input[@type='text']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement passward;
	
	@FindBy (xpath = "//a[@id='loginBtn']")
	private WebElement signIn;
	
	@FindBy (xpath = "(//button[@aria-label='Close'])[9]")
	private WebElement popup;
	
	
	
	
	public LogInAngelOne (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void userName()
	{
		userName.click();
		userName.sendKeys("S1629703");
		
    }
	
	public void passward()
	{
		 passward.click();
		 passward.sendKeys("Siddhant@123");
	}
	
	public void signIn()
	{
		signIn.click();
	}
	
	public void popup()
	{
		popup.click();
	}


}
