package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import commonfile.CommonFunctions;
import pageobjects.PO_TransferFunds;
import pageobjects.PO_login;

public class Test_TransferFunds extends CommonFunctions {

	String actualmessage = null;
	

	public void login() {

		PageFactory.initElements(driver, PO_login.class);
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		PO_login.username.sendKeys(properties.getProperty("username"));
		PO_login.password.sendKeys(properties.getProperty("password"));
		PO_login.button.click();
		System.out.println(PO_login.welcome.getText());
	}

	public void selecttoaccount() {
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		PageFactory.initElements(driver, PO_TransferFunds.class);
		Actions action = new Actions(driver);
		action.moveToElement(PO_TransferFunds.toaccount);
		action.click().build().perform();
		Select select = new Select(PO_TransferFunds.toaccount);
		select.selectByIndex(2);
	}

	public void successmessag() {

		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		PageFactory.initElements(driver, PO_TransferFunds.class);
		actualmessage = PO_TransferFunds.successmessage.getText();

		/*
		 * SoftAssert message = new SoftAssert(); message.assertEquals(actual,
		 * expected); System.out.println("Amount Transfer Successfull");
		 */
	}

	@Test
	public void transferfunds() {

		PageFactory.initElements(driver, PO_TransferFunds.class);
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		/*login();*/
	
		PO_TransferFunds.transferfunds.click();
		PO_TransferFunds.transferamt.sendKeys(properties.getProperty("Transferamt"));
		selecttoaccount();
		PO_TransferFunds.transferbuttonb.click();
		successmessag();
		org.testng.Assert.assertEquals(actualmessage, "Transfer Complete!");
		
	}

}
