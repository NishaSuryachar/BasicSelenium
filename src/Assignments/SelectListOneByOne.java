package Assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectListOneByOne {

	public static void main(String[] args) throws InterruptedException
	{
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into the web page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		//clicking the web element BOOK
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		//sortby id store it in a container to pass into select class constructor to use getoptions() which is present in select class   
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		//passing web element into select class constructor
		Select s=new Select(sort_by);
		//to get all items in the sortby drop down menu we call a getOptions()[it is a list] store it in a list container
        List<WebElement> options = s.getOptions();	
        //initializing i to 0 for futher iteration
        int i=0;
        //we use a for each loop to iterarte items in the options 
        for(WebElement w:options)
        {
        	////sortby id store it in a container
        	sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        	//passing web element into select class constructor
    		s=new Select(sort_by);
    		//here we are selecting one by one items in the sort by drop down menu by using indexing with incrementation
        	s.selectByIndex(i++);
        	Thread.sleep(2000);
		}
        //close the browser
        driver.close();
	}
}

//in this program again we are initialize web element to container in the line number[37]and pass it in a select constructor 
//because we use this type for dynamic pages ,means web page will get loaded after selecting each item
//after loaded or refreshed ,the web element is expired or stale so that we get exception called staleElementException
//to overcome this we need to initialize web element for every iteration then passed into select class 
//then we called [select class] method i.e selectByIndex(i++)
//so that we select item one by one in drop down by using loop











