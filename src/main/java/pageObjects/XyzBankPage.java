package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Testbase;

public class XyzBankPage extends Testbase {
	
	@FindBy(xpath = "strong.mainHeading")
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
	@FindBy(xpath = "#userSelect")
	WebElement userDrp; //user name to be selected from dropdown
	@FindBy(xpath = "#currency")
	WebElement currencyDrp; //Dollar Pound Rupee
	@FindBy(xpath = "//button[contains(text(),'Process')]")
	WebElement processBtn;
	@FindBy(xpath = "//button[contains(text(),'Customers')]")
	WebElement customerTab;
	@FindBy(xpath = "//td[contains(.,'%s')]//following::td[position()=4]")  
	WebElement customerDelBtn; //customer name to be parameterized
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerLoginBtn;
	@FindBy(xpath = "#userSelect")
	WebElement customerDrp; //customer name to be selected from dropdown
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginBtn;
	@FindBy(xpath = "//button[@class='btn logout']")
	WebElement logoutBtn;
	@FindBy(xpath = "#accountSelect")
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
	
	
	// add customer, open account, verify customer is present
	public void openAccountWithBankerLogin() {
		
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
