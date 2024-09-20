package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.OrangehrmPageobject;

public class Orangehrmsteps {

	public WebDriver driver;
	public OrangehrmPageobject oh;

	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		oh = new OrangehrmPageobject(driver);
	}

	@When("user enters URL {string}")
	public void user_enters_url(String string) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
	}

	@And("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String uname, String password) {

		oh.setusername(uname);
		oh.setpassword(password);
	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {

		oh.click_loginbtn();

	}

	@And("page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
		} 
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@Then("close the Browser")
	public void close_the_browser() {
		driver.quit();
	}

}
