package com.mouniqa.testng.test.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.mouniqa.testng.test.locators.HomePageLocatorsEnum;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	public static void login() {

		ChromeDriverManager.getInstance().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("jagadeesh.ifs@gmail.com");
		driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("Jagan1986");
		driver.findElement(By.xpath("//*[@id='login-submit']")).click();

	}

}
