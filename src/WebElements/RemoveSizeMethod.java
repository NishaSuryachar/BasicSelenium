package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RemoveSizeMethod
{
   public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
		if(element.isDisplayed())
		{
			System.out.println("you are in Welcome to our store page");
			driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
			WebElement digi = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(digi.isDisplayed())
			{
				System.out.println("you are in digital downloads page");
				List<WebElement> community = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for(WebElement web:community)
				{
					Thread.sleep(2000);
					web.click();
					Thread.sleep(2000);
				}
				driver.findElement(By.className("cart-label")).click();
				WebElement shopping_cart = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shopping_cart.isDisplayed())
				{
					System.out.println("you are in shopping cart page");
					List<WebElement> checkBox = driver.findElements(By.cssSelector("input[type='checkbox']"));
					//first it will take size of list then it will -1,because we want only 3 then it call remove() to remove last checkbox
					checkBox.remove(checkBox.size()-1);
					//here we have only 3 in the list ,it will click it
					for(WebElement web:checkBox)
					{
						web.click();
						Thread.sleep(2000);
					}
					driver.findElement(By.cssSelector("input[name='updatecart']")).click();
				}	
			    else 
			    {
					System.out.println("you are not in shopping cart page");
				}
			}
			else
			{
					System.out.println("you are not in digital downloads page");
			}
		}
		else
		{
			System.out.println("you are not in Welcome to our store page");
		}
			Thread.sleep(2000);
			driver.close();
		}
	}
	//here we use remove()=in cssselector we use checkbox for that we got 4 ,but we want 3 checkbox to remove items in shopping cart
    //as a enginner we should not enter values statically we make it to take dynamically by using size()