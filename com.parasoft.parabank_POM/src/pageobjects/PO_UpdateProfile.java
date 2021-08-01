package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_UpdateProfile {

	@FindBy(xpath="//a[normalize-space()='Update Contact Info']")
	public static WebElement updatecontacttab;
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	public static WebElement profileFirstName;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	public static WebElement profileLastName;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	public static WebElement profileAddress;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	public static WebElement profileCity;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	public static WebElement profileState;
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public static WebElement profileZipCode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	public static WebElement profilePhoneNumber;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[8]/td[2]/input")
	public static WebElement updatebutton;
	
	@FindBy(xpath="//h1[normalize-space()='Profile Updated']")
	public static WebElement successmessage;
}
