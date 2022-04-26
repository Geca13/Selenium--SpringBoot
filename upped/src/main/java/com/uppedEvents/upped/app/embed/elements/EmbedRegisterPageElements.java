package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class EmbedRegisterPageElements extends Base {

    @FindBy(className = "title")
    public WebElement createPageTitle;

    @FindBy(className = "subtitle")
    public WebElement createPageTitleSubtitle;

    @FindBy(className = "sign-in-btn")
    public WebElement signInLink;

    @FindBy(xpath = "//*[text()='First Name*']")
    public WebElement firstNameLabel;

    @FindBy(xpath = "//*[text()='Last Name*']")
    public WebElement lastNameLabel;

    @FindBy(xpath = "//*[text()='Date Of Birth*']")
    public WebElement dateOfBirthLabel;

    @FindBy(xpath = "//*[text()='Gender ']")
    public WebElement genderLabel;

    @FindBy(xpath = "//*[text()='Email*']")
    public WebElement emailLabel;

    @FindBy(xpath = "//*[text()='Enter Password*']")
    public WebElement passwordLabel;

    @FindBy(xpath = "//*[text()='Verify Password*']")
    public WebElement verifyPassLabel;

    @FindBy(xpath = "//*[text()=' Create Account ']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Back to Login']")
    public WebElement backToLoginButton;

    @FindBy(xpath = "//*[text()=' First name is required ']")
    public WebElement firstNameRequired;

    @FindBy(xpath = "//*[text()=' Last name is required ']")
    public WebElement lastNameRequired;

    @FindBy(xpath = "//*[text()=' Date of birth is required ']")
    public WebElement dateIsRequired;

    @FindBy(xpath = "//*[text()=' Email is required ']")
    public WebElement emailIsRequired;

    @FindBy(xpath = "//*[text()=' Password is required ']")
    public WebElement passwordIsRequired;

    @FindBy(xpath = "//*[text()=' Verify password is required ']")
    public WebElement verifyPassRequired;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "dob")
    public WebElement birthdayInput;

    @FindBy(id = "gender")
    public WebElement genderSelect;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(name = "confirmPassword")
    public WebElement confirmPassInput;
}
