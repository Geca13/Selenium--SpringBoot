package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LoginPageElements extends Base {

    @FindBy(className = "header-title")
    public WebElement headerTitle;

    @FindBy(className = "header-description")
    public WebElement headerDescription;

    @FindBy(className = "info")
    public WebElement loginContinueMessage;

    @FindBy(className = "not-member")
    public WebElement notMemberMessage;

    @FindBy(className = "register")
    public WebElement registerLink;

    @FindBy(css = "input[formControlName=email]")
    public WebElement emailInput;

    @FindBy(css = "input[formControlName=password]")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text()='Login Now']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Forgot Password?']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//*[text()=' Sign In with Google ']")
    public WebElement googleSignInButton;

    @FindBy(xpath = "//*[text()=' Sign In with Facebook ']")
    public WebElement facebookSignInButton;

    @FindBy(xpath = "//*[text()='Back to Tickets']")
    public WebElement backToTicketsButton;
}
