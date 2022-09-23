package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPay 
{
	
	
	@FindBy (xpath = "(//a[@class='a-link-normal scroller-content'])[2]")
	private WebElement rewards;
	
	@FindBy (xpath = "//div[@id='Covid']")
	private WebElement donate;
	
	@FindBy (xpath = "//div[@id='MobileRecharge']")
	private WebElement mobRecharge;
	
	@FindBy (xpath = "//div[@id='Landline']")
	private WebElement landLine;
	
	
	public AmazonPay(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickRewards()
	{
		rewards.click();
	}
	
	public void clickDonate()
	{
		donate.click();
	}
	
	public void clickMobRecharge()
	{
		mobRecharge.click();
	}
	
	public void clickLandLine()
	{
		landLine.click();
	}
	
	

	

}
