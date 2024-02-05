package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSHomePage 
{
	@Test
    public void receiver()
    {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://demowebshop.tricentis.com/");
    	DWSHomePage execute=new DWSHomePage(driver);
    	execute.searchField("mobile");
    	execute.searchButton();
    	driver.close();
    }
}
//searchField,searchButton are non -static methods we are calling that by creating object for it.
//we are receiving pom driver in the constructor.
//called method with object and passed the value