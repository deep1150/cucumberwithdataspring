package com.Web.cucumber;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class check {
	private WebDriver driver;
	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\765404\\chromd\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get(arg1);
	}

	@Given("^I enter \"([^\"]*)\" into input field having id \"([^\"]*)\"$")
	public void i_enter_into_input_field_having_id(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
		driver.findElement(By.id(arg2)).sendKeys(arg1);
	  
	}

	

	@When("^I click on element having id \"([^\"]*)\"$")
	public void i_click_on_element_having_id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^I wait for (\\d+) sec$")
	public void i_wait_for_sec(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("sub")).click();
	   
	}

	@Then("^I should get Data added$")
	public void i_should_get_Data_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
