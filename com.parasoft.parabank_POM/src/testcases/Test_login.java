package testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfile.CommonFunctions;
import pageobjects.PO_login;

@SuppressWarnings("unused")
public class Test_login extends CommonFunctions {

	Logger logger = Logger.getLogger(Test_login.class);

	@Test
	public void login() {

	/*	logger.info("Logging into the Site");*/
		PageFactory.initElements(driver, PO_login.class);
		PO_login.username.sendKeys(properties.getProperty("username"));
		PO_login.password.sendKeys(properties.getProperty("password"));
		PO_login.button.click();
		System.out.println(PO_login.welcome.getText());
		/*logger.info("Logged in Successfully");*/

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
