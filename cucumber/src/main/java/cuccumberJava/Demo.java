package cuccumberJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	private WebDriver driver;
	
	@Given("^I have open the browser$")
	public void i_have_open_the_browser() throws Exception {
		  System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		  driver= new ChromeDriver();
	}

	@When("^I open Facebook website$")
	public void i_open_Facebook_website() throws Exception {
	   driver.get("http://localhost:3031/");
	}

	@Then("^Login button should exits$")
	public void login_button_should_exits() throws Exception {
	   
	}


}
