package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAssFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		String[] name= {"Nisha","m"};
		String[] email={"Nisha123@gmail.com"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Ffriends&locale=en_GB&display=page");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='clearfix _58mh']/div/div/div/input"));
		int i=0;
		for(WebElement web:elements)
		{
			web.sendKeys(name[i++]);
			Thread.sleep(1000);
		}
		driver.findElement(By.id("u_0_g_zu")).sendKeys(email);
		
		
		driver.close();
		
	}

}
