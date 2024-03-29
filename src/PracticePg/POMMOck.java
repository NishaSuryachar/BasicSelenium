package PracticePg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMMOck
{
   public POMMOck(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   @FindBy(id="Email")
   WebElement email;
   
   @FindBy(id="Password")
   WebElement password;
   
   @FindBy(id="RememberMe")
   WebElement rememberMe;
   
   @FindBy(xpath="//input[@value='Log in']")
   WebElement loginButton;
   
   public void Email(String value)
   {
	  email.sendKeys(value);
   }
   public void Password(String value)
   {
	   password.sendKeys(value);
   }
   public void RememberMe()
   {
	  rememberMe.click();
   }
   public void Login()
   {
	   loginButton.click();
	   
   }
   
}
