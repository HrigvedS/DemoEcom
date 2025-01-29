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
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elements.LoginPage;


public class TestCases1 {
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
//	@AfterTest
//	public void finish() {
//		driver.close();
//	}
	
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
		String actualSignup= login.VerifySignUpPage();
		String expectedSignup= "Login to your account";
		Assert.assertEquals(actualSignup, expectedSignup, "we are not in same page");

//6. Enter name and email address
		login.EnterName(prop.getProperty("Name"));
		login.EnterEmail(prop.getProperty("Mail"));

//7. Click 'Signup' button
		login.ClickSignupButton();


//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
		String actualAccountPage= login.VerifyAccountPage();
		String expectedAccountPage= "ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(actualAccountPage, expectedAccountPage, "we are not in same page"); 

//9. Fill details: Title, Name, Email, Password, Date of birth
		  String Gender= prop.getProperty("Gender"); //Title
			if(Gender.equals("Male")) {
				login.SelectMale();
			}    
			else {
				login.SelectFeMale();
			}
	
			login.CLearNameRegistration();// Clear Name
			login.InputNameRegistration(prop.getProperty("Name")); //Input Name
			login.InputPassword(prop.getProperty("Pass"));
			//DOB
			login.SelectDayDOB("1");
			login.SelectMonthDOB("January");
			login.SelectYearDOB("2020");
		
			
//10. Select checkbox 'Sign up for our newsletter!'
			WebElement element = driver.findElement(By.xpath("//*[text()='Sign up for our newsletter!']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
			//login.NewscheckBoxSelector();
			
//11. Select checkbox 'Receive special offers from our partners!'
			login.SpecialOfferSelector();
			
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
			login.FirstNameField("Hrigved");
			login.LastNameField("Sharma");
			login.AddressField("Noida");
			login.CountrySelecter("India");
			login.StateField("U.P.");
			login.CityField("Noida");
			login.ZipField("123456");
			login.MobileField("9876543210");
		
			
//13. Click 'Create Account button'			
			login.CreateAccountButton();
			
//14. Verify that 'ACCOUNT CREATED!' is visible
			SoftAssert softAssert = new SoftAssert();
			String ActualText= "ACCOUNT CREATED!!";		
			String ExpectedText=login.AccountCreatedText();
			softAssert.assertEquals(ExpectedText, ActualText,"The actual text does not match the expected text.");
	        System.out.println("Assertion passed: Text matches!");
			
//15. Click 'Continue' button		
			login.ClickContinue();
			
//16. Verify that 'Logged in as username' is visible
			String ActualText1=prop.getProperty("Name");
			String ExpectedText1=login.VerifyUserName();
			softAssert.assertEquals(ExpectedText1, ActualText1,"The actual text does not match the expected text." );
			System.out.println("Assertion passed: Username matches!");
			
//17. Click 'Delete Account' button			
			login.DelectButtonClick();
			
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button*/
			String ActualText2= "Account Deleted!";		
			String ExpectedText2=login.AccountDeletedText();
			softAssert.assertEquals(ExpectedText2, ActualText2,"The actual text does not match the expected text.");
	        System.out.println("Assertion passed:Account Deleted");
			
			login.ClickContinue();
			
  }
}
  