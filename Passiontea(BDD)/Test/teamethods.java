package ConductQA.passiontea;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 



public class teamethods {
	
	WebDriver driver; 
	 
	 
 	String url; 
 	
 	@Before
 	public void setup() {
 		
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe"); 
 		driver = new ChromeDriver(); 
 		driver.manage().window().maximize(); 
 	
 	}
 	
 	@Given ("^the correct web address$")
 	public void i_go_to_correct_website() {
 	
 		driver.get("http://www.practiceselenium.com/welcome.html"); 
 		url = driver.getCurrentUrl(); 
 	}
	
 	@When("^I navigate to the 'Menu' page$")
 	public void navigate_to_menu() {
 		homepagesetup setup = PageFactory.initElements(driver, homepagesetup.class);
 			setup.clickmenu();
 		
 	}
	

 	@Then("^I can browse a list of the available products\\.$")
 	public void i_can_browse_a_list_of_the_available_products() {
 		assertTrue(!url.equals(driver.getCurrentUrl())); 
 	}

 	@When("^I click the checkout button$")
 	public void i_click_the_checkout_button(){
 		homepagesetup setup = PageFactory.initElements(driver, homepagesetup.class);
			setup.checkout();
 		

 	}

 	@Then("^I am taken to the checkout page$")
 	public void i_am_taken_to_the_checkout_page() {
    assertEquals("Check Out", driver.getTitle());
 		
 		}



 	@After
 	public void teardown() throws InterruptedException {
 		Thread.sleep(2000); 
 		driver.close(); 
 		driver.quit(); 
 		
 		
 	}
 	
}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	


