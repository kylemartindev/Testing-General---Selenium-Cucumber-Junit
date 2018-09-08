package ConductQA.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class demopage {
	
	@FindBy(xpath = "//*[@id=\"menu-item-141\"]/a" )
	private WebElement droppablelink;
	
	@FindBy(xpath = "//*[@id=\"draggableview\"]/p")
	private WebElement source;
	
	@FindBy(xpath = "//*[@id=\"droppableview\"]")
	private WebElement target;
	
	@FindBy (xpath = "//*[@id=\"menu-item-142\"]/a")
	private WebElement selectablelink;
	
	@FindBy (xpath = "//*[@id=\"selectable\"]/li[1]")
	private WebElement start;
	
	@FindBy (xpath = "//*[@id=\"menu-item-374\"]/a")
	private WebElement registerlink;
	
	public void droppableeopen(WebDriver driver) {
		
		droppablelink.click();
		new Actions(driver).dragAndDrop(source, target).perform();
		
		
		
	}
	
	
	public void selectable(WebDriver driver) {
		
		selectablelink.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(start) .clickAndHold() .moveByOffset(0, 200).perform();
		
		
		
	}

	public void registration() {
		
		registerlink.click();
		
		
		
	}
}
