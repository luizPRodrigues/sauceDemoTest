package com.saucedemo.teste_qa.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public static WebDriver createChrome() {
		if (driver == null) {
			String pathDriverChrome = System.getProperty("user.dir") + "/src/main/java/com/saucedemo/teste_qa/core/chromedriver/chromedriver";
			System.setProperty("webdriver.chrome.driver", pathDriverChrome);
			driver = new ChromeDriver();
			wait = new WebDriverWait(DriverFactory.createChrome(), 22);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void navega(String url) {
		DriverFactory.createChrome().get(url);
	}

	public static void encerraDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
