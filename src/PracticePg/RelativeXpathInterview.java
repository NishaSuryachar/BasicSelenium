package PracticePg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpathInterview {

	public static void main(String[] args) throws InterruptedException
	{
		String[] name= {"nisha","nisha143@gmail.com","shruthi","shru5678@gmail.com"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(dropdown);
		List<WebElement> option = s.getOptions();
		int i=0;
		for (WebElement w : option)
		{
			dropdown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
			s=new Select(dropdown);
			s.selectByIndex(i++);
		args    
		}
	}

}
