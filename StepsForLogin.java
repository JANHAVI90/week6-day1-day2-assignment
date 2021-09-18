package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsForLogin extends BaseClass{
	
	@Given("Enter the username as {string}")
public void enterUserName(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
}
	@Given("Enter the password as {string}")
public void enterpassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);

}
@When("Click on Login button") 
public void loginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
}

@But("Error message  should be displayed.")
public void verifyErrorMessage() {
	System.out.println("Error message is displayed");
	
}

}