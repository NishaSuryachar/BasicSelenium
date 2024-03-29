package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing 
{
	WebDriver driver;
	@Parameters("browsing")
	@Test
    public void Cross(String div)
    {
    	if(div.equalsIgnoreCase("chrome"))
    	{
    	   driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	   //driver.get("https://demowebshop.tricentis.com/");
    	}
    	else if(div.equalsIgnoreCase("Edge"))
    	{
    	   driver=new EdgeDriver();
      	   driver.manage().window().maximize();
      	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      	// driver.get("https://demowebshop.tricentis.com/login");
    	}
    	else if(div.equalsIgnoreCase("Firefox"))
    	{
    		 driver=new FirefoxDriver();
      	   driver.manage().window().maximize();
      	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      	// driver.get("https://demowebshop.tricentis.com/");
    	}
    	else
    	{
    		System.out.println("driver not found");
    	}
    }
	@Test
	public void login()
	{
		   driver.get("https://demowebshop.tricentis.com/login");
		   driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		   driver.findElement(By.id("Password")).sendKeys("admin01");
		   driver.findElement(By.id("RememberMe")).click();
		   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		   driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		   driver.findElement(By.className("ico-logout")).click();
		   driver.close();
	}
	
}
