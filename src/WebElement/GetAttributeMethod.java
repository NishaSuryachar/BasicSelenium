package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args)
	{
		//we are storing attribute value in the container[value]
		String value="Search store";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into the web page
		driver.get("https://demowebshop.tricentis.com/");
		//finf element then store it in a container
		WebElement search = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		//we use web element method called [getAttribute("value");] to get the value of a attribute
		String attribute_value = search.getAttribute("value");
		//printing the value of the attribute
		System.out.println(attribute_value);
		//verifying the given and fetched attribute value
		if(value.equals(attribute_value))
		{
			System.out.println("you are script is correct");
		}
		else
		{
			System.out.println("you are script not is correct");
		}
		driver.close();
	}
}