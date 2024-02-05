package PracticePg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowser 
{
	
	WebDriver driver;
	@Parameters("URL")
	@Test
    public void browser(String dev)
    {
    	if(dev.equalsIgnoreCase("chrome"))
    	{
    		driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	}
    	else if(dev.equalsIgnoreCase("edge"))
    	{
    		driver=new EdgeDriver();
    		System.out.println("edge");
    		Reporter.log("edge");
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	}
    	else if(dev.equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    		System.out.println("firefox");
    		Reporter.log("firefox");
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	}
    	else
    	{
    		System.out.println("driver not found");
    	}
    	
    }
}
