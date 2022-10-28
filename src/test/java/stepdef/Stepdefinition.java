package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class Stepdefinition {
	WebDriver driver;
	@Given("User must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
	}

	@When("User clicks on Singup button")
	public void user_clicks_on_singup_button() {
	    driver.findElement(By.id("signin2")).click();
	}

	@Then("Singup dialog box should be displayed.")
	public void singup_dialog_box_should_be_displayed() {
	   boolean actual = driver.findElement(By.cssSelector("body")).isDisplayed();
	   Assert.assertEquals(true, actual);
	   driver.close();
	}

}
