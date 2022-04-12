package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	WebDriver driver ;
	Object[][] object ;
	

	@DataProvider(name="praveen")
	public Object[][] getdata() {
		return new Object[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"}
		};
	}
	@BeforeMethod
	private void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider="praveen")
	
	private void tc01(String s,String s1) {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(s);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(s1);
	}

}
