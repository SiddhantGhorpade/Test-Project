package twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
   @FindBy (xpath = "")
   private WebElement profile;
   
   public Home(WebDriver driver)
   {
	 PageFactory.initElements(driver, this);  
   }
   
   public void clickOnProfile()
   {
	   profile.click();
   }
}
