package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//all @annotation part tht means findby
	
	@FindBy (xpath= "//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@name='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()='Log In']")
	private WebElement login;
	
	@FindBy (xpath= "//div[@aria-label='Your profile']")
	private WebElement yourProfile;
	
	@FindBy (xpath= "//span[text()='Log Out']")
	private WebElement logOut;
	
	
	//constructor creatio and pass he object ,also pass the driver as like we write =new chromedriver type 
	
	public LoginPage(WebDriver driver)    
	{
		PageFactory.initElements(driver, this);   //pagefactory is a class whoes having initelment method and this ny initialise
	}
	
	//method creation 
	
	public void sendUserName()
	{
		email.sendKeys("samikshakalan31@gmail.com");
	}
	
	public void sendPassword()
	{
		password.sendKeys("Slack3102#");
	}
	
	public void selectLogin()
	{
		login.click();
	}
	
	public void selectYourProfile()
	{
		yourProfile.click();
	}
	
	public void selectLogout()
	{
		logOut.click();
	}
}
