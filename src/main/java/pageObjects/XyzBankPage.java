package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import resources.TestUtilities;
import resources.Testbase;

public class XyzBankPage extends Testbase {
	
	@FindBy(xpath = "//strong[@class = 'mainHeading']")
	WebElement header;
	@FindBy(xpath = "//button[contains(.,'Home')]")
	WebElement homeBtn;
	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement bankerLoginBtn;
	@FindBy(xpath = "//button[contains(.,'Add Customer') and @ng-class='btnClass1']")
	WebElement customertab;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last Name' and @type='text']")
	WebElement lastName;
	@FindBy(xpath = "//label[contains(.,'Post Code :')]/following::input")
	WebElement postcode;
	@FindBy(xpath = "//button[contains(.,'Add Customer') and @type='submit']")
	WebElement addCustomerBtn;
	@FindBy(xpath = "//button[contains(text(),'Open Account')]")
	WebElement openAccountBtn;
	@FindBy(xpath = "//select[@id= 'userSelect']")
	WebElement userDrp; //user name to be selected from dropdown
	@FindBy(xpath = "//select[@id= 'currency']")
	WebElement currencyDrp; //Dollar Pound Rupee
	@FindBy(xpath = "//button[contains(text(),'Process')]")
	WebElement processBtn;
	@FindBy(xpath = "//button[contains(text(),'Customers')]")
	WebElement customerTab;
	@FindBy(xpath = "//td[contains(.,'Vinay')]//following::td[position()=4]")  
	WebElement customerDelBtn; //customer name to be parameterized
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerLoginBtn;
	@FindBy(xpath = "//select[@id= 'userSelect']")
	WebElement customerDrp; //customer name to be selected from dropdown
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginBtn;
	@FindBy(xpath = "//button[@class='btn logout']")
	WebElement logoutBtn;
	@FindBy(xpath = "//select[@id= 'accountSelect']")
	WebElement accountDrp;
	@FindBy(xpath = "//button[contains(text(),'Deposit') and @ng-class='btnClass2']")
	WebElement depositTab;
	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement amountInput; //common for deposit & withdraw
	@FindBy(xpath = "//button[contains(.,'Deposit') and @type='submit']")
	WebElement depositBtn;
	@FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
	WebElement withdrawTab;
	@FindBy(xpath = "//button[contains(text(),'Withdraw') and @type='submit' ]")
	WebElement withdrawBtn;
	@FindBy(xpath = "//button[contains(text(),'Transactions')]")
	WebElement tansactionsBtn;
	@FindBy(xpath = "//button[contains(text(),'Back')]")
	WebElement backBtn;
	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	WebElement resetBtn;
	@FindBy(xpath = "#start")
	WebElement startDate; //format dd-mm-yyyy --:--
	@FindBy(xpath = "#end")
	WebElement endDate; //format dd-mm-yyyy --:--
	
	
		
	public XyzBankPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	// url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
	
	TestUtilities utils = new TestUtilities();
	// add customer, open account, verify customer is present
	public void openAccountWithBankerLogin() {
		
		explicitWait.until(ExpectedConditions.visibilityOf(header));
		bankerLoginBtn.click();
		
		//customer registration
		customertab.click();
		firstName.sendKeys("Vinay");
		lastName.sendKeys("Dev");
		postcode.sendKeys("560102");
		addCustomerBtn.click();
		String customerStatus = driver.switchTo().alert().getText();
		if(customerStatus.contains("Customer added successfully")) {
			System.out.println("Customer added successfully!");
			
		}
		else {
			System.out.println("customer regristration failed!");
		}
		driver.switchTo().alert().accept();
		
		//account creation
		openAccountBtn.click();
		utils.selectDropdownValueBy(userDrp, "visibletext", "Vinay Dev", 0);
		utils.selectDropdownValueBy(currencyDrp, "value", "Rupee", 0);
		processBtn.click();
		String accountStatus = driver.switchTo().alert().getText();
		if(accountStatus.contains("Account created successfully")) {
			System.out.println("Account created successfully!");
			
		}
		else {
			System.out.println("Account creation failed!");
		}
		driver.switchTo().alert().accept();
		
		//Verify account is present in the list
		customerTab.click();
		if(customerDelBtn.isDisplayed()) {
			System.out.println("Account is present in the list!");
		}
	}
	

	// create multiple account for same user, verify balance and other details for all accounts.	
	public void openMultipleAccountsForSameUserWithBankerLogin() {
		
	}
	
	// customer login, deposit, withdraw, verify balance, verify transactions
	public void performTransactionsAndVerifyInCustomerLogin() {
		
	}
	
	// search and delete user from the list
	public void deleteCustomerAccountWithBankerLogin() {
		
	}
	
	
}
