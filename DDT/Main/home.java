package ConductQA.testdrivers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home {
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3] " )
	private WebElement adduserlink;
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4] " )
	private WebElement loginlink;
	
 public void adduserlink() {
	
		adduserlink.click();
		
		
	}
 
 public void logininlink() {
	 
	 loginlink.click();
	 
	 
 }
	

}
