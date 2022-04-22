package com.uppedEvents.upped.app.microsites.elements.account.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ForgotPasswordModalElements extends Base {

    @FindBy(className = "title")
    public WebElement header;

    @FindBy(className = "close-btn")
    public WebElement closeButton;

    @FindBy(xpath = "//*[text()=' Email is required ']")
    public WebElement emailValidationMessage;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(className = "toast-message")
    public WebElement invalidEmail;
}
