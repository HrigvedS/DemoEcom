package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
WebDriver driver;
	//Specify the address of WebElement
		By VerifyHome=By.xpath("//a[text()=' Home']");
		By LoginSignup=By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
		By VerifySignup=By.xpath("//h2[text()='Login to your account']");
		By NameField=By.xpath("//input[@placeholder= 'Name']");
		By EmailField=By.xpath("(//input[@placeholder= 'Email Address'])[2]");
		By SignupButton=By.xpath("//button[text()= 'Signup']");
		By ViewDetailpage=By.xpath("//b[text()='Enter Account Information']");
		By GenderMale=By.id("id_gender1");
		By GenderFemale= By.id("id_gender2");
		By NameFieldRegistration = By.xpath("//input[@id='name']");		
		By Password=By.xpath("//*[@id='password']");
		By Day=By.xpath("//select[@id='days']");
		By Month=By.id("months");
		By Year=By.id("years");
		By NewscheckBox=By.xpath("//*[text()='Sign up for our newsletter!']");
		By SpecialOffer=By.xpath("//*[text()='Receive special offers from our partners!']");
		By FirstName=By.id("first_name");
		By LastName=By.id("last_name");
		By Address1=By.id("address1");
		By country=By.id("country");
		By State=By.xpath("//*[@id='state']");
		By City=By.xpath("//*[@id='city']");
		By Zip=By.xpath("//*[@id='zipcode']");
		By MobileNumber=By.xpath("//*[@id='mobile_number']");
		By CreateAccountButton=By.xpath("//*[text()='Create Account']");
		By AccountCreated=By.xpath("//*[text()='Account Created!']");
		By ContinueButton=By.xpath("//*[text()='Continue']");
		By UserName=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");
		By DeleteAcountButton=By.xpath("//*[text()=' Delete Account']");
		By AccountDeleted=By.xpath("//*[text()='Account Deleted!']");
	
		
		

		//All methods
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
		
		public String VerifyAccountPage() {
			return driver.findElement(ViewDetailpage).getText();
		}
		
		public void SelectMale() {
			driver.findElement(GenderMale).click();
		}
		
		public void SelectFeMale() {
			driver.findElement(GenderFemale).click();
		}
		
		public void InputNameRegistration(String Name) {
			driver.findElement(NameFieldRegistration).sendKeys(Name);
			
		}
		
		public void CLearNameRegistration() {
			driver.findElement(NameFieldRegistration).clear();
		
		}
		public void InputPassword(String Pass) {
			driver.findElement(Password).sendKeys(Pass);
		}
		
		public void SelectDayDOB(String i) {
			Select day= new Select(driver.findElement(Day));
			day.selectByVisibleText(i);
		}
		
		public void SelectMonthDOB(String j) {
			Select day= new Select(driver.findElement(Month));
			day.selectByVisibleText(j);
		}
		
		public void SelectYearDOB(String k) {
			Select day= new Select(driver.findElement(Year));
			day.selectByVisibleText(k);
		}
			
		
		 public void NewscheckBoxSelector() {
			 driver.findElement(NewscheckBox);
		 }
		
		public void SpecialOfferSelector() {
			driver.findElement(SpecialOffer).click();
		}
		
		public void FirstNameField(String Fname) {
			driver.findElement(FirstName).sendKeys(Fname);
		}
		
		public void LastNameField(String Lname) {
			driver.findElement(LastName).sendKeys(Lname);
		}
		
		public void AddressField(String Add) {
			driver.findElement(Address1).sendKeys(Add);
		}
		
		public void CountrySelecter(String Country) {
			Select sc= new Select(driver.findElement(country));
			sc.selectByVisibleText(Country);
		}
		
		public void StateField(String Stat) {
			driver.findElement(State).sendKeys(Stat);
		}
		
		public void CityField(String CT) {
			driver.findElement(City).sendKeys(CT);
		}
		
		public void ZipField(String code) {
			driver.findElement(Zip).sendKeys(code);
		}
		
		public void MobileField(String Mnumber) {
			driver.findElement(MobileNumber).sendKeys(Mnumber);
		}
		
		public void CreateAccountButton() {
			driver.findElement(CreateAccountButton).click();;
		}
		
		public String AccountCreatedText() {
			String Expected= driver.findElement(AccountCreated).getText();
			return Expected;
		}
		
		public void ClickContinue() {
			driver.findElement(ContinueButton).click();
		}
		
		public String VerifyUserName() {
			String Expected = driver.findElement(UserName).getText();
			return Expected;
		}

		public void DelectButtonClick() {
			driver.findElement(DeleteAcountButton).click();
		}
		
		public String AccountDeletedText(){
			String Expected= driver.findElement(AccountDeleted).getText();
			return Expected;
		}
		
	}
