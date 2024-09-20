package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangehrmPageobject {

	WebDriver ldriver;

	public OrangehrmPageobject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	@CacheLookup
	WebElement txt_username;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txt_password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement click_login;

	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	WebElement view_Dashboard;

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	@CacheLookup
	WebElement profile_dd;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	@CacheLookup
	WebElement logout_btn;

	public void setusername(String uname)
	{
		txt_username.sendKeys("Admin");
	}

	public void setpassword(String pwd)
	{
		txt_password.sendKeys("admin123");
	}

	public void click_loginbtn()
	{
		click_login.click();
	}

	public void view_Dashboard() {

		view_Dashboard.click();
	}

	}
