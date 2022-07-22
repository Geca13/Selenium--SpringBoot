package com.uppedEvents.upped.app.micro.account;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EditProfilePage extends Base {

    @FindBy(xpath = "//*[text()='First Name']")
    public WebElement firstNameLabel;

    @FindBy(xpath = "//*[text()='Last Name']")
    public WebElement lastNameLabel;

    @FindBy(xpath = "//*[text()=' Email Address ']")
    public WebElement emailAddressLabel;

    @FindBy(xpath = "//*[text()='Password']")
    public WebElement passwordLabel;

    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement genderLabel;

    @FindBy(xpath = "//*[text()='DOB']")
    public WebElement dobLabel;

    @FindBy(xpath = "//*[text()='Phone']")
    public WebElement phoneLabel;

    @FindBy(xpath = "//*[text()='Address']")
    public WebElement addressLabel;

    @FindBy(xpath = "//*[text()='Country']")
    public WebElement countryLabel;

    @FindBy(xpath = "//*[text()='State']")
    public WebElement stateLabel;

    @FindBy(xpath = "//*[text()='City']")
    public WebElement cityLabel;

    @FindBy(xpath = "//*[text()='Zipcode']")
    public WebElement zipCodeLabel;

    @FindBy(xpath = "//*[text()=' Save Profile ']")
    public WebElement saveProfileButton;

    @FindBy(className = "fa-pencil-alt")
    public WebElement editEmailButton;

    @FindBy(css = "input[formControlName=first_name]")
    public WebElement firstNameInput;

    @FindBy(css = "input[formControlName=last_name]")
    public WebElement lastNameInput;

    @FindBy(css = "input[formControlName=email]")
    public WebElement emailInput;

    @FindBy(css = "input[formControlName=password]")
    public WebElement passwordInput;

    @FindBy(css = "input[formControlName=date_of_birth]")
    public WebElement dobSelect;

    @FindBy(css = "select[formControlName=gender]")
    public WebElement genderSelect;

    @FindBy(css = "input[formControlName=phone_number]")
    public WebElement phoneInput;

    @FindBy(css = "input[formControlName=address]")
    public WebElement addressInput;

    @FindBy(css = "select[formControlName=country_code]")
    public WebElement countrySelect;

    @FindBy(css = "select[formControlName=state]")
    public WebElement stateSelect;

    @FindBy(css = "input[formControlName=zipcode]")
    public WebElement zipCodeInput;

    @FindBy(className = "modal-content")
    public WebElement changeEmailModal;

    @FindBy(className = "modal-header")
    public WebElement changeEmailModalHeader;

    @FindBy(xpath = "//*[text()='New Primary Email']")
    public WebElement changeEmailModalEmailInputLabel;

    @FindBy(xpath = "//*[text()='Current Password']")
    public WebElement changeEmailModalCurrentPasswordInputLabel;

    @FindBy(xpath = "//*[text()=' Email Address ']")
    public WebElement changeEmailModalRetypePasswordInputLabel;

    @FindBy(className = "fields")
    public List<WebElement> inputContainers;

    @FindBy(tagName = "p")
    public WebElement verificationDescription;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButton;
}
