package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonfile.CommonFunctions;
import pageobjects.PO_AccountsOverview;
import pageobjects.PO_login;

public class Test_AccountsOverview extends CommonFunctions {

	static Logger logger = Logger.getLogger(Test_AccountsOverview.class);

	public void login() {

		PageFactory.initElements(driver, PO_login.class);
		/*logger.info("logging into the application");*/
		PO_login.username.sendKeys(properties.getProperty("username"));
		PO_login.password.sendKeys(properties.getProperty("password"));
		PO_login.button.click();
		System.out.println(PO_login.welcome.getText());
	}

	@Test
	public void accountsoverview() {

		login();
		/*logger.info("1st - Account Over view Start");*/
		PageFactory.initElements(driver, PO_AccountsOverview.class);
		PO_AccountsOverview.accoverview.click();
		String bal = PO_AccountsOverview.balance.getText();
		System.out.println("There is an " + bal);
		/*logger.info("1st - Account Over view End");*/

	}
}