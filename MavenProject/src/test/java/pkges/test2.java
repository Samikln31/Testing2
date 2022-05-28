package pkges;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

			
				@BeforeClass
				public void beforeClass()
				{
					System.out.println("Before class");
				}
				
				@BeforeMethod
				public void beforeMethod()
				{
					System.out.println("Before method");
				}
				
				@Test
				public void testA()
				{
					System.out.println("TestA");
			    }
				
				@Test
				public void testB()
				{
					System.out.println("TestB");

				}
				
				@AfterClass
				public void afterClass()
				{
					System.out.println("After class");
				}
				
				@AfterMethod
				public void afterMethod()
				{
					System.out.println("After method...LOGOUT");
				}
				

	}

