package PracticePg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWebElement {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date = LocalDateTime.now();
        String time = date.toString().replace(":", "-");
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.id("Email")).sendKeys("pallavi1901@gmail.com");
 	   driver.findElement(By.id("Password")).sendKeys("Pallavi123");
 	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        WebElement capture = driver.findElement(By.xpath("//div[@class='returning-wrapper']"));
        File from = capture.getScreenshotAs(OutputType.FILE);
        File to = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\"+"1"+time+".png");
        FileHandler.copy(from, to);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
  	  //Thread.sleep(1000);
        driver.findElement(By.name("register-button")).click();
        WebElement register_capture = driver.findElement(By.xpath("//div[@class='page registration-page']"));
        File fromm = register_capture.getScreenshotAs(OutputType.FILE);
        File too = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\"+"2"+time+".png");
        FileHandler.copy(fromm, too);
	}

}
