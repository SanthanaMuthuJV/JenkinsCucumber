package org.pojopackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samplejunit.BaseClass;

public class POJORedBus extends BaseClass {
public POJORedBus() {
	PageFactory.initElements(driver, this);
}
 @FindBy(xpath="//i[@id='i-icon-profile']")
 private WebElement searchSingin;
 
 @FindBy(id="signInLink")
 private WebElement clickSignIn;
 
 @FindBy(xpath="//div[@class='mobileInput clearfix errorParent']")
 private WebElement enterNumber;

public WebElement getSearchSingin() {
	return searchSingin;
}

public WebElement getClickSignIn() {
	return clickSignIn;
}

public WebElement getEnterNumber() {
	return enterNumber;
}
 
 
 
 


}
