package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_TransferFunds {

	@FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[3]/a")
	public static WebElement transferfunds;

	@FindBy(xpath = "//input[@id='amount']")
	public static WebElement transferamt;

	@FindBy(xpath = "//select[@id='toAccountId']")
	public static WebElement toaccount;

	/*@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[2]/option[3]")
	public static WebElement toaccountnumber;*/

	@FindBy(xpath = "//input[@value='Transfer']")
	public static WebElement transferbuttonb;
	
	@FindBy(xpath="//h1[normalize-space()='Transfer Complete!']")
	public static WebElement successmessage;

}
