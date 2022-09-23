package linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn
{
	 @FindBy (xpath = "//a[text()='Privacy Policy']")
	   private WebElement privacyPolicy;
	   
	   public SignIn(WebDriver driver)
	   {
		 PageFactory.initElements(driver, this);  
	   }
	   
	   public void clickOnPrivacyPolicy()
	   {
		   privacyPolicy.click();
	   }

}
