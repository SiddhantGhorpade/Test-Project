package angelOne;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  Order
{   
	@FindBy (xpath = "//a[text()='Modify']")
	private WebElement modify;
	
	
	@FindBy (xpath = "//a[text()='Cancel']")
	private WebElement cancel;
	
	@FindBy (xpath = "//button[text()='Ok']")
	private WebElement ele;
	
	@FindBy (xpath = "//button[text()='Ok']")
	private WebElement ele1;
	
	
	
	public Order (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void toModifyOrder()
	{
		modify.click();
	}
	
	public void toCancelOrder()
	{
		cancel.click();
	}
	
	public void toHandleAlertPopUp()
	{
		ele.click();
	}
	public void toHandleAlertPopUp1()
	{
		ele1.click();
	}


}
