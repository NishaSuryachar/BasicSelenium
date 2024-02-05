package PracticePg;

import java.time.Duration;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableJavaScriptExecutor {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement macos = driver.findElement(By.xpath("//a[text()='jdk-11.0.21_macos-aarch64_bin.tar.gz']"));
        js.executeScript("arguments[0].scrollIntoView(false);", macos);
        macos.click();
        WebElement disable = driver.findElement(By.xpath("//a[text()='Download jdk-11.0.21_macos-aarch64_bin.tar.gz']"));
        js.executeScript("arguments[0].click();", disable);
	}

}
