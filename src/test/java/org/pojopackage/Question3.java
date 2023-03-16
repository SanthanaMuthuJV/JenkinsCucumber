package org.pojopackage;

import java.awt.AWTException;

import org.samplejunit.BaseClass;



public class Question3 extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		 browserLanch();
		 urlLanch("http://www.greenstechnologys.com/");
		 
		 POJOGreens p = new POJOGreens();
		 
		 //note1
		 scrollDownJS(p.getPerungreens());
		 scrollUpJS(p.getNo1());
		 refreshBase();
		
		 //note2
		clickWebElement(p.getCertificate());
		 clickWebElement(p.getContent());
		 scrollDownJS(p.getTest());
		 
		 //note3
		 mouseOver(p.getCourses());
		 downKeyBttnRobot(4);
		 Thread.sleep(4000);
	 	clickWebElement(p.getCorejava());
		 scrollDownJS(p.getReview());
		 
		 //note4
		 refreshBase();
		 Thread.sleep(3000);
		 clickWebElement(p.getCarres());
		 scrollDownJS(p.getLastemail());
		 
		 //note5
		 driver.navigate().back();
		 clickWebElement(p.getTestimo());
		 scrollDownJS(p.getTheentireprint());
		 
		 //not6
	      refreshBase();
         driver.navigate().back();
         clickWebElement(p.getContact());
		 getTxt(p.getMainbranch());
		 scrollDownJS(p.getCopyright2018());
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
