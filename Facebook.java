package homeassignments.SeleniumHomeworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@type='text']")).sendKeys("KRS");
		driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@name='lastname']")).sendKeys("Rag");
		driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@name='reg_email__']")).sendKeys("kausalya24@gmail.com");
		driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@name='reg_email_confirmation__']")).sendKeys("kausalya24@gmail.com");
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc@2010");

		//selection of dropzone:
		WebElement dropdown = driver.findElement(By.xpath("//span/select[@id='day']"));
		WebElement dropdown1 = driver.findElement(By.xpath("//span/select[@id='month']"));
		WebElement dropdown2 = driver.findElement(By.xpath("//span/select[@id='year']"));
		Select dd = new Select(dropdown);
		Select dd1 = new Select(dropdown1);
		Select dd2 = new Select(dropdown2);
		dd.selectByIndex(5);
		dd1.selectByIndex(7);
		dd2.selectByIndex(15);
		//select Radio button
		WebElement radio1=driver.findElement(By.xpath("//label[contains(text(),'Female')]/following-sibling::input"));
		radio1.click();	     
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

}

}
