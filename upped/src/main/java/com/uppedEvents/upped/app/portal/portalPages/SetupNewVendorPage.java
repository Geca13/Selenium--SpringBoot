package com.uppedEvents.upped.app.portal.portalPages;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SetupNewVendorPage extends Base {

    @FindBy(xpath = "//*[text()=' Personal Details ']")
    public WebElement personalDetailsButton;

    @FindBy(xpath = "//*[text()=' Back ']")
    public WebElement backButton;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement setPasswordInput;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@formcontrolname='orgName']")
    public WebElement orgNameInput;

    @FindBy(xpath = "//input[@formcontrolname='orgMobile']")
    public WebElement orgPhoneInput;

    @FindBy(xpath = "//input[@formcontrolname='orgLocation']")
    public WebElement orgLocationInput;

    @FindBy(className = "already-account-link")
    public WebElement alreadyHaveAccountLink;

}
