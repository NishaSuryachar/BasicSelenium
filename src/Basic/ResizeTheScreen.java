package Basic;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ResizeTheScreen {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://example.com");  
		Dimension dimension = new Dimension(800, 600); 
		driver.manage().window().setSize(dimension); 
		driver.manage().deleteAllCookies();
		
		Select s=new Select(WebElement);
		s.selectByIndex(0);
		s.selectByValue("");
		s.selectByVisibleText(null)
	}

}
