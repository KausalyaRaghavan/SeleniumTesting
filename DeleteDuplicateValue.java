package homeassignments.SeleniumHomeworks;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[@class='top']/input[@type='text']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//p/input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//p/input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("kausalya");
		driver.findElement(By.xpath("(//tbody//button[@type='button'])[7]")).click();
		WebElement cl=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'10482')]"));
		cl.click();
		driver.findElement(By.xpath("//div[@class='frameSectionHeader']//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[contains(text(),'Find Leads')]")).click();
		 driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("10482");
		 driver.findElement(By.xpath("(//tbody//button[@type='button'])[7]")).click();
		WebElement output= driver.findElement(By.xpath("//div[@class='x-panel x-panel-noborder']//div[contains(text(),'No records to display')]"));
		String s=output.getText();
		System.out.println(s);
		String val="No records to display";
		if(s.equals(val))
	    System.out.println("True");
		else
		System.out.println("False");
		}

}
