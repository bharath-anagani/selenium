package com.cg.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostcodeFinder {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:/Users/banagani/Downloads/Automation Softwares/ChromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwwqa.royalmail.com");
		driver.manage().window().maximize();
		System.out.println("RoyalMail QA site is opened");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//div[text()='Search addresses and postcodes']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cp-search"))));
		String name = "CB21NB";
		 
		 for(int i=0;i<name.length();i++){
			 //System.out.println(name.charAt(i));
			 char j = name.charAt(i);
			 String k = new StringBuilder().append(j).toString();
			 System.out.println(k);
			 driver.findElement(By.id("cp-search")).sendKeys(k);
			 Thread.sleep(500);
		 }
		/*driver.findElement(By.id("cp-search")).sendKeys("CB2");
		Thread.sleep(3000);
		driver.findElement(By.id("cp-search")).sendKeys("1NB");
		Thread.sleep(1000);*/
		driver.findElement(By.xpath("//span[contains(text(),'Bateman Street, Cambridge - 49 Addresses')]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
      	driver.findElement(By.xpath("//div[@id='cp-search_results_item0']")).click();	   
		   		
	}

}
