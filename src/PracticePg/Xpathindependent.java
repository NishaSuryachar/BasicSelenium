package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathindependent {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		WebElement music = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div/child::span"));
		System.out.println(music.getText());
	}
}
