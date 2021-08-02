package testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonfile.CommonFunctions;
import pageobjects.PO_UpdateProfile;
import pageobjects.PO_login;

public class Test_UpdateProfile extends CommonFunctions {

	String actualmessage = null;
	
	
	public void login() {

		PageFactory.initElements(driver, PO_login.class);
		PO_login.username.sendKeys(properties.getProperty("username"));
		PO_login.password.sendKeys(properties.getProperty("password"));
		PO_login.button.click();
		System.out.println(PO_login.welcome.getText());

	}

	public void successmessage() {

		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		PageFactory.initElements(driver, PO_UpdateProfile.class);
		actualmessage = PO_UpdateProfile.successmessage.getText();
		Assert.assertEquals(actualmessage, "Profile Updated");
		System.out.println("Profile Updated Successfully");

	}

	@Test
	public void updateprofile() {

		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		/*login();*/
	
		PageFactory.initElements(driver, PO_UpdateProfile.class);
		PO_UpdateProfile.updatecontacttab.click();
		PO_UpdateProfile.profileFirstName.sendKeys(properties.getProperty("ProfileFirstName"));
		PO_UpdateProfile.profileLastName.sendKeys(properties.getProperty("ProfileLastName"));
		PO_UpdateProfile.profileAddress.sendKeys(properties.getProperty("ProfileAddress"));
		PO_UpdateProfile.profileCity.sendKeys(properties.getProperty("ProfileCity"));
		PO_UpdateProfile.profileState.sendKeys(properties.getProperty("ProfileState"));
		PO_UpdateProfile.profileZipCode.sendKeys(properties.getProperty("ProfileZipCode"));
		PO_UpdateProfile.profilePhoneNumber.sendKeys(properties.getProperty("ProfilePhoneNumber"));
		PO_UpdateProfile.updatebutton.click();
		successmessage();
	

	}

}
