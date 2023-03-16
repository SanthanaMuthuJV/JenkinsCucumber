package org.samplejunit;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteSample3 extends BaseClass {

	@Test
	public void tc301() {
		browserLanch();
		urlLanch("https://www.iplt20.com/");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();

		// we can change or modify the window size by using Dimension Class
		Dimension d = new Dimension(450, 450);
		driver.manage().window().setSize(d);
	}

	@Test
	public void tc302() {
		browserLanch();
		urlLanch("https://www.irctc.co.in/nget/train-search");
	}

	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println("start date" + d);
	}

	@After
	public void endDate() {
		Date d = new Date();
		System.out.println("end date" + d);

	}
}
