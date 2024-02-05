package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {

	public static void main(String[] args) throws InterruptedException
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to that particular web page
		driver.get("https://demowebshop.tricentis.com/");
		 //after navigate we call sleep() to wait for 2 sec
		Thread.sleep(2000);
		//here we perform first we find the web elements then clicking that element 
		driver.findElement(By.className("ico-login")).click();
	}
}
//1.find elements()=it is webdriver it is used to find the web elements in the web page it retuns single element
//2.by = is a class name ,it is a  abstract class it have a 8 static locators methods 
//         to use static method we use class name.
//3.classname = it is locator so,we called it by class name
//4.classname = it accept the value inside it, we copied it from code "class name" by inspect the web element
//5.click() = it is web element method ,we use this to click the web element automatically.

//*****className()=when we have single value without space ,we use this
//*****we should use this method when we have a multiple values.