package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtilities {
	
	//contains methods for select dropdown, screenshot, multi window handle, tesng asserts, scrollup/down, clickby javascript executor write to notepad
	
	public void selectDropdownValueBy(WebElement locator, String strategy, String value, int index) {
		Select dropdown = new Select(locator);
		
		if(strategy=="value") {
			dropdown.selectByValue(value);
		}
		else if(strategy=="visibletext") {
			dropdown.selectByVisibleText(value);
		}
		else if(strategy=="index") {
			dropdown.selectByIndex(index);
		}
	
		
	}

}
