package Steps1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignIncForServiceNow  extends BaseClassForServiceNowCucumber {
	@Given("Select the No option from the dropdown and enter the IncidentNo")
	public void searchIncidentNumber() throws InterruptedException {
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		WebElement select = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select drpdwn = new Select(select);
		drpdwn.selectByValue("number");
		WebElement searchINC = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchINC.sendKeys("INC0010015");
		searchINC.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	@Given("Click the Incident number link")
	public void clickOnIncidentNo () {
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	}
	
	@Given("Click on the Assignment group Lookup")
	public void clickAssignmentGroup() {
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[6]")).click();
		Set<String> windowHandlesSet1 = driver.getWindowHandles();
		List <String> windowHandlesList1 = new ArrayList<String>(windowHandlesSet1);
		driver.switchTo().window(windowHandlesList1.get(1));
	}
	
	@Given("Enter {string} in the search box of the child window and select the group")
	public void selectSoftwareGroup(String Software) throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(Software);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		Set<String> windowHandlesSet1 = driver.getWindowHandles();
		List <String> windowHandlesList1 = new ArrayList<String>(windowHandlesSet1);
		driver.switchTo().window(windowHandlesList1.get(0));
		WebElement frameElement3 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frameElement3);	
	}
	
	@Given("Click on Work Notes and enter {string}")
	public void enterWorkNotes(String workNotes) {
		driver.findElement(By.xpath("(//span[@class='icon icon-locked'])[2]")).click();
		driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys(workNotes);
	}
	
	@When("Click on Update button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//button[text()='Update']")).click();
	}
	

}
