package com.uppedEvents.upped.app.microsites.elements.account.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class FacebookModalElements extends Base {

    @FindBy(id = "homelink")
    public WebElement facebookHeader;

    @FindBy(id = "content")
    public WebElement facebookModalContent;

    @FindBy(className = "_50f7")
    public WebElement companyName;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "pass")
    public WebElement passInput;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Forgot account?']")
    public WebElement forgotFacebookAccountLink;

    @FindBy(xpath = "//*[text()='Create new account']")
    public WebElement createNewFacebookAccountLink;

}
