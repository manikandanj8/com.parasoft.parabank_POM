package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfile.CommonFunctions;
import pageobjects.PO_login;


public class Test_login extends CommonFunctions {

	

	@Test
	public void login() {

	
		PageFactory.initElements(driver, PO_login.class);
		PO_login.username.sendKeys(properties.getProperty("username"));
		PO_login.password.sendKeys(properties.getProperty("password"));
		PO_login.button.click();
		System.out.println(PO_login.welcome.getText());


		/* PO_login po_login = new PO_login(); */
		/*
		 * PO_login.username(driver).sendKeys("testlogin");
		 * PO_login.password(driver).sendKeys("Sachin@1525");
		 * PO_login.button(driver).click();
		 */

		/*
		 * WebElement username =
		 * driver.findElement(By.xpath("//input[@name='username']"));
		 * username.sendKeys("testlogin"); WebElement password =
		 * driver.findElement(By.xpath("//input[@name='password']"));
		 * password.sendKeys("Sachin@1525"); WebElement button =
		 * driver.findElement(By.xpath("//input[@value='Log In']")); button.click();
		 */

	}
}
