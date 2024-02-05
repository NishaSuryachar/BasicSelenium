package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FetchTheWindowHandle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String dws = driver.getWindowHandle();
		System.out.println(dws);
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Set<String> twitter = driver.getWindowHandles();
		System.out.println(twitter);
		driver.quit();
	}

}
