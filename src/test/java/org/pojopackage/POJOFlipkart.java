package org.pojopackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samplejunit.BaseClass;

public class POJOFlipkart extends BaseClass {
public POJOFlipkart() {
PageFactory.initElements(driver, this);}
 @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
 private WebElement logimNumber;
 
 @FindBy(xpath="//button[text()='Request OTP']")
 private WebElement otpBtn;

public WebElement getLogimNumber() {
	return logimNumber;
}

public WebElement getOtpBtn() {
	return otpBtn;
}
 
 
 

}
