package com.uppedEvents.upped.app.micro.components;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SignUpModalComponent extends Base {

    @FindBy(className = "title")
    public WebElement header;

    @FindBy(className = "title-subtext")
    public WebElement titleSubtext;

    @FindBy(className = "close-btn")
    public WebElement closeButton;

    @FindBy(tagName = "button")
    public List<WebElement> optionButtons;

    @FindBy(xpath = "//*[text()='Sign Up with Google']")
    public WebElement signUpWithGoogleButton;

    @FindBy(xpath = "//*[text()='Sign Up with Facebook']")
    public WebElement signUpWithFacebookButton;

    @FindBy(xpath = "//*[text()='Sign Up with Email']")
    public WebElement signUpWithEmailButton;

    @FindBy(xpath = "//*[text()='Already have an account?']")
    public WebElement linkDescription;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInLink;
}
