package pkges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomPackage.LoginPage;

public class faceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.sendUserName();
		loginpage.sendPassword();
		loginpage.selectLogin();
		loginpage.selectYourProfile();
		
		
		String url= driver.getCurrentUrl();
		String title=driver.getTitle();
		
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("Pass the test");
		}
		else
		{
			System.out.println("Failed the test");
		}
		
		loginpage.selectLogout();
	}

}
