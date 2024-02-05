package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSingle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/hp/Downloads/demo-1%20(1).html");
        WebElement single_select = driver.findElement(By.id("standard_cars"));
        Select s=new Select(single_select);
        Thread.sleep(2000);
        s.selectByVisibleText("Audi");
        Thread.sleep(2000);
        s.selectByValue("bmw");
        Thread.sleep(2000);
        s.selectByIndex(7);
	}

}
