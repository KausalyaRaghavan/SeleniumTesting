package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='mBWrapper']//input[@id='src']")).sendKeys("Chennai");

		driver.findElement(By.xpath("//div[@id='mBWrapper']//input[@id='dest']")).sendKeys("Bangalore");
		WebElement date=driver.findElement(By.xpath("//label[@for='onward_cal']/ancestor::div[@id='mBWrapper']"));
		date.click();
		driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='wd day'][5]")).click();
		driver.findElement(By.xpath("//div[@id='mBWrapper']//button[@id='search_btn']")).click();


		//Got all the bus details:

		String ele=	 driver.findElement(By.xpath("//div[@class='sort-sec clearfix onward ']//span[@class='f-bold busFound']")).getText();
		System.out.println(ele);
		driver.findElement(By.xpath("//div[@class='search']//label[@for='bt_SLEEPER']")).click();
		driver.findElement(By.xpath("(//div[@id='result-section']//div[@class='button view-seats fr'])[3]")).click();
		String Prize=driver.findElement(By.xpath("(//div[@class='fare d-block']/span[@class='f-19 f-bold'])[3]")).getText();
		System.out.println(Prize);
		String seat=driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details']//div[@class='seat-left m-top-30'])[3]")).getText();
		System.out.println(seat);
	}

}
