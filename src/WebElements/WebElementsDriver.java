package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDriver {

	public static void main(String[] args) throws InterruptedException 
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
	    //to maximize the browser
		driver.manage().window().maximize();
		// navigate to that particular web page
		driver.get("https://demowebshop.tricentis.com/");
		//here we are storing a webelements in list variable i.e,community
		List<WebElement> community = driver.findElements(By.cssSelector("input[type='radio']"));
		for(WebElement web:community)
		{
			web.click();
			Thread.sleep(1000);
		}
		driver.close();

	}

}
//webelements-it is a method present in web driver,used to find the multiple web elements in the web page
//it will return  a list of web element,return type of web element is list of web element
//here we are iterate the web elements using for each loop which is there in list i,e,community ,it is variable
//here we are store a multiple web elements in to a list