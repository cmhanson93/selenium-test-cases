package com.selenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	static WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://practiceselenium.com");
	}

	// Welcome Page//

	@Test
	public void goToOurPassion_wc01() {
		driver.findElement(By.linkText("Our Passion")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Our Passion", title);
	}

	@Test
	public void goToMenu_wc02() {
		driver.findElement(By.linkText("Menu")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Menu", title);

	}

	@Test
	public void goToLetsTalkTea_wc03() {
		driver.findElement(By.linkText("Let's Talk Tea")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Let's Talk Tea", title);

	}

	@Test
	public void goToCheckOut_wc04() {
		driver.findElement(By.linkText("Check Out")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Check Out", title);
	}

}
