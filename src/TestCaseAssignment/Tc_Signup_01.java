package TestCaseAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_Signup_01 {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://shoppersstack.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(160));
		driver.get("https://shoppersstack.com/");
		String current_url = driver.getCurrentUrl();
		if(given_url.contains(current_url))
		{
			Thread.sleep(2000);
		    System.out.println("you are in Shoppersstack page");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
	     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='loginBtn']"))).click();
	    	WebElement shopperLogin = driver.findElement(By.xpath("//button[text()='Shopper Login']"));
	    	if(shopperLogin.isDisplayed())
	    	{
	    		System.out.println("you are in shopper login page");
	    	}
	    	else
	    	{
	    		System.out.println("you are not in shopper login page");
	    	}
		}

	}
}
