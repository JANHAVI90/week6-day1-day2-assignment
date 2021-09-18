package Steps1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewIncForServiceNow extends BaseClassForServiceNowCucumber {
	@Given("Click on Create New  and save the Incident number")
	public void createIncident() {
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
	

	}
	
	@Given("Enter {string} and {string}")
	public void enterCallernameAndDescription(String caller, String ShortDescription) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys(caller);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys(ShortDescription);

	}
	
	@Given("Click on Submit button")
	public void clickSubmit() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
	
	
	
}