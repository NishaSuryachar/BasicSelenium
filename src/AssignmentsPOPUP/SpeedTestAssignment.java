package AssignmentsPOPUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpeedTestAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.speedtest.net/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
		driver.switchTo().frame("google_ads_iframe_/6692/speedtest.net/stnext_top_rectangle_0");
		driver.findElement(By.xpath("//img[@src='https://tpc.googlesyndication.com/simgad/15520956230169214031']")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.quit();
	}
}
