package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndependent {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(1000);
		WebElement product = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/../../h2/following-sibling::div[3]/div/span"));
		System.out.println(product.getText());
		driver.close();
	}

}
