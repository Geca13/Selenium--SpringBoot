package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PayPageElements extends Base {

    @FindBy(className = "pay-container")
    public WebElement payOptionsContainer;

    @FindBy(xpath = "//*[text()='Saved Cards']")
    public WebElement savedCardsTitle;

    @FindBy(xpath = "//*[text()='Pay with Other Service']")
    public WebElement payWithServiceTitle;

    @FindBy(className = "box-container")
    public List<WebElement> payOptionsTabs;

    @FindBy(className = "user-card")
    public List<WebElement> savedCards;

    @FindBy(className = "card-number")
    public List<WebElement> cardsNames;

    @FindBy(xpath = "//*[text()=' Pay with wallet ']")
    public WebElement payWithWalletButtonOption;

    @FindBy(xpath = "//*[text()='Pay with wallet']")
    public WebElement payWithWalletButton;

    @FindBy(xpath = "//*[text()='Pay with card']")
    public WebElement payWithCardButton;

    @FindBy(xpath = "//*[text()='Pay with Card or Service']")
    public WebElement payWithCardTab;

    @FindBy(xpath = "//*[text()='Pay with New Card']")
    public WebElement payWithNewCardTab;

    @FindBy(tagName = "label")
    public List<WebElement> labels;

    @FindBy(tagName = "sup")
    public List<WebElement> requiredSymbol;

    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement cardNumberInput;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement saveCardCheckbox;

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
}
