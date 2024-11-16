package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	//Specify the address of WebElement
		By VerifyHome=By.xpath("//a[text()=' Home']");
		By LoginSignup=By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
		By VerifySignup=By.xpath("//h2[text()='Login to your account']");
		By NameField=By.xpath("//input[@placeholder= 'Name']");
		By EmailField=By.xpath("//input[@placeholder= 'Email Address']");
		By SignupButton=By.xpath("//button[text()= 'Signup']");
		
		
		public LoginPage(WebDriver driver) {
			this.driver= driver;
		}

		public String VerifyHomePage() {
			return driver.findElement(VerifyHome).getText();
		}
		
		public void LoginSignupButton() {
			driver.findElement(LoginSignup).click();

		}
		public String VerifySignUpPage() {
			return driver.findElement(VerifySignup).getText();
			
		}
		public void EnterName(String name) {
			driver.findElement(NameField).sendKeys(name);
			
		}
		public void EnterEmail(String Email) {
			driver.findElement(EmailField).sendKeys(Email);
		}
		
		public void ClickSignupButton() {
			driver.findElement(SignupButton).click();
		}
		
		
	}