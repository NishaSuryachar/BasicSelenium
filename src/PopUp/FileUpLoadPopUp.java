package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpLoadPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.naukri.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        Thread.sleep(1000);
        Actions a=new Actions(driver);
        Thread.sleep(1000);
        a.keyDown(Keys.PAGE_DOWN).build().perform();
        a.keyDown(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        //here for upload web element we are passing path of the file
        driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\hp\\Downloads\\Resume.pdf");
        driver.close();
	}
}
//for fileupload popup always we have to use input tag only otherwise it won't work
