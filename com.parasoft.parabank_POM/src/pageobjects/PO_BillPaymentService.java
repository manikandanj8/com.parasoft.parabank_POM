package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_BillPaymentService {

	@FindBy(xpath="//a[normalize-space()='Bill Pay']")
	public static WebElement Billpay;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")
	public static WebElement Payeename;
	
	@FindBy(xpath="//input[@name='payee.address.street']")
	public static WebElement address;
	
	@FindBy(xpath="//input[@name='payee.address.city']")
	public static WebElement city;
	
	@FindBy(xpath="//input[@name='payee.address.state']")
	public static WebElement state;
	
	@FindBy(xpath="//input[@name='payee.address.zipCode']")
	public static WebElement zipcode;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[6]/td[2]/input")
	public static WebElement phonenumber;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")
	public static WebElement accountnumber;
	
	@FindBy(xpath="//input[@name='verifyAccount']")
	public static WebElement verifyaccountnumber;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")
	public static WebElement amount;
	
	@FindBy(xpath="//input[@value='Send Payment']")
	public static WebElement sendpaymentbutton;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/div[2]/h1")
	public static WebElement paymentconfirmation;
}

