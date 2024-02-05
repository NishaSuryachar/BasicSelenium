package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder
{

		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("before suite");
		}
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("before class");
		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("before Method");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("After test");
		}
		@Test
		public void test()
		{
			System.out.println("test");
		}
		@Test
		public void test123()
		{
			System.out.println("test123");
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("after Method");
		}
		@AfterClass
		public void Afterclass()
		{
			System.out.println("After class");
		}
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("before test");
		}
	    @AfterSuite
		public void Aftersuite()
		{
			System.out.println("After suite");
		}
}


