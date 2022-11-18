package org.login;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinationClass {
	
	WebDriver driver;
	
	@Given("User must be able to launch and navigate to the facebook url")
	public void user_must_be_able_to_launch_and_navigate_to_the_facebook_url() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.get("https://www.facebook.com/");
       
		
	}
	@When("User must enter the username and password")
	public void user_must_enter_the_username_and_password() {
	   driver.findElement(By.id("email")).sendKeys("sudhirkumar");
	   driver.findElement(By.id("pass")).sendKeys("sudhir1234");
		
		
		
	}
	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.name("login")).click();
	   
		
	}

	@Then("User validates the unsuccessful login")
	public void user_validates_the_unsuccessful_login() throws InterruptedException {
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		Thread.sleep(2000);
		driver.close();
	
	  
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
