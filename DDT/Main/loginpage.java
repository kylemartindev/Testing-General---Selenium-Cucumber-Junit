package ConductQA.testdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginpage {

	
	
	@FindBy(name = "username")
	private WebElement username;
	 
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "FormsButton2")
	private WebElement loginin;
	
	
	
	
	
public void loginuser() {
	
		username.sendKeys("Kyle"); 
		password.sendKeys("bobby");
		loginin.click();
		
	
	}	
	
public void clicklogin() {
	
	
	
}	
	
}
