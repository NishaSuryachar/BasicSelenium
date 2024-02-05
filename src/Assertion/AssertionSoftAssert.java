package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftAssert
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
    	SoftAssert soft_assert = new SoftAssert();
    	soft_assert.assertNotEquals(given, current);
    	System.out.println("successfull");
    	driver.close();
    }
}
//assert 2 types 
//1 hardassert
//2.softassert

//softassert- testng softassert class is a non-static method so we called it by object name soft_assert
//the return type is boolean, if it is failed then i will not terminate execution,it will execute until end
//asserts are used to validate the url,title ex.


