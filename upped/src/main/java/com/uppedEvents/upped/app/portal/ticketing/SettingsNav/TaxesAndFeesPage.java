package com.uppedEvents.upped.app.portal.ticketing.SettingsNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaxesAndFeesPage extends Base {

    @FindBy(xpath = "//*[text()=' Included, the price listed is the total price the attendee will pay ']")
    public WebElement includedTaxesRadio;

    @FindBy(xpath = "//*[text()=' Excluded, taxes and fees will be added on top of the ticket price ']")
    public WebElement excludedTaxesRadio;

    @FindBy(name = "name")
    public WebElement taxNameInput;

    @FindBy(name = "type")
    public WebElement feeNameInput;

    @FindBy(name = "percent")
    public List<WebElement> percentRateInput;

    @FindBy(xpath = "//*[text()='Add']")
    public List<WebElement> addButtons;

    @FindBy(name = "price")
    public WebElement dollarValueInput;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(className = "inner-elements-full")
    public List<WebElement> taxesAndFeesNames;

    @FindBy(tagName = "tr")
    public List<WebElement> taxesAndFeesValues;

}
