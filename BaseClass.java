package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Week5.day2.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ChromeDriver driver;
	public String fileName;	
	@DataProvider
	public String[][] sendData() throws IOException {
		
		return ReadExcel.readData(fileName);
	}	
	@Parameters ({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
@AfterMethod
	public void postCondition() {
	driver.close();
	
}
	}


