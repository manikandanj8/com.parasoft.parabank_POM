package commonfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static Properties properties = null;
	public static WebDriver driver = null;

	public Properties loadpropertyfile() throws IOException {

		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;

	}

	@BeforeSuite
	public void launchbrowser() throws IOException {
		loadpropertyfile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverlocation = properties.getProperty("driverlocation");

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\manik\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\manik\\Downloads\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void teardown() throws InterruptedException {

		WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Log Out']"));
		logout.click();
		
		Thread.sleep(5000);
		driver.quit();
	

	}

}
