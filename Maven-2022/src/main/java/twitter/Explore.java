package twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Explore 
{
	
	@FindBy (xpath = "(//div[@dir='auto'])[9]")
	private WebElement forYou;
	
	@FindBy (xpath = "//a[@href='/explore/tabs/trending']")
	private WebElement trending;
	
	@FindBy (xpath = "//a[@href='/explore/tabs/news_unified']")
	private WebElement news;
	
	@FindBy (xpath = "//a[@href='/explore/tabs/sports_unified']")
	private WebElement sports;
	
	
	public Explore(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickForYou()
	{
		forYou.click();
	}
	
	public void clickTrending()
	{
		trending.click();
	}
	
	public void clickNews()
	{
		news.click();
	}
	
	public void clickSports()
	{
		sports.click();
	}
	

	
	

}
