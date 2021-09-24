package automationtask.tugas;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AppTest extends BaseWeb {
	basicFunction commonPage = new basicFunction(driver, explicitWait);
	

	@Test
	public void testSwitching() {
		commonPage.setIputText(By.xpath("//input[@id='login']"), "automationtest");
		commonPage.clickButton(By.xpath("//i[@class='material-icons-outlined f36']"));
		commonPage.switchIFrame("ifmail");
		String data = commonPage.extractData(By.xpath("//main[@class='yscrollbar']"));
		
		System.out.println(data);
	}
}