package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHardAssert 
{
	@Test
    public void dws()
    {
    	String given="https://demowebshop.tricentis.com/";
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://demowebshop.tricentis.com/");
    	String current = driver.getCurrentUrl();
    	//Assert.assertEquals(given, current);
    	Assert.assertNotEquals(given,current);
    	System.out.println("successfull");
    	driver.close();
    }
}
//assert 2 types 
//1 hardassert
//2.softassert

//hardassert- testng assert class is a static method so we called it by class name Assert
//the return type is boolean, if it is failed then i will terminate execution
