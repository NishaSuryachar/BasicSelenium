package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAssignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> Buttons = driver.findElements(By.xpath("//div[@class='header-menu']/ul/li"));
		for(WebElement web:Buttons)
		{
		    System.out.println(web.getText());
		    Thread.sleep(1000);
		}
		driver.close();
	}
}
//in this program i used findelements() to find the multiple elements by single parent then traversed using xpath=relative xpath
//that path will find elements and store it in container called buttons 
//web elements their in the list then after find that element i am printing the text like that when i found each element i use to printed that.