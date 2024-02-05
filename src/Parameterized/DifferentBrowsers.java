package Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers
{
	WebDriver driver;
	@Parameters("Driver")
	@Test
    public void browsers(String div)
    {
    	if(div.equalsIgnoreCase("chrome"))
    	{
    		driver=new ChromeDriver();
    		System.out.println("hi iam chromeDriver");
    		Reporter.log("chromeDriver");
    		
    	}
    	else if(div.equalsIgnoreCase("edge"))
    	{
    		driver=new EdgeDriver();
    		System.out.println("hi iam edgeDriver");
    		Reporter.log("edgeDriver");
    	}
    	else if(div.equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    		System.out.println("hi iam firefoxDriver");
    		Reporter.log("firefoxDriver");
    	}
    	else
    	{
    		System.out.println("driver not found");
    	}
    }
}
//while creating xml file we should include @parameters annotations after created xml 
//we should come back to mainclass (differentbrowser) add @parameters then go to xml file
//after test tag add parameter<> inside that mention parameter name and pass the value and it is received by the method 
//written inside different browser class.