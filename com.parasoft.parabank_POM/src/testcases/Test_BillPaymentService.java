package testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonfile.CommonFunctions;
import pageobjects.PO_BillPaymentService;
import pageobjects.PO_login;

public class Test_BillPaymentService extends CommonFunctions {

	String actual = "Bill Payment Complete";
	String expected ="Bill Payment Complete";
	static Logger logger = Logger.getLogger(Test_BillPaymentService.class);
	
	public void login() {

		PageFactory.initElements(driver, PO_login.class);
		PO_login.username.sendKeys(properties.getProperty("username"));
		PO_login.password.sendKeys(properties.getProperty("password"));
		PO_login.button.click();
		System.out.println(PO_login.welcome.getText());
	}

	
	public void paymentconfirmation() {
		PageFactory.initElements(driver, PO_BillPaymentService.class);
		actual = PO_BillPaymentService.paymentconfirmation.getText();
		SoftAssert result = new SoftAssert();
		result.assertEquals(actual, expected);
		System.out.println("The Bill payment Status Completed Successfully");
	
	}
	
	
	@Test
	public void BillPaymentService() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*	login();*/
		
		logger.info("3rd - Bill payment Service Starts");
		PageFactory.initElements(driver, PO_BillPaymentService.class);
		PO_BillPaymentService.Billpay.click();
		PO_BillPaymentService.Payeename.sendKeys(properties.getProperty("PayeeName"));
		PO_BillPaymentService.address.sendKeys(properties.getProperty("Address"));
		PO_BillPaymentService.city.sendKeys(properties.getProperty("City"));
		PO_BillPaymentService.state.sendKeys(properties.getProperty("State"));
		PO_BillPaymentService.zipcode.sendKeys(properties.getProperty("ZipCode"));
		PO_BillPaymentService.phonenumber.sendKeys(properties.getProperty("Phonenumber"));
		PO_BillPaymentService.accountnumber.sendKeys(properties.getProperty("accountnumber"));
		PO_BillPaymentService.verifyaccountnumber.sendKeys(properties.getProperty("accountnumber"));
		PO_BillPaymentService.amount.sendKeys(properties.getProperty("Amt"));
		PO_BillPaymentService.sendpaymentbutton.click();
		paymentconfirmation();
		logger.info("3rd - Bill payment Service Ends");

	}
}