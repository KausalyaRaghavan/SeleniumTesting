package homeassignments.SeleniumHomeworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditDuplicateValues {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	
		
		//Login with application
		
		driver.findElement(By.xpath("//p[@class='top']/input[@type='text']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//p/input[@type='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//p/input[@type='submit']")).click();
	
		
		//Launching CRM/SFA
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	
		
		//Entering the values:
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Altimetrik");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kausalya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raghavan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating leads for Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@test.com");
		
		//Selecting values from Dropdown:
		 WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd = new Select(dropdown);
		 dd.selectByVisibleText("New York");
		 
		 //Creation of leads
		 
		 driver.findElement(By.name("submitButton")).click();
		
		
		 
		 //Edit the values
		 driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[contains(text(),'Find Leads')]")).click();
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("kausalya");
		 driver.findElement(By.xpath("(//tbody//button[@type='button'])[7]")).click();
		 
		 //Edit the duplicate values:
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement cl=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'10328')]"));
		 cl.click();
		 driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		 driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("CSC");
	     driver.findElement(By.xpath("//tr//input[@value='Update']")).click();
	   String text=  driver.findElement(By.id("viewLead_companyName_sp")).getText();	
	   System.out.println(text);
	   driver.quit();
	}}
