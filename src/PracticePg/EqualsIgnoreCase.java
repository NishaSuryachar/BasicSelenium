package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualsIgnoreCase {

	public static void main(String[] args)
	{
		String given_text="Featured products";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement prod = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		String current_text=prod.getText();
        if(given_text.equalsIgnoreCase(current_text))
        {
        	System.out.println("it is Featured products");
        }
        else
        {
        	System.out.println("it is not Featured products");
        }
	}

}
