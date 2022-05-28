package pkges;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomPackage.LoginPage;


public class VerifyLoginPage

{
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@BeforeMethod
	public void loginToApplication()
	{
		driver.get("https://www.facebook.com/");
		
		loginpage=new LoginPage(driver);
		
		loginpage.sendUserName();
		loginpage.sendPassword();
		loginpage.selectLogin();
		loginpage.selectYourProfile();
	}
	
	@Test
	public void verifylink()
	{
		String url= driver.getCurrentUrl();
		String title=driver.getTitle();
		
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("Pass the test");
		}
		else
		{
			System.out.println("Failed the test");
			System.out.println("failed");
		}
	}
	
	@AfterMethod
	public void logoutapplication()
	{
		loginpage.selectLogout();
	}
	
	@AfterClass
	public void tabclose()
	{
		driver.close();
	}
}
