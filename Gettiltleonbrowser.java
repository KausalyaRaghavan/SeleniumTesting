package homeassignments.SeleniumHomeworks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettiltleonbrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	//Login with application
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(2000);
	
	//Launching CRM/SFA
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create Lead")).click();
	Thread.sleep(2000);
	
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
	 
	 //verification of Title page
	 
	WebElement title= driver.findElement(By.id("sectionHeaderTitle_leads"));
			String value=title.getText();
	System.out.println(value);
	

	if (value.equals("View Lead")){
		
		System.out.println("True");
		
		}
	
	else
	{
		System.out.println("False");
		
	}

	}
	}
	 
	 
	 

