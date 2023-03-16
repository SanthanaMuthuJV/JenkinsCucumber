package org.pojopackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samplejunit.BaseClass;

public class POJOGreens extends BaseClass{
public POJOGreens() {
	PageFactory.initElements(driver, this);
}
	

	    @FindBy(xpath="(//div[@class='trainer-info'])[11]")
    	private WebElement perungreens;
	//div[@class='trainer-info'])[11]

	
	    @FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	    private WebElement no1 ;

	
		@FindBy(xpath="//a[text()='COURSES']")
		private WebElement courses;

		
		@FindBy(xpath="//span[text()='Java Training ']")
		private WebElement java;
		
		@FindBy(xpath="//a[text()='Core Java Training']")
		private WebElement corejava;
		
		@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
		private WebElement review;

		@FindBy(xpath="//a[text()='Certifications']")
		private WebElement certificate;
		
		@FindBy(xpath="(//img[@alt='Selenium Training in Chennai'])[6]")
		private WebElement test;
		
		@FindBy(xpath="(//a[text()='Course Content'])[40]")
		private WebElement content;
		
		@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
		private WebElement softw;
		
		@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
		private WebElement greenSoftware;
		
		@FindBy(xpath="//a[text()='HOME']")
		private WebElement homePage;
		
		@FindBy(xpath="//a[text()='CONTACT US']")
		private WebElement contact;
		
		@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
		private WebElement mainbranch;
		
		@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
		private WebElement copyright2018;
		
		@FindBy(xpath="//a[text()='CAREERS']")
		private WebElement carres;
		
		@FindBy(xpath="//a[text()='www.greenstechnologys.com.']")
		private WebElement lastemail;
		
		@FindBy(xpath="//a[text()='TESTIMONIALS']")
		private WebElement testimo;
		@FindBy(xpath="//div[contains(text(),' This entire')]")
		private WebElement theentireprint;
		
		public WebElement getPerungreens() {
			return perungreens;
		}

		public WebElement getNo1() {
			return no1;
		}

		public WebElement getCourses() {
			return courses;
		}

		public WebElement getJava() {
			return java;
		}

		public WebElement getCorejava() {
			return corejava;
		}

		public WebElement getReview() {
			return review;
		}

		public WebElement getCertificate() {
			return certificate;
		}

		public WebElement getTest() {
			return test;
		}

		public WebElement getContent() {
			return content;
		}

		public WebElement getSoftw() {
			return softw;
		}

		public WebElement getGreenSoftware() {
			return greenSoftware;
		}

		public WebElement getHomePage() {
			return homePage;
		}

		public WebElement getContact() {
			return contact;
		}

		public WebElement getMainbranch() {
			return mainbranch;
		}

		public WebElement getCopyright2018() {
			return copyright2018;
		}

		public WebElement getCarres() {
			return carres;
		}

		public WebElement getLastemail() {
			return lastemail;
		}

		public WebElement getTestimo() {
			return testimo;
		}

		public WebElement getTheentireprint() {
			return theentireprint;
		}
        
		
		
     
		

		
		
		
		
		
		
		
		
		
	}
	

	


