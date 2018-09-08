package ConductQA.testdrivers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingsearch {
	
	@FindBy(name= "search_query")
	private WebElement search;

	@FindBy(name= "submit_search")
	private WebElement searchlink;
	
	public void search(String text) {
		
	
		search.sendKeys(text);
		searchlink.click();
		
		
	}
	
	
	

}
