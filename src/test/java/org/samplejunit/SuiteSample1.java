package org.samplejunit;

import java.util.Date;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pojopackage.POJOLoginPage;

public class SuiteSample1 extends BaseClass{
@Test
public void tc101() {
browserLanch();
urlLanch("https://www.facebook.com/");
POJOLoginPage p = new POJOLoginPage();
String title = driver.getTitle();
Assert.assertTrue(title.contains("Facebook"));
sendKeys(p.getEmailtxt(), "muthu");
Assert.assertTrue(false);
sendKeys(p.getPasstxt(), "pearl@1234");
}
@Test
public void tc102() {
browserLanch();
urlLanch("https://www.snapdeal.com/");
POJOLoginPage p = new POJOLoginPage();
String title = driver.getTitle();
Assert.assertTrue(title.contains("Shop"));
}
@Test
public void tc103() {
browserLanch();
urlLanch("https://www.flipkart.com/");

}


@Before
public void startDate() {
Date d = new Date();
System.out.println("start date"+d);
}
@After
public void endDate() {
Date d = new Date();
System.out.println("end date"+d);
}}
