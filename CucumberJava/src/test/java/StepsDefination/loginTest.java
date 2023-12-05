package StepsDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest {
	WebDriver driver;
	
	@Given("user should be on yahoo page")
	public void user_should_be_on_yahoo_page() {
	 driver = new FirefoxDriver();
	 driver.get("https://www.yahoo.com/");
	}

	@When("user click on news")
	public void user_click_on_news() throws InterruptedException {
		driver.findElement(By.linkText("News")).click();
		Thread.sleep(2000);
	}

	@Then("user redirect to the news page")
	public void user_redirect_to_the_news_page() {
		System.out.println("WelCome to Yahoo page");
 
	}
	@And("user verify the title of the page")
	public void verify_title() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
	}


}
