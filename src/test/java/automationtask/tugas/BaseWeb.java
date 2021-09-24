package automationtask.tugas;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseWeb implements IDriverManager {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void createChromeDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.set(new ChromeDriver());
//		driver.get("https://testautomasi.com");
		driver.get().get("https://yopmail.com/en/");
//		driver.manage().window().maximize();
		driver.get().manage().window().maximize();
		
		explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
	}

	@AfterMethod
	public void quitChromeDriver() {
		// TODO Auto-generated method stub
//		driver.quit();
		driver.get().quit();
	}

}
