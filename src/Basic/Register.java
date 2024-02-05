package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female" )).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName" )).sendKeys("Nisha");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName" )).sendKeys("M S");
		Thread.sleep(1000);
		driver.findElement(By.id("Email" )).sendKeys("nishams991@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Nisha123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Nisha123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
