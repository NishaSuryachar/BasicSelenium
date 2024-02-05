package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException
	{
		//String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]")).click();
		System.out.println(driver.findElement(By.xpath("//a[@class='ico-register']")).getText());
		Thread.sleep(2000);
		driver.close();
	}

}
