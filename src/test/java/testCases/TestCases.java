/*Test Case 1: Register User
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button*/

package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import elements.LoginPage;


public class TestCases {
	WebDriver driver;	
	LoginPage login;
	
	@BeforeTest
	public void setup() throws IOException {
		 Properties prop =new Properties();
	      FileInputStream ip= new FileInputStream("C:\\Users\\hrigv\\eclipse-workspace\\DemoEcom\\src\\test\\resources\\resources.propertiesFile");
	  	  prop.load(ip);
	  	  String Browser= prop.getProperty("browser");
			if(Browser.equals("edge")) {
				driver= new EdgeDriver();
			}    	
			if(Browser.equals("chrome")) {
				driver= new ChromeDriver();
			}    	
			if(Browser.equals("firefox")) {
				driver= new FirefoxDriver();
			}    	    	
		driver.manage().window().maximize();
		login = new LoginPage(driver);
		}
	@AfterTest
	public void finish() {
		driver.close();
	}
	
  @Test
  public void registerUser() throws InterruptedException, IOException {
	  Properties prop =new Properties();
      FileInputStream ip= new FileInputStream("C:\\Users\\hrigv\\eclipse-workspace\\DemoEcom\\src\\test\\resources\\resources.propertiesFile");
  	  prop.load(ip);
//2. Navigate to url 'http://automationexercise.com'
		driver.get(prop.getProperty("URL"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//3. Verify that home page is visible successfully
		String actualText= login.VerifyHomePage();
		String expectedText= "Home";
		Assert.assertEquals(actualText, expectedText, "We are not in the home page");
//4. Click on 'Signup / Login' button
		login.LoginSignupButton();
//5. Verify 'New User Signup!' is visible
		String actialSignup= login.VerifySignUpPage();
		String expectedSignup= "Login to your account";
		Assert.assertEquals(actialSignup, expectedSignup, "we are in same page");
//6. Enter name and email address
		login.EnterName(prop.getProperty("Name"));
		login.EnterEmail(prop.getProperty("Mail"));

//7. Click 'Signup' button
		login.ClickSignupButton();


//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

		
//9. Fill details: Title, Name, Email, Password, Date of birth
		
		
		
		
	
  }
  }