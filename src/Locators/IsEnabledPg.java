package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledPg {
    public static WebDriver driver;
	public static String given_url="https://demowebshop.tricentis.com/25-virtual-gift-card";
	public static void chromeBrowser(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();}
	public static void closeBrowser(){
		driver.close();}
	public static void openDWS() throws InterruptedException{
		driver.get("https://demowebshop.tricentis.com/");
		String[] name= {"Nisha M S","Nishams1902@gmail.com","Nisha","Nishams1902@gmail.com"};
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
		if(element.isDisplayed()){
			System.out.println("you are in Welcome to our store page");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			Thread.sleep(2000);
			String current_url=driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			if(given_url.equals(current_url))	{
				System.out.println("you are in Virtual Gift Card page");
				Thread.sleep(1000);
				List<WebElement> giftcard = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
				int i=0;
				for(WebElement web:giftcard){
					web.sendKeys(name[i++]);
					Thread.sleep(1000);}
				Thread.sleep(1000);
				driver.findElement(By.xpath("//textarea[@ id='giftcard_2_Message'] ")).sendKeys("may this year brings you lot of happiness and joy Happy Advance x-mas and Advance happy new year");
				Thread.sleep(1000);
				WebElement qty = driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));
				qty.clear();
				qty.sendKeys("2");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@class='cart-label']")).click();
				WebElement shopping_cart = driver.findElement(By.xpath("//div[@class='page-title']"));
				if(shopping_cart.isDisplayed())	{
					System.out.println("you are in shopping cart page");
				 WebElement checkBox = driver.findElement(By.xpath("//input[@name='removefromcart']"));
				 checkBox.click();
				 if(checkBox.isSelected()) {
					 System.out.println("checkbox is selected");
					 WebElement update_cart = driver.findElement(By.xpath("//input[@name='updatecart']"));
					 if(update_cart.isEnabled()) {
						 System.out.println("updatecart click is enabled");
						 update_cart.click();
					 }else {
						 System.out.println("updatecart click is  not  enabled");
					 } } else {
					 System.out.println("checkbox is not selected");
					   } }else{
					System.out.println("you are not in shopping cart page");
				}}else{
				System.out.println("you are not in Virtual Gift Card page");
			}}else{
			System.out.println("you are not Welcome to our store page");
			}}
	public static void main(String[] args) throws InterruptedException	{
		chromeBrowser();
		openDWS();
		closeBrowser();	}}
//isenabled()-return type of isenabled() is boolean,it return true ,to check whether it is enabled or not
//isSelected()=return type of isSelected() is boolean,it return true ,to check whether it is selected  or not