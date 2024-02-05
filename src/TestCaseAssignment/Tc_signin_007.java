package TestCaseAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_signin_007 {
	@Parameters("URL")
	@Test
	public void shopperstack(String surl) throws InterruptedException
	{
		String[] name= {"","M S","9123456780","nishams1904@gmail.com","Nisha12345","Nisha12345"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(160));
		driver.get(surl);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='loginBtn']"))).click();
	    driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	   List<WebElement> form = driver.findElements(By.xpath("//form[@class='signup_signupForm__BDlN5']/div/div/div/input"));
	   int i=0;
	   for (WebElement web : form) 
	   {
		   web.sendKeys(name[i++]);
		   Thread.sleep(1000);
	   }
	   driver.findElement(By.id("Female")).click();
	   driver.findElement(By.id("Terms and Conditions")).click();
	   WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
	   if(register.isEnabled())
	   {
		   System.out.println("successfully signup");
	   }
	   else
	   {
		   System.out.println("Register button is not enabled");
		   System.out.println("Please Enter first Name");
	   }
	}

}
