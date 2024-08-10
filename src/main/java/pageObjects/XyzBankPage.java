package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Testbase;

public class XyzBankPage extends Testbase {
	
	@FindBy(xpath = "heruofhreo")
	WebElement btn1;
	
	public XyzBankPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void fillxyzBankform() {
		hitUrlInSelectedBrowser("chrome", "rhebfhr.com");
		btn1.click();
	}
	
}
