package com.uppedEvents.upped.app.micro.components;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ForgotPasswordModalComponent extends Methods {

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
