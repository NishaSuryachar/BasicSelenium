package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCartByChronologicalOrder 
{
	WebDriver driver;
    @BeforeClass
    public void openBrowser()
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	//driver.get("https://demowebshop.tricentis.com/");
    }
    @BeforeMethod
    public void login()
    {
    	String given_url="https://demowebshop.tricentis.com/";
    	driver.get("https://demowebshop.tricentis.com/");
    	String current_url = driver.getCurrentUrl();
    	if(given_url.equals(current_url))
    	{
    		System.out.println("you are in demo web shop home page");
    		driver.findElement(By.className("ico-login")).click();
    	    driver.findElement(By.id("Email")).sendKeys("Admin1990@gmail.com");
    	    driver.findElement(By.id("Password")).sendKeys("Admin12345");
    	    driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
    	}
    	else
    	{
    		System.out.println("you are not in demo web shop home page");
    	}
     }
    @Test
    public void addToCart()
    {
    	driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
    }
    @AfterMethod
    public void logOut()
    {
    	driver.findElement(By.className("ico-logout")).click();
    }
    @AfterClass
    public void closeBrowser()
    {
    	driver.close();
    }
    
}
