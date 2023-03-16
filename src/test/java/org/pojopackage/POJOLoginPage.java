package org.pojopackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samplejunit.BaseClass;

public class POJOLoginPage extends BaseClass {
public POJOLoginPage() {
	PageFactory.initElements(driver, this);
}    
   @FindBy(id="email")
   private WebElement emailtxt;
   
   @FindBy(name="pass")
   private WebElement passtxt;
   
   @FindBy(name="login")
   private WebElement clickbtn;
   
public WebElement getEmailtxt() {
	return emailtxt;
}

public WebElement getPasstxt() {
	return passtxt;
}

public WebElement getClickbtn() {
	return clickbtn;
}
   
   
 

  
 





}
