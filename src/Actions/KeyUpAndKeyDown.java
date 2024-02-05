package Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyUp(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.PAGE_UP).build().perform();
		a.keyUp(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.F5).build().perform();
		a.keyUp(Keys.F5).build().perform();
		Thread.sleep(1000);
		driver.close();

	}

}
