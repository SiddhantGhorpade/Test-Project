package linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy
{
	 @FindBy (xpath = "(//div[@class='artdeco-dropdown'])[1]")
	   private WebElement userAgreement;
	   
	   public PrivacyPolicy(WebDriver driver)
	   {
		 PageFactory.initElements(driver, this);  
	   }
	   
	   public void clickOnUserAgreement()
	   {
		   userAgreement.click();
	   }

}
