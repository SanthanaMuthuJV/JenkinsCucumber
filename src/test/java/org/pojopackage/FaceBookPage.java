package org.pojopackage;

import org.samplejunit.BaseClass;

public class FaceBookPage extends BaseClass{
	public static void main(String[] args) {
		browserLanch();
		maxWin();
		urlLanch("https://www.facebook.com/");
		
		POJOLoginPage p = new POJOLoginPage();
		sendKeys(p.getEmailtxt(), "muthu");
		sendKeys(p.getPasstxt(), "123@mu");
	}

}
