package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_AccountsOverview {
	
	@FindBy(xpath="//a[normalize-space()='Accounts Overview']")
	public static WebElement accoverview;
	
	@FindBy(xpath="//th[normalize-space()='Available Amount']")
	public static WebElement balance;
	

}
