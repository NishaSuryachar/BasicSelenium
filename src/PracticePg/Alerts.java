package PracticePg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	    driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		al.accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		al.sendKeys("Nisha");
		al.accept();
		WebElement text = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(text.getText());
		

	}

}
