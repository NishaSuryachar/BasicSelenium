package PracticePg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProductswithabsolute {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> products = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/ul[1]/li/a"));
	    for(int i=0;i<products.size();i++)
        {
	    	System.out.println(products.get(i).getText());
	    	
        }
		for (WebElement w : products)
		{
			System.out.println(w.getText());
		}
	}

}
