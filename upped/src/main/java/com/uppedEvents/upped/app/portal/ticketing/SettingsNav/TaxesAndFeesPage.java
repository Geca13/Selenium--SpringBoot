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
    public List<WebElement> dollarValueInputs;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(className = "inner-elements-full")
    public List<WebElement> taxesAndFeesNames;

    @FindBy(tagName = "tr")
    public List<WebElement> taxesAndFeesValues;

    public void isOnTaxesAndFeesSubNav() {
        this.elementIsClickable(includedTaxesRadio);
    }
    public void setExcludedTaxesToTickets(String tax1, String tax2) throws InterruptedException {
        this.isOnTaxesAndFeesSubNav();
        this.taxNameInput.sendKeys("Tax One");
        Thread.sleep(1000);
        this.percentRateInput.get(0).sendKeys(tax1);
        this.clickElement(addButtons.get(0));
        Thread.sleep(1000);
        this.taxNameInput.sendKeys("Tax Two");
        this.percentRateInput.get(1).sendKeys(tax2);
        this.clickElement(addButtons.get(0));
        Thread.sleep(1000);
        this.clickElement(saveButton);
    }

    public void setExcludedFeesToTickets(String fee1, String fee2) throws InterruptedException {
        this.isOnTaxesAndFeesSubNav();
        this.feeNameInput.sendKeys("Fee One");
        this.percentRateInput.get(3).sendKeys(fee1);
        this.clickElement(addButtons.get(1));
        Thread.sleep(1000);
        this.feeNameInput.sendKeys("Fee Two");
        this.dollarValueInputs.get(1).sendKeys(fee2);
        this.clickElement(addButtons.get(1));
        Thread.sleep(1000);
        this.clickElement(saveButton);
    }
}
