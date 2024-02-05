package AssignmentsPOPUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopAssignment {

	public static void main(String[] args)
	{
		ChromeOptions coptions=new ChromeOptions();
		coptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(coptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://www.redbus.in/");
        Actions a=new Actions(driver);
        driver.findElement(By.id("src")).sendKeys("Hyderabad");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Hyderabad']")));
        a.keyDown(Keys.ENTER).build().perform();
        driver.findElement(By.id("dest")).sendKeys("chennai");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Vellore Bypass']")));
       a.keyDown(Keys.ENTER).build().perform();
       
	}

}
