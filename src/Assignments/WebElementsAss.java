package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsAss {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
		String given_ShoppingCartTitle="Demo Web Shop. Shopping Cart";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in web demo shop page");
			driver.findElement(By.linkText("Digital downloads")).click();
			String current_title=driver.getTitle();
			if(given_title.equals(current_title))
			{
				Thread.sleep(2000);
				System.out.println("you are in Digital downloads page");
				List<WebElement> community = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for(WebElement web:community)
				{
					web.click();
					Thread.sleep(2000);
				}
				Thread.sleep(2000);
				driver.findElement(By.className("cart-label")).click();
				String current_ShoppingCartTitle=driver.getTitle();
				if(given_ShoppingCartTitle.equals(current_ShoppingCartTitle))
				{
					System.out.println("you are in shopping cart page");
					
				}
				else
				{
					System.out.println("you are not in shopping cart page");
				}
			}
			else
			{
				System.out.println("you are not in Digital downloads page");
			}
		}
		
		else
		{
			System.out.println("you are not in web demo shop page");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
