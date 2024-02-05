package Listenners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenners.StartListners.class)
public class Skipping 
{
	@Test(timeOut=1000)
   public void m1() throws InterruptedException
   {
		Thread.sleep(3000);
		System.out.println("method from m1()");
   }
	@Test(dependsOnMethods = "m1")
	   public void m2() throws InterruptedException
	   {
			System.out.println("method from m2()");
	   }
}
