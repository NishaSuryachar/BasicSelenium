package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul[1]/li[5]/a")).click();
        WebElement element=driver.findElement(By.xpath("//a[text()='3rd Album']"));
        System.out.println(element.getText());
	}

}
