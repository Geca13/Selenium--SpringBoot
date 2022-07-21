package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@Component
public class CreateNewTicket extends Methods {

    @Autowired
    DateTimePicker picker;

    @FindBy(id = "name")
    public WebElement ticketNameInput;

    @FindBy(id = "description")
    public WebElement descriptionInput;

    @FindBy(id = "rules")
    public WebElement rulesInput;

    @FindBy(id = "quantity")
    public WebElement quantityInput;

    @FindBy(id = "price")
    public WebElement priceInput;

    @FindBy(id = "startDate")
    public WebElement startDateInput;

    @FindBy(id = "endDate")
    public WebElement endDateInput;

    @FindBy(xpath = "//button[@aria-controls='panelOne']")
    public WebElement ticketTypeButton;

    @FindBy(className = "lc_off")
    public List<WebElement> staffSwitch;

    @FindBy(name = "staff_dp")
    public WebElement staffSelect;

    @FindBy(xpath = "//*[text()='STAFF']")
    public WebElement staffOption;

    @FindBy(tagName = "select-picker")
    public List<WebElement> departmentSelect;

    @FindBy(xpath = "//*[text()='Staff Will Select Department']")
    public WebElement staffWillSelectOption;

    @FindBy(xpath = "//*[text()=' Save ']")
    public WebElement saveTicketButton;

    @FindBy(xpath = "//button[@type='reset']")
    public WebElement cancelTicketButton;

    @FindBy(xpath = "//*[text()='Ticket Price']")
    public WebElement ticketPriceLabel;

    @FindBy(xpath = "//span[contains(@class, 'price')]")
    public WebElement buyerTotal;

    @FindBy(xpath = "//td[@valign='bottom']//span")
    public List<WebElement> individualTaxesAndFees;

    @FindBy(xpath = "//td[@valign='bottom']//h6")
    public List<WebElement> totalTaxesAndFees;


    public void modalIsOpened(){
        this.elementIsClickable(saveTicketButton);
    }
    public void createRegularTicket(String ticketName, String price){
        this.modalIsOpened();
        this.ticketNameInput.sendKeys(ticketName);
        this.descriptionInput.sendKeys( ticketName + " Description");
        this.rulesInput.sendKeys(ticketName + " Rules");
        this.priceInput.sendKeys(price);
        this.quantityInput.clear();
        this.quantityInput.sendKeys("100");
        this.clickElement(startDateInput);
        this.picker.setStartTimeForTicket();
        this.modalIsOpened();
        this.clickElement(saveTicketButton);
    }

    public void createStaffTicket(String ticketName, String price) throws InterruptedException {
        this.modalIsOpened();
        this.ticketNameInput.sendKeys(ticketName);
        this.descriptionInput.sendKeys( ticketName + " Description");
        this.rulesInput.sendKeys(ticketName + " Rules");
        this.priceInput.sendKeys(price);
        this.quantityInput.clear();
        this.quantityInput.sendKeys("100");
        this.clickElement(startDateInput);
        this.picker.setStartTimeForTicket();
        this.modalIsOpened();
        this.clickElement(ticketTypeButton);
        this.moveToElement(ticketPriceLabel);
        this.elementIsClickable(staffSwitch.get(staffSwitch.size()-1));
        this.clickElement(staffSwitch.get(staffSwitch.size()-1));
        Thread.sleep(2000);
        this.elementIsClickable(staffSelect);
        this.clickElement(staffSelect);
        this.elementIsClickable(staffOption);
        this.clickElement(staffOption);
        Thread.sleep(1000);
        this.clickElement(departmentSelect.get(1));
        Thread.sleep(1000);
        this.clickElement(staffWillSelectOption);
        this.clickElement(saveTicketButton);
    }

    public void validateTicketPriceWithTaxesAndFees(String tax1, String tax2, String fee1, String fee2) throws InterruptedException {
        this.modalIsOpened();
        Thread.sleep(2000);
        Double newTicketPrice = this.convertStringPriceToDouble(buyerTotal.getText().substring(1));
        String originalPrice = this.priceInput.getAttribute("value");
        Double original = Double.parseDouble(originalPrice);
        this.moveToElement(ticketPriceLabel);
        Double taxOne = this.convertStringPriceToDouble(tax1);
        Double taxTwo = this.convertStringPriceToDouble(tax2);
        Double feeOne = this.convertStringPriceToDouble(fee1);
        Double feeTwo = this.convertStringPriceToDouble(fee2);

        Double tax1value = this.roundToTwoDecimals((original * taxOne) / 100);
        Double tax2value = this.roundToTwoDecimals((original * taxTwo) / 100);
        Double fee1value = this.roundToTwoDecimals((original * feeOne) / 100);
        Double fee2value = this.roundToTwoDecimals(feeTwo);

        Double calculatedPrice = this.roundToTwoDecimals(tax1value + tax2value + fee1value + fee2value + original);
        assertEquals(calculatedPrice, newTicketPrice);
    }

    public void validateTaxesAndFeesValues(String tax1, String tax2, String fee1, String fee2) throws InterruptedException {
        this.modalIsOpened();
        Thread.sleep(2000);
        String originalPrice = this.priceInput.getAttribute("value");
        Double original = Double.parseDouble(originalPrice);
        this.moveToElement(ticketPriceLabel);
        Double taxOne = this.convertStringPriceToDouble(tax1);
        Double taxTwo = this.convertStringPriceToDouble(tax2);
        Double feeOne = this.convertStringPriceToDouble(fee1);
        Double feeTwo = this.convertStringPriceToDouble(fee2);

        Double calculatedTax1value = this.roundToTwoDecimals((original * taxOne) / 100);
        Double calculatedTax2value = this.roundToTwoDecimals((original * taxTwo) / 100);
        Double calculatedFee1value = this.roundToTwoDecimals((original * feeOne) / 100);
        Double calculatedFee2value = this.roundToTwoDecimals(feeTwo);

        Double extractedDoubleTaxOne = this.convertStringPriceToDouble(individualTaxesAndFees.get(0).getText().substring(1));
        Double extractedDoubleTaxTwo = this.convertStringPriceToDouble(individualTaxesAndFees.get(1).getText().substring(1));
        Double extractedDoubleFeeOne = this.convertStringPriceToDouble(individualTaxesAndFees.get(2).getText().substring(1));
        Double extractedDoubleFeeTwo = this.convertStringPriceToDouble(individualTaxesAndFees.get(3).getText().substring(1));

        assertEquals(calculatedTax1value, extractedDoubleTaxOne);
        assertEquals(calculatedTax2value, extractedDoubleTaxTwo);
        assertEquals(calculatedFee1value, extractedDoubleFeeOne);
        assertEquals(calculatedFee2value, extractedDoubleFeeTwo);

    }

    public void validateTaxesAndFeesTotalsAndAssertTotal() {

        String originalPrice = this.priceInput.getAttribute("value");
        Double original = Double.parseDouble(originalPrice);
        Double newTicketPrice = this.convertStringPriceToDouble(buyerTotal.getText().substring(1));
        Double taxesTotal = this.convertStringPriceToDouble(totalTaxesAndFees.get(0).getText().substring(1));
        Double feesTotal = this.convertStringPriceToDouble(totalTaxesAndFees.get(1).getText().substring(1));
        Double calculatedPrice = this.roundToTwoDecimals(taxesTotal + feesTotal + original);
        assertEquals(newTicketPrice, calculatedPrice);
        }
}
