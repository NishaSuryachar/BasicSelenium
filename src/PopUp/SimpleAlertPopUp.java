package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
