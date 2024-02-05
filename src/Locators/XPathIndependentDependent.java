package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathIndependentDependent {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(1000);
		WebElement pro = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div/child::span"));
		System.out.println(pro.getText());
		driver.close();
	}
}
//here we are using independent and dependent xpath for dynamic web elements
//we are not using this independent and dependent xpath for every web element we are using this for only the web elements which are dynamically changes
//eg:price of tbe products
//for that ,first we find the static[which is not changed] web element ,and take the text from it using text()"(//a[text()='text'])[1]
//we check common parent for both static and dynamic web element 
//then move to parent by traverse from static web element to parent 
//eg:  //a[text()='Music 2'])[1]/parent::h2/parent::div
//then after we reached to parent tag then we come to child by traversing
//eg: "(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div/child::span"
//once we reached to targeted element copy that path and paste it.