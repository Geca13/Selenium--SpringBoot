package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExtrasPageElements extends Base {

    @FindBy(className = "box-container")
    public List<WebElement> extrasTabs;

    @FindBy(className = "wallet-container")
    public WebElement walletContainer;

    @FindBy(className = "wallet-img")
    public WebElement walletLogo;

    @FindBy(className = "tab-info")
    public WebElement walletInfo;

    @FindBy(className = "balance-label")
    public WebElement balanceLabel;

    @FindBy(className = "balance")
    public WebElement balance;

    @FindBy(className = "balance-subtitle")
    public WebElement balanceSubtitle;

    @FindBy(xpath = "//input[@type='number']")
    public List<WebElement> enterValueInput;

    @FindBy(xpath = "//*[text()='Add Money']")
    public WebElement addMoneyButton;

    @FindBy(className = "donate-heading")
    public WebElement donateHeading;

    @FindBy(className = "text-container")
    public WebElement donateTextContainer;

    @FindBy(id = "donation-amount")
    public WebElement donateInput;

    @FindBy(xpath = "//*[text()='Reset']")
    public WebElement resetDonation;

    @FindBy(xpath = "//*[text()='Add to Order']")
    public WebElement addDonation;

    @FindBy(className = "donations-button")
    public List<WebElement> donationButtons;

    @FindBy(xpath = "//*[text()='Donate']")
    public WebElement donateTab;

    @FindBy(xpath = "//*[text()='Add Money to Wallet']")
    public WebElement addMoneyTab;

    @FindBy(xpath = "//*[text()='$20']")
    public WebElement $20Button;

    @FindBy(xpath = "//*[text()='$35']")
    public WebElement $35Button;

    @FindBy(xpath = "//*[text()='$50']")
    public WebElement $50Button;

    @FindBy(xpath = "//*[text()='$100']")
    public WebElement $100Button;

}
