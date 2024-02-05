package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickDisabledElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		WebElement download_link = driver.findElement(By.partialLinkText("jdk-11.0.21_windows-x64_bin.zip"));
		//scrolling upto particular webelement
	    je.executeScript("arguments[0].scrollIntoView(false);",download_link);
	    //after scrolled we clicked that same element
        download_link.click();
        WebElement disabled = driver.findElement(By.partialLinkText("Download jdk-11.0.21_windows-x64_bin.zip"));
        //here we are clicking disabled element without clicking on checkbox
        je.executeScript("arguments[0].click();",disabled);
	}
}
