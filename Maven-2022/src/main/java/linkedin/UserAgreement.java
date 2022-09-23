package linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAgreement 
{
	 @FindBy (xpath = "//a[text()='Introduction']")
	   private WebElement introduction;
	 
	 @FindBy (xpath = "//a[text()='Obligations']")
	   private WebElement obligations;
	   
	   public UserAgreement(WebDriver driver)
	   {
		 PageFactory.initElements(driver, this);  
	   }
	   
	   public void clickOnIntroduction()
	   {
		   introduction.click();
	   }
	   
	   public void clickOnObligations()
	   {
		   obligations.click();
	   }

}
