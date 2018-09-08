package ConductQA.DemoQA;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class demoregister {
	

	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(xpath ="//*[@id=\"pie_register\"]/li[2]/div/div/label[1]")
	private WebElement single;
	
	@FindBy (xpath = "//*[@id=\"pie_register\"]/li[3]/div/div/input[1]")
	private WebElement dance;
	
	@FindBy(name="phone_9")
	private WebElement phone;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="e_mail")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement confirmpassword;
	
	@FindBy (name="pie_submit")
	private WebElement submit;
	
	
	public void sendinfo() {
		
		firstname.sendKeys("Kyle");
		firstname.sendKeys(Keys.TAB);
		lastname.sendKeys("Martin");
		single.click();
		dance.click();
		phone.sendKeys("01727777884");
		phone.sendKeys(Keys.TAB);
		username.sendKeys("kylem");
		username.sendKeys(Keys.TAB);
		email.sendKeys("kyle@hotmail.com");
		password.sendKeys("password");
		password.sendKeys(Keys.TAB);
		confirmpassword.sendKeys("password");
		confirmpassword.sendKeys(Keys.TAB);
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
