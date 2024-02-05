package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Downloads/demo-1%20(1).html");
		WebElement single_dropdown = driver.findElement(By.id("standard_cars"));
		WebElement multi_dropdown = driver.findElement(By.id("multiple_cars"));
		Select s1=new Select(single_dropdown);
		Select s2=new Select(multi_dropdown);
		if(s1.isMultiple())
		{
            System.out.println("it is single drop down menu");
			List<WebElement> s1_value = s1.getOptions();
			for(WebElement web:s1_value)
			{
				web.click();
			}
			//s1.deselectAll();
			
		}
		else
		{
			//Thread.sleep(1000);
			System.out.println("it is multiple drop down menu");
			List<WebElement> s2_value = s2.getOptions();
			for(WebElement web:s2_value)
			{
				web.click();
			}
			   driver.close();
			   s2.deselectAll();
		}
		driver.close();
	}

}
