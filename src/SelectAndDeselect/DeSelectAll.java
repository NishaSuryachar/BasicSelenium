package SelectAndDeselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAll {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Downloads/demo-1%20(1).html");
		WebElement web = driver.findElement(By.id("multiple_cars"));
		Select s_ref=new Select(web);
		List<WebElement> a = s_ref.getOptions();
		for(WebElement w:a)
		{
			w.click();
			System.out.println(w.getText());
			Thread.sleep(1000);
		}
		s_ref.deselectAll();
		driver.close();
	}
}
