package com.cg.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:/Users/banagani/Downloads/Automation Softwares/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("wwwqt.royalmail.com");
	}

}
