package Steps1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateIncForServiceNow extends BaseClassForServiceNowCucumber {
	@Given("Select the No option from the dropdown and enter the IncidentNo")
	public void enterIncidentNo( ) throws InterruptedException {
		WebElement frameElement1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frameElement1);
		
		WebElement selectWebElement = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select drpdwn = new Select(selectWebElement);
		drpdwn.selectByValue("number");
		WebElement searchINC = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchINC.sendKeys("INC0010015");
		searchINC.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	@Given("Click on the Incident number link")
	public void clickIncidentNo() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	}
	
	@Given("Click on lookup and select the {string} as {string}")
	public void updateUrgencyState(String option, String number) {
		WebElement selectElement1 = driver.findElement(By.xpath("//select[@name='incident."+option+"']"));
		Select drpdwn1= new Select(selectElement1);
		drpdwn1.selectByValue(number);
		
	}
	
	@Given("Click on Update button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//button[text()='Update']")).click();
	}
	
	
}
