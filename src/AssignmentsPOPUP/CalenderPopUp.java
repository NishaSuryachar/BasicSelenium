package AssignmentsPOPUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions coptions=new ChromeOptions();
		coptions.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(coptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://www.redbus.in/");
        Actions a=new Actions(driver);
        driver.findElement(By.id("src")).sendKeys("chennai");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
        a.keyDown(Keys.ENTER).build().perform();
        driver.findElement(By.id("dest")).sendKeys("Bangalore");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']")));
        a.keyDown(Keys.ENTER).build().perform();
        driver.findElement(By.id("onwardCal")).click();
        driver.findElement(By.xpath("//span[text()='20']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("search_button")).click();
        
	}

}
