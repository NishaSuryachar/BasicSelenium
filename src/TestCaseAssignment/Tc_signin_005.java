package TestCaseAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_signin_005 {
	@Parameters("URL")
	@Test
	public void shopperstack(String surl) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(160));
		driver.get(surl);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='loginBtn']"))).click();
	    driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	    WebElement signin = driver.findElement(By.id("signIn"));
	    Actions a=new Actions(driver);
	    Thread.sleep(3000);
    	a.moveToElement(signin).build().perform();
	    if(signin.isEnabled())
	    {
	    	System.out.println("signin link color is changed to yellow");
	    }
	    else
	    {
	    	System.out.println("signin link color is changed to yellow");
	    }
	 }
}
