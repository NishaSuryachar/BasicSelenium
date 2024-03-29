package PracticePg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(PracticePg.ListMock.class)
public class TestMethods 
{
	@Test(timeOut = 1000)
   public void m1() throws InterruptedException
   {
		Thread.sleep(2000);
		System.out.println("m1");
   }
	@Test(dependsOnMethods = "m1")
	 public void m2()
	   {
		 System.out.println("m2");
	   }
}
