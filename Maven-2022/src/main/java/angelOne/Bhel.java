package angelOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bhel 
{
	@FindBy (xpath = "//a[text()='Buy']")
	private WebElement buy;
	
	
	@FindBy (xpath = "//input[@type='number']")
	private WebElement quantity;
	
	
	@FindBy (xpath = "(//input[@type='number'])[4]")
	private WebElement price;
	
	
	@FindBy (xpath = "//button[@id='btnOrderPadSubmit']")
	private WebElement submit;
	
	
	@FindBy (xpath = "//button[text()='CONFIRM']")
	private WebElement confirm;
	
	
	
	public Bhel (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void buy()
	{
		buy.click();
	}
	
	public void toSetQuantity()
	{
		quantity.sendKeys("3");
	}
	
	public void toSetPrice()
	{
		price.sendKeys("50");
	}
	
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	public void clickOnConfirm()
	{
		confirm.click();
	}
	

}
