package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;

	@Given("user navigates to the login page by opening chrome")
	public void launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Ram Ashish Maurya\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

	}

	@When("user enters the correct username and password")
	public void enterValue() {
		driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123");
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("^user is directed to the home page$")
	public void validateURL() {
		Assert.assertEquals("https://demo.guru99.com/test/success.html", driver.getCurrentUrl());
		driver.close();
	}

}
