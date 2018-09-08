package ConductQA.testdrivers;
import org.junit.Assert.*;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class testdriverpage {
	
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

		Thread.sleep(2000);
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
	
	
	@Test 
	public void droppable() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http:\\www.thedemosite.co.uk");
		
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
		driver.findElement(By.name("username")).sendKeys("Kyle");
	    driver.findElement(By.name("password")).sendKeys("bobby");
		driver.findElement(By.name("FormsButton2")).click();
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
		driver.findElement(By.name("username")).sendKeys("Kyle");
		driver.findElement(By.name("password")).sendKeys("bobby");
		driver.findElement(By.name("FormsButton2")).click();
		Thread.sleep(5000);
	assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
	
	}
	
	
	
	
	
	@Test
	public void adduserpage() throws InterruptedException{
	
		test = reports.startTest("Verify demo test");//initiate report function
		
		test.log(LogStatus.INFO, "Browser started"); //initiate log/test status for the reporting.
		driver.get("http://thedemosite.co.uk/index.php");
		home run = PageFactory.initElements(driver, home.class);
		addUser add = PageFactory.initElements(driver, addUser.class);
		loginpage login = PageFactory.initElements(driver, loginpage.class);	
		run.adduserlink();
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.name("username"))); 
		
		add.addUser();
		run.logininlink();
		login.loginuser();Thread.sleep(6000);
		driver.get("http://thedemosite.co.uk/index.php");
		String title = driver.getTitle();//get title of page
		if(title.equals("Login example page to test the PHP MySQL online system"))//check if title matches webtitle. 
		{
		test.log(LogStatus.PASS, "verify login");} //if title matches print status in report.
		else {
		test.log(LogStatus.FAIL, "Login not verified");	
		}
		
		reports.endTest(test);//end reporting
		reports.flush();//flush report to file
		
		assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
		
		
		
	}
	@Test
	public void shoppingtest() {
		test = reports.startTest("Verify demo test");
		
		test.log(LogStatus.INFO, "Browser started");

		driver.get("http://automationpractice.com/index.php");
		shoppingsearch shop = PageFactory.initElements(driver, shoppingsearch.class);
		shop.search("Dress");
		test.log(LogStatus.PASS, "verify shopping page");
		reports.endTest(test);
		reports.flush();
		assertEquals("Printed Summer Dress", driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText());
		
	}

	@Test
	public void demoqa() {
		test = reports.startTest("Verify droppable test");
		test.log(LogStatus.INFO, "Browser started");
		driver.get("demoqa");
		demoqapage rundemo = PageFactory.initElements(driver, demoqapage.class);
		rundemo.droppableeopen(driver);
		assertEquals("", driver.findElement(By.xpath("")).getText());
		
	}
	
	@Test 
	public void exceltest() {

	FileInputStream file = null;
	try {
		
		file = new FileInputStream(Constants.filepath + Constants.filename);//finds file path and file name of where file is based.
	
		
	}catch (FileNotFoundException e) {
		
		System.out.println("not found");
	}
		XSSFWorkbook work = null;
	try {
		
		work = new XSSFWorkbook(file);
		
		
	}catch (IOException e) {
		System.out.println("other exception");
	}
	
	XSSFSheet sheet  = work.getSheetAt(0);
	XSSFCell celluser = sheet.getRow(1).getCell(0);
	XSSFCell cellpass = sheet.getRow(1).getCell(1);
	driver.get(Constants.demosite);
	driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
	
	driver.findElement(By.name("username")).sendKeys(celluser.getStringCellValue());
	driver.findElement(By.name("password")).sendKeys(cellpass.getStringCellValue());
	driver.findElement(By.name("FormsButton2")).click();
	
	driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
	
	driver.findElement(By.name("username")).sendKeys(celluser.getStringCellValue());
	driver.findElement(By.name("password")).sendKeys(cellpass.getStringCellValue());
	driver.findElement(By.name("FormsButton2")).click();
	
	
	
	System.out.println(celluser.getStringCellValue());
	System.out.println(cellpass.getStringCellValue());
	assertEquals("david", cellpass.getStringCellValue());
	assertEquals("Dave", celluser.getStringCellValue());
	assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
	}
	
	
	
	//@Test
	//public void excelinput() {
		
		//FileOutputStream writes = null;
		//String content = "Nobby";
		//try {
			
			//file = new FileInputStream(Constants.filepath + Constants.filename);//finds file path and file name of where file is based.
			//writes = new FileOutputStream(Constants.filepath + Constants.filename);
			
		//}catch (FileNotFoundException e) {
			
			//System.out.println("not found");
		//}
		
			//XSSFWorkbook work = null;
		//work = new XSSFWorkbook();
		//byte[] bytesArray = content.getBytes();
		//XSSFSheet sheet  = work.getSheetAt(0);
		
		//writes.write(bytesArray);
	//}
	
	//catch(IOException ioe){
		
		
	//}
	
	
//}
	
}


