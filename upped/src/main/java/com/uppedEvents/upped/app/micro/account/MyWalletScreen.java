package com.uppedEvents.upped.app.micro.account;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyWalletScreen extends Base {

    @FindBy(className = "wallet-item")
    public WebElement walletLogoContainer;

    @FindBy(className = "details")
    public List<WebElement> logoTextDetails;

    @FindBy(className = "title")
    public List<WebElement> sectionTitles;

    @FindBy(className = "sub-title")
    public List<WebElement> sectionSubtitles;

    @FindBy(className = "wallet-balance")
    public WebElement walletBalance;

    @FindBy(className = "details-container")
    public WebElement detailsContainer;

    @FindBy(className = "buttons-container")
    public WebElement addMoneyContainer;

    @FindBy(className = "card-detail")
    public List<WebElement> fullCardContainers;

    @FindBy(className = "card-skin")
    public List<WebElement> cards;

    @FindBy(className = "card-actions")
    public List<WebElement> deleteButtonContainer;

    @FindBy(xpath = "//*[text()=' Delete ']")
    public List<WebElement>  deleteButtons;

    @FindBy(tagName = "input")
    public List<WebElement> inputs;

    @FindBy(className = "form-label")
    public List<WebElement> labels;

    @FindBy(tagName = "select")
    public List<WebElement> selects;

    @FindBy(xpath = "//*[text()=' Add ']")
    public WebElement  addCardButton;

    @FindBy(css = "input[formControlName=name_on_card]")
    public WebElement cardHolderName;

    @FindBy(css = "input[formControlName=card_no]")
    public WebElement cardNumber;

    @FindBy(css = "input[formControlName=cvc]")
    public WebElement cvc;

    @FindBy(css = "input[formControlName=billingAddress]")
    public WebElement streetAddress;

    @FindBy(css = "input[formControlName=zip_code]")
    public WebElement zipCode;

    @FindBy(css = "select[formControlName=month]")
    public WebElement monthSelect;

    @FindBy(css = "select[formControlName=year]")
    public WebElement yearSelect;

    @FindBy(css = "select[formControlName=country_id]")
    public WebElement countrySelect;

    @FindBy(css = "select[formControlName=state]")
    public WebElement stateSelect;

    @FindBy(className = "fa-chevron-up")
    public List<WebElement> chevronUp;

    @FindBy(className = "fa-chevron-down")
    public List<WebElement> chevronDown;


}
