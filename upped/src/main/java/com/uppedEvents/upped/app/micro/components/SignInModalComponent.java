package com.uppedEvents.upped.app.micro.components;

import com.uppedEvents.upped.app.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SignInModalComponent extends Methods {

    @FindBy(className = "title")
    public WebElement header;

    @FindBy(className = "close-btn")
    public WebElement closeButton;

    @FindBy(tagName = "button")
    public List<WebElement> optionButtons;

    @FindBy(xpath = "//*[text()='Sign In with Google']")
    public WebElement signInWithGoogleButton;

    @FindBy(xpath = "//*[text()='Sign In with Facebook']")
    public WebElement signInWithFacebookButton;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='New to Upped?']")
    public WebElement linkDescription;

    @FindBy(xpath = "//*[text()='Create an account']")
    public WebElement createAccountLink;

    @FindBy(className = "error-block")
    public List<WebElement> errorMessages;

    @FindBy(xpath = "//*[text()=' Email is required ']")
    public WebElement emailValidationMessage;

    @FindBy(xpath = "//*[text()=' Password is required ']")
    public WebElement passwordValidationMessage;

    @FindBy(className = "forgotpassword")
    public WebElement forgotPasswordLink;

    @FindBy(name = "rememberMe")
    public WebElement rememberCheckbox;

    @FindBy(xpath = "//*[text()=' Remember me ']")
    public WebElement rememberMeLabel;

    @FindBy(id = "toast-container")
    public WebElement toastBanner;

    @FindBy(id = "toast-title")
    public WebElement toastTitle;

    @FindBy(id = "toast-message")
    public WebElement toastMessage;
}
