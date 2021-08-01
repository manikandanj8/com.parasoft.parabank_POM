package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_login {

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public static WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	@FindBy(xpath = "//input[@value='Log In']")
	public static WebElement button;
	@FindBy(xpath = "//p[@class='smallText']")
	public static WebElement welcome;

	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@name='username']"));
	 * 
	 * }
	 * 
	 * public static WebElement password(WebDriver driver) {
	 * 
	 * return driver.findElement(By.xpath("//input[@name='password']"));
	 * 
	 * }
	 * 
	 * public static WebElement button(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@value='Log In']"));
	 * 
	 * }
	 */
}
