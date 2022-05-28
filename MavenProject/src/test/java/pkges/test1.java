package pkges;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

		
			@BeforeClass
			public void beforeClass()
			{
				System.out.println("Before class..Used for launch browser & url code, object");
			}
			
			@BeforeMethod
			public void beforeMethod()
			{
				System.out.println("Before method...LOGIN, object,create");
			}
			
			@Test
			public void testA()
			{
				System.out.println("TestA..To verify the user button");
		    }
			
			@Test
			public void testB()
			{
				System.out.println("TestB..");

			}
			
			@AfterClass
			public void afterClass()
			{
				System.out.println("After class..Close Browser Code");
			}
			
			@AfterMethod
			public void afterMethod()
			{
				System.out.println("After method...LOGOUT");
			}
			
	}


