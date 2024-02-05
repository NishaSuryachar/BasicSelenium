package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeys {

	public static void main(String[] args) 
	{
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	    String current_url = driver.getCurrentUrl();
        if(given_url.equals(current_url))
        {
        	System.out.println("you are in DWS page");
        	//search field path store it in a container
        	WebElement search_field = driver.findElement(By.id("small-searchterms"));
        	Actions a=new Actions(driver);
        	if(search_field.isEnabled())
        	{
        		System.out.println("search field is enabled");
        		//move the cursor to search field and click on it then passing data into it
        		a.moveToElement(search_field).click().sendKeys("mobile").build().perform();
        		//click on search button
        		driver.findElement(By.xpath("//input[@type='submit']")).click();
        		System.out.println("Script is successfull");
        		
        	}
        	else
        	{
        		System.out.println("search field is not enabled");
        	}
        	driver.close();
        }
        else
        {
        	System.out.println("you are not in DWS page");
        	System.out.println("Script is unsuccessfull");
        	driver.close();
        }
	}
}
