import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Downloads/demo-1%20(1).html");
		Thread.sleep(1000);
		//selecting value in a drop down menu by id locator using css selector
	   WebElement web = driver.findElement(By.cssSelector("select[id='standard_cars']"));
	   Thread.sleep(1000);
	   //we have to create a object for the select class after that we have to pass the web element in the constructor
	   Select sel_ref = new Select(web);
	   Thread.sleep(1000);
	   sel_ref.selectByVisibleText("Audi");
	   Thread.sleep(1000);
	   sel_ref.selectByValue("bmw");
	   Thread.sleep(1000);
		sel_ref.selectByIndex(9);
	}
}
//select is a class which have some predefined methods which is used to perform select and deselect for drop down menu
//to use that we have to create a object for the select class after that we have to pass the web element in the constructor
//select and deselect are the non static methods to use that we have to call them by object
//types of drop down menu are : single select drop down menu and multi select drop down menu
//drop down menu is created by using select tag<select>
//values inside drop down menu is created by using option tag<option>
//single select drop down menu in which we can able to perform single action
// methods of single select drop down menu are 
//1.selectByVisibleText(string) eg:sel_ref.selectByVisibleText("Audi");
//2.selectByValue(string)        eg: sel_ref.selectByValue("bmw");
//3.selectByIndex(index number) [we pass int type data inside index] eg:sel_ref.selectByIndex(9);

