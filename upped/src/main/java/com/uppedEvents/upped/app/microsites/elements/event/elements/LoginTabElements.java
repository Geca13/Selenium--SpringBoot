package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginTabElements extends Base {

    @FindBy(className = "google-login")
    public WebElement googleSignInButton;

    @FindBy(className = "facebook-login")
    public WebElement facebookSignInButton;

    @FindBy(className = "title")
    public List<WebElement> loginTitles;

    @FindBy(className = "subtitle")
    public List<WebElement> subtitle;

    @FindBy(className = "row")
    public List<WebElement> rows;

    @FindBy(className = "mt-3")
    public List<WebElement> loginSections;

    @FindBy(css = "input[formControlName=email]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(className = "forgot-btn")
    public WebElement forgotButton;

    @FindBy(className = "signup-btn")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Please Login to Continue']")
    public WebElement pleaseLoginTitle;

}
