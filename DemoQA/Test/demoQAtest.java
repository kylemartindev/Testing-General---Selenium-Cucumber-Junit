package ConductQA.DemoQA;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class demoQAtest {
	
	
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	
	
	
	@Before
	public void driversetup() {
 	reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Report.html", true);	
	
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver(); 

	}
	
	@After
	public void driverteardown() throws InterruptedException{
		
		//WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(null); 

		Thread.sleep(3000);
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
	
	
//	
//	@Test
//	public void selectable() throws InterruptedException {
//		
//		
//	test = reports.startTest("Verify selectable test");
//	test.log(LogStatus.INFO, "Brower started");
//	driver.manage().window().maximize();
//	driver.get(democonstants.demoqa);
//	demopage demoqa = PageFactory.initElements(driver, demopage.class);
//	Thread.sleep(5000);
//	demoqa.selectable(driver);
//	//if ()
//	//assertThat((driver.findElement(By.xpath("//*[@id=\\\"selectable\\\"]/li[7")).getLocation()).equals());
//	//assertSame("("+588 +", "+ 540+")", driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).getLocation());	
//	assertEquals("Item 7", driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).getText());
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//	
	
	@Test
	public void registration() {
		
	test = reports.startTest("Start Registration");
	driver.manage().window().maximize();
	driver.get(democonstants.demoqa);
	demopage demo = PageFactory.initElements(driver, demopage.class);
	demoregister demoreg = PageFactory.initElements(driver, demoregister.class);
	demo.registration();
	demoreg.sendinfo();
	
	assertEquals("Thank you for your registration",driver.findElement(By.xpath("//*[@id=\"post-49\"]/div/p")).getText());
		
		
		
	}
	
	//@Test
//	public void demoqa() {
//		test = reports.startTest("Verify droppable test");
//		test.log(LogStatus.INFO, "Browser started");
//		driver.get("demoqa");
//		demoqapage rundemo = PageFactory.initElements(driver, demoqapage.class);
//		rundemo.droppableeopen(driver);
//		assertEquals("", driver.findElement(By.xpath("")).getText());
//		
//	}
	
	
	
}
