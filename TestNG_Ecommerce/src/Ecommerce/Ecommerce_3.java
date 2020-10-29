package Ecommerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Ecommerce_3 {
	public String baseUrl = "http://localhost/e-learningsystem/login.php";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;

	@BeforeMethod
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException{ 
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
		Thread.sleep(8000);
	}
	
	@Test(priority=2)
	public void Exercise(){
		WebElement exercise = driver.findElement(By.xpath("//body//header//li[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(exercise).click().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void close_1() {
		
		//driver.close();
	}

}
