package com.cg.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractise {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:/Users/banagani/Downloads/Automation Softwares/ChromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwwqa.royalmail.com");
		driver.manage().window().maximize();
		System.out.println("RoyalMail QA site is opened");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Pay a fee']")));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Waiting until page loads properly");
		driver.findElement(By.xpath("//a[text()='Pay a fee']")).click();	
		System.out.println("Entering reference number");
		driver.findElement(By.xpath("//input[@name='item_reference']")).sendKeys("BA880040409AC");
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Continuing as guest");
		driver.findElement(By.xpath("//button[@class='btn primary continue ng-binding']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("WHEN TO DELIVER PAGE");
		System.out.println("Entering Email and phone number");
		driver.findElement(By.xpath("//input[@id='inTouch-email-input']")).sendKeys("tester@royalmail.com");;
		driver.findElement(By.xpath("//input[@id='inTouch-confirm-email-input']")).sendKeys("tester@royalmail.com");;
		driver.findElement(By.id("inTouch-phone-input")).sendKeys("9848586818");;
		driver.findElement(By.xpath("//button[@type='button'][@class='btn primary']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("CHECK DETAILS PAGE");
		driver.findElement(By.xpath("//button[@type='button'][@class='btn primary']")).click();
		System.out.println("PAYMENT PAGE");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='edit-continue']")).click();
		System.out.println("Paypal Login Page");
		//Thread.sleep(3000);
		
		//WebElement element = driver.findElement(By.xpath("//a[@text()='Log In']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(element).click().perform();
		//System.out.println("Before clicking");
		
		/**driver.findElement(By.xpath("//a[@text()='Log In']")).click();
		
		System.out.println("After clicking");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gader@snow.com");
		driver.findElement(By.xpath("//button[@id='btnNext']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("q1w2e3r4t5y6");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		System.out.println("Payment Confirmation Page");**/
		System.out.println("Execution completed");
	}
}
