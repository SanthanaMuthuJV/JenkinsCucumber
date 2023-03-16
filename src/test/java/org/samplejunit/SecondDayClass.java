package org.samplejunit;

import java.util.Date;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pojopackage.POJOLoginPage;

public class SecondDayClass extends BaseClass {
@Test
public void tc1() {
	browserLanch();
	urlLanch("https://www.facebook.com/");
	POJOLoginPage p = new POJOLoginPage();
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("Facebook"));
	sendKeys(p.getEmailtxt(), "java");
	sendKeys(p.getPasstxt(), "Sel@123");
	
}
    @After
    public void endDate() {
		Date d = new Date();
		System.out.println(d);
		
	}
    @Before
    public void startDate() {
    Date d = new Date();
    System.out.println(d);
	}
    @Test
    public void tc3() {
    browserLanch();
    urlLanch("https://www.facebook.com/");
    POJOLoginPage p = new POJOLoginPage();
    String title = driver.getTitle();
    Assert.assertTrue("check the testcase3", title.contains("facebook"));
    sendKeys(p.getEmailtxt(), "Selenium");
    sendKeys(p.getPasstxt(), "Jav@987");
	}
    
    
    
    
    
    





}

