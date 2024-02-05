package Assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAssi {

	public static void main(String[] args)
	{
		String given_text="Featured products";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement featured_products = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		String current_text=featured_products.getText();
		if(given_text.equalsIgnoreCase(current_text))
		{
			System.out.println("enterning into demo page successfull");
			List<WebElement> products = driver.findElements(By.xpath("html/body/div[4]/div[1]/div[2]/ul[1]/li"));
			
		}
		else
		{
			System.out.println("enterning into demo page unsuccessfull");
		}
		}

}
