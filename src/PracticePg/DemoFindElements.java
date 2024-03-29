package PracticePg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFindElements {

	public static void main(String[] args) throws InterruptedException 
	{
		String[] name= {"Nisha","nishams1902@gmail.com","Shruthi","shruthims1901@gmail.com"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		WebElement giftcard = driver.findElement(By.xpath("//span[text()='Gift Cards']"));
        if(giftcard.isDisplayed())
        {
        	System.out.println("you are in giftcard page");
        	List<WebElement> data = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
        	int i=0;
        	for (WebElement web : data) 
        	{
				web.sendKeys(name[i++]);
				Thread.sleep(1000);
			}
        	driver.findElement(By.id("giftcard_2_Message")).sendKeys("Hi happy to see you");
        	WebElement qty = driver.findElement(By.xpath("//input[@class='qty-input']"));
        	qty.clear();
        	qty.sendKeys("2");
        	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
        	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        	
        }
        else
        {
        	System.out.println("you are not in giftcard page");
        }
	}

}
