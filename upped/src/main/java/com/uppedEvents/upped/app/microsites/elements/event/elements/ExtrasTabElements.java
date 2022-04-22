package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExtrasTabElements extends Base {

    @FindBy(className = "extras-container")
    public WebElement extrasContainer;

    @FindBy(className = "box-container")
    public List<WebElement> extrasTabs;

    @FindBy(className = "balance-label")
    public WebElement balanceLabel;

    @FindBy(className = "balance")
    public WebElement balance;

    @FindBy(className = "wallet-img")
    public WebElement walletLogo;

    @FindBy(className = "balance-subtitle")
    public WebElement walletDescription;

    @FindBy(xpath = "//*[text()='Donate']")
    public WebElement donateTab;

    @FindBy(xpath = "//*[text()='Add Money to Wallet']")
    public WebElement addMoneyTab;

    @FindBy(className = "form-control")
    public WebElement addFundsInput;

    @FindBy(xpath = "//*[text()='Add Money']")
    public WebElement addMoneyButton;

    @FindBy(xpath = "//*[text()=' Previous ']")
    public WebElement previousScreenButton;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextScreenButton;

    @FindBy(id = "donationAmount")
    public WebElement donationInput;

    @FindBy(className = "donate-head")
    public WebElement donateTitle;

    @FindBy(className = "donate-event")
    public WebElement donationEventName;

    @FindBy(className = "donations-message")
    public WebElement donationMessage;

    @FindBy(className = "donations-buttons-box")
    public WebElement donationButtonsContainer;

    @FindBy(className = "donations-button")
    public List<WebElement> donationButtons;

    @FindBy(className = "donation-order-button")
    public WebElement addDonationButton;

    @FindBy(className = "donation-reset-button")
    public WebElement resetDonationButton;

}
