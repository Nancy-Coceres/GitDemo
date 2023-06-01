package com.nancystream.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExample {
	
	WebDriver driver;
	By searchBoxLocator = By.id("cb1-edit");
//	By resultLocator = By.cssSelector("span.ui-search-search-result__quantity-results shops-custom-secondary-font");
	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com.ar/");
	}

	@Test
	public void search_zapatillas() {
		WebElement searchbox = driver.findElement(searchBoxLocator);
		searchbox.clear();
		searchbox.sendKeys("zapatillas reebok");
		searchbox.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 7);
//		wait.until(ExpectedConditions.presenceOfElementLocated(resultLocator));
		
//		System.out.println("This is the result number:" + driver.findElement(resultLocator).getText());
		
//		assertTrue(driver.findElement(resultLocator).isDisplayed(), "The result number is not present");
			
			
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

}
