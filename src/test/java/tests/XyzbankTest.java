package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.XyzBankPage;
import resources.Testbase;

public class XyzbankTest extends Testbase {

	@Test(groups = {"smoke"})
	public void openAccountWithBankerLogin( ) throws Exception  {
		browserInitialization("Chrome", "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		XyzBankPage bp = new XyzBankPage();
		bp.openAccountWithBankerLogin();
		
		
	}
	
	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
}
