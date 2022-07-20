package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CreateNewTicket extends Base {

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
}
