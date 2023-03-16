package org.samplejunit;

import java.util.Date;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojopackage.POJOFlipkart;
import org.pojopackage.POJORedBus;

public class Question4 extends BaseClass {
	@BeforeClass
	public static void preCondition() {
		browserLanch();
		maxWin();
		Date d = new Date();
		System.out.println("Browser Start Date and time" + d);

	}
	@Before
	public void startDate() {
		Date d= new Date();
		System.out.println("TestCase Start Date And Time" + d);
		
	}
	@Test
	public void  tc12() {
      urlLanch(" https://www.flipkart.com/account/login" );
      implicity();
      POJOFlipkart p = new POJOFlipkart();
      sendKeys(p.getLogimNumber(), "9876543210");
      p.getOtpBtn().click();



	}
	@After
	public  void endDate() {
		Date d = new Date();
		System.out.println("TestCase End Date And Time" + d);
	}
	@AfterClass
	public static void postCondition() {
		Date d = new Date();
		System.out.println("End Browser Date And Time " + d);
	}
}


