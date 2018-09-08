package ConductQA.passiontea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepagesetup {
	
	
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menuclick;
	
	@FindBy(xpath="//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement checkoutclick;
	
	public void clickmenu() {
		
		menuclick.click();
		
	}
	
	public void checkout() {
		
		checkoutclick.click();
		
	}
	
	
	

}
