package TestCaseAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_signup_002 {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(160));
		driver.get("https://shoppersstack.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='loginBtn']"))).click();
	    driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	        WebElement signup = driver.findElement(By.xpath("//a[text()='signup']"));
	        if(signup.isDisplayed())
	        {
	        	System.out.println("you are in signup page");
	        }
	        else
	        {
	        	System.out.println("you are not in signup page");
	        }
	  }
}
