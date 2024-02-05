package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		String given_text="Hello Nisha How are you today";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
        al.sendKeys("Nisha");
        Thread.sleep(2000);
        al.accept();
        String current_text = driver.findElement(By.id("demo1")).getText();
        if(given_text.contains(current_text))
        {
        	System.out.println("you have successfully entered the data into the pop-up");
        	System.out.println(current_text);
        	Thread.sleep(2000);
        	driver.close();
        }
        else
        {
        	System.out.println("data is unsuccessfull");
        	driver.close();
        }
      
	}

}
