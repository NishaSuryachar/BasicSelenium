package PracticePg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFindElements {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        String current_url = driver.getCurrentUrl();
        if(given_url.equals(current_url))
        {
        	System.out.println("you are in demo web shop page");
        	driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
        	String current_title=driver.getTitle();
        	if(given_title.contains(current_title))
        	{
        		System.out.println("you are in digital download page");
        		List<WebElement> cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
        		for (WebElement web : cart)
        		{
					web.click();
					Thread.sleep(1000);
				}
        		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        		WebElement shopping_cart = driver.findElement(By.xpath("//h1[text()='Shopping cart']"));
        		if(shopping_cart.isDisplayed())
        		{
        			System.out.println("you are in shopping cart page");
        			List<WebElement> remove = driver.findElements(By.cssSelector("input[name='removefromcart']"));
        			for (WebElement web : remove) 
        			{
						web.click();
						Thread.sleep(1000);
					}
        			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
        		}
        		else
        		{
        			System.out.println("you are not in shopping cart page");
        		}
        	}
      
        	else
        	{
        		System.out.println("you are not in digital download page");
        	}
        }
        else
        {
        	System.out.println("you are not in demo web shop page");
        }
        driver.close();
	}

}
