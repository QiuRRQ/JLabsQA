
package automationtask.tugas;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.Var;


public class AppTest extends BaseWeb {
	basicFunction commonPage = new basicFunction(driver, explicitWait);
	

	@Test
	public void YopMailGetMail() {
		commonPage.openUrl("https://yopmail.com/en/");
		commonPage.setIputText(By.xpath("//input[@id='login']"), "automationtest");
		commonPage.clickButton(By.xpath("//i[@class='material-icons-outlined f36']"));
		commonPage.switchIFrame("ifmail");
		String data = commonPage.extractData(By.xpath("//main[@class='yscrollbar']"));
		
		System.out.println(data);
	}
	
	@Test
	public void TripToAndFrom() {
		commonPage.openUrl("https://www.makemytrip.com/");
		commonPage.clickButton(By.cssSelector(".loginModal.displayBlock.modalLogin.dynHeight.personal"));

		
		commonPage.clickButton(By.xpath("//span[normalize-space()='From']"));
		commonPage.setIputText(By.xpath("//input[@placeholder='From']"), "Delhi");
		String from = commonPage.extractData(By.xpath("//p[normalize-space()='New Delhi, India']"));
		System.out.println(from);
		if(!from.contains("Delhi")) {
			System.out.println("wrong search result, do another algorithm");
		}else {
			commonPage.clickButton(By.xpath("//p[normalize-space()='New Delhi, India']"));
		}
		
		//set to
		commonPage.clickButton(By.cssSelector(".fsw_inputBox.searchToCity.inactiveWidget"));
		commonPage.setIputText(By.xpath("//input[@placeholder='To']"), "jakarta");
		String to = commonPage.extractData(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']//p[normalize-space()='Jakarta, Indonesia']"));
		System.out.println(to);
		if(!to.toLowerCase().contains("jakarta")) {
			System.out.println("wrong search result, do another algorithm on to");
		}else {
			commonPage.clickButton(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']//p[normalize-space()='Jakarta, Indonesia']"));
		}
		 

		//set date
		commonPage.clickButton(By.xpath("//div[@aria-label='Thu Sep 30 2021']"));

		//click search
		commonPage.clickButton(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn"));
		
		//get result di element pertama yang ditemukan, jika hasilnya lebih dari 1 element.
		String result = commonPage.extractData(By.cssSelector("p.blackText.fontSize18.blackFont.white-space-no-wrap"));
		
		String[] hargaTiket = result.split(" ");
		System.out.println(hargaTiket[1]);
	}
}