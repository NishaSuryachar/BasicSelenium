package SelectAndDeselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Downloads/demo-1%20(1).html");
		WebElement web = driver.findElement(By.id("multiple_cars"));
		Select s_ref=new Select(web);
		s_ref.selectByIndex(1);
		s_ref.selectByValue("bmw");
		s_ref.selectByVisibleText("Ford");
		s_ref.selectByIndex(4);
		s_ref.selectByIndex(5);
		s_ref.selectByIndex(6);
		s_ref.selectByIndex(7);
		s_ref.selectByIndex(8);
		s_ref.selectByIndex(9);
		s_ref.selectByIndex(10);
		s_ref.selectByIndex(11);
		s_ref.deselectByIndex(1);
		s_ref.deselectByIndex(2);
	}
}
