package PracticePg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException
	{
		String[] name= {"Nisha","nishams1209@gmail.com","shruthi","shruthi12443@gmail.com"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		List<WebElement> info = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		int i=0;
		for (WebElement web : info)
		{
			web.sendKeys(name[i++]);
			Thread.sleep(1000);
		}
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("hi appa hw you");
		WebElement qty = driver.findElement(By.xpath("//input[@class='qty-input']"));
		qty.click();
		qty.clear();
		qty.sendKeys("4");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("updatecart")).click();

	}

}
