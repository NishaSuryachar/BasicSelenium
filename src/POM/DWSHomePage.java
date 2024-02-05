package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage
{
	//it is constructor
	public DWSHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="small-searchterms")
	WebElement searchfield;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbutton;
	
	public void searchField(String value)
	{
		searchfield.sendKeys(value);
	}
	public void searchButton()
	{
		searchbutton.click();
	}
	

}
//pom is a design pattern which acts like repository for a webelement
//how to create pom:
//we are using PageFactory to create pom object for every page which have webelement
//we are calling "DWSHomePage(WebDriver driver)" constructor  inside that we are creating pom object  by initelements methods ,that 
//method accept parameters our driver with current page address (eg:homepage)
//in @FindBy(id="small-searchterms") annotation we are passing locator with web element value
//for that value we give a name eg:searchfield of WebElement type
//we are calling method and receiver data in parameters
//inside ,by webelement we call a method sendkeys() inside that we receive value from ExecuteDWSHomePage class 
