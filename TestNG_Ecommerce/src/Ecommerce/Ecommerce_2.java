package Ecommerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Ecommerce_2 {
	public String baseUrl = "http://localhost/e-learningsystem/login.php";
	String driverPath = "c:\\chromerdriver.exe";
	public WebDriver driver;
	
	@Test(priority=1)
	public void login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
		Thread.sleep(8000);
	}
	@Test(priority=2)
	public void Assert1(){
		String expectedTitle ="Lumia - Multipurpose responsive bootstrap website template";
		String actualTitle = driver.getTitle();;
		Assert.assertEquals(expectedTitle, actualTitle);

	}
	@BeforeTest
	public void beforeTest1() {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	


	@AfterTest
	public void afterTest1() {
		//driver.close();
	}

}
