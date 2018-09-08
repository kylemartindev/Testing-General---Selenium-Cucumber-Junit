package ConductQA.testdrivers;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class addUser {
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name ="FormsButton2" )
	private WebElement link;
	
	
	
	public void addUser() {
		
		
		username.sendKeys("Kyle");
		password.sendKeys("bobby");
		link.click();
		

	}
	
}
