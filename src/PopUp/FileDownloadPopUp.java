package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadPopUp {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://www.agoda.com/");
        driver.findElement(By.xpath("//button[text()='No thanks']")).click();
        driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='20'])[1]"))).click();
       driver.findElement(By.xpath("(//i[@data-selenium='ficon-icon-box'])[3]")).click();
       driver.findElement(By.xpath("(//i[@data-selenium='ficon-icon-box'])[3]")).click();
       WebElement next_month = driver.findElement(By.xpath("//button[@data-selenium='calendar-next-month-button']"));
       next_month.click();
       next_month.click();
       next_month.click();
       driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-20']")).click();
	}

}
