package org.samplejunit;


import org.junit.Test;
import org.pojopackage.POJOLoginPage;


public class Question1 extends BaseClass{
@Test 
public void tc1() {
	browserLanch();
	urlLanch("https://www.facebook.com/");
	POJOLoginPage p = new POJOLoginPage();
	sendKeys(p.getEmailtxt(), "Seleninum");
	sendKeys(p.getPasstxt(), "San@123");
	p.getClickbtn().click();

}
}
