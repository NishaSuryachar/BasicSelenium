package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValues {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	    WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
	    Select s1=new Select(sort_by);
	    Thread.sleep(1000);
	    s1.selectByVisibleText("Price: High to Low");
	    WebElement display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	    Select s2=new Select(display);
	    Thread.sleep(1000);
	    s2.selectByVisibleText("12");
	    WebElement view_as = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	    Select s3=new Select(view_as);
	    Thread.sleep(1000);
        s3.selectByVisibleText("List");	
        driver.close();
	}

}
