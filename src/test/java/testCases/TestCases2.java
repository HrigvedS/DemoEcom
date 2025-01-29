/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible*/

package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestCases2 {
WebDriver driver;

@BeforeTest
public void setup() throws IOException {
	Properties prop= new Properties();
	FileInputStream ip= new FileInputStream("C:\\Users\\hrigv\\eclipse-workspace\\DemoEcom\\src\\test\\resources\\resources.propertiesFile");
	  prop.load(ip);
	  
	 String Browser= prop.getProperty("Browser");
	 if(Browser.equals("Chrome")) {
		 driver = new ChromeDriver();
	 }
	 if(Browser.equals("Edge")) {
		 driver = new EdgeDriver();
	 }
	 if(Browser.equals("FireFox")) {
		 driver = new FirefoxDriver();
	 }
		
	
	 
	  
}
	
	
	
}
