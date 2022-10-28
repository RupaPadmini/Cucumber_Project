package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	}

	@When("click on Login button")
	public void click_on_login_button() throws InterruptedException {
	    driver.findElement(By.id("login2")).click();
	    Thread.sleep(3000);
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
	    driver.findElement(By.id("loginusername")).sendKeys(username);
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginpassword")).sendKeys(password);
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-secondary")).click();
	    
	}

	@SuppressWarnings("deprecation")
	@Then("User account should be opened")
	public void user_account_should_be_opened() throws InterruptedException {
		String actualres = driver.getCurrentUrl();
		Assert.assertEquals("https://demoblaze.com/", actualres);
		Thread.sleep(2000);
		driver.close();
	}

}
