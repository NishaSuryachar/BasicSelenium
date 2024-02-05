package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathindy {

	public static void main(String[] args) throws InterruptedException
	{
		String given_text="Digital downloads";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement digital = driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])"));
		String current_text=digital.getText();
		if(given_text.equalsIgnoreCase(current_text))
		{
			digital.click();
			System.out.println("you are in digital downloads page");
			WebElement pro = driver.findElement(By.xpath("(//a[text()='3rd Album'])/../../h2/following-sibling::div[3]/div/span"));
			System.out.println(pro.getText());
			WebElement product = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/../../h2/following-sibling::div[3]/div/span"));
			System.out.println(product.getText());
			WebElement prod = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../h2/following-sibling::div[3]/div/span"));
			System.out.println(prod.getText());
			driver.close();
		}
		else
		{
			System.out.println("you are not in digital downloads page");
		}
	}
}
//here we are fetching the text using xpath independent and dependent ,by traversing to parent and child
//shortcut to move to parent tag is = ..
//shortcut to move to child tag is = we can use direct tag name
//to move to siblings in forward or downwards syntax is = /following-sibling::tagname
//to move to siblings in backward or upwards syntax is = /preceding-sibling::tagname