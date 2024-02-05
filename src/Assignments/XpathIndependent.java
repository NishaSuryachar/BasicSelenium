package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndependent {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
	    WebElement album = driver.findElement(By.xpath("(//a[text()='3rd Album'])/../../div[3]/div/span"));
	    System.out.println(album.getText());
		
	}

}
