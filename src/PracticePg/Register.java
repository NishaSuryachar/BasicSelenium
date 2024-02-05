package PracticePg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Register
{
	//it is constructor
    public Register(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    @FindBy(id="FirstName")
    WebElement fname;
    
    public void FirstName(String name)
    {
    	fname.sendKeys(name);
    }
}
