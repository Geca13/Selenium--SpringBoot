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
    public WebElement staffSwitch;

    @FindBy(name = "staff_dp")
    public WebElement staffSelect;

    @FindBy(xpath = "//*[text()='STAFF']")
    public WebElement staffOption;

    @FindBy(tagName = "select-picker")
    public List<WebElement> departmentSelect;

    @FindBy(tagName = "//a[@role='option']")
    public List<WebElement> departmentOptions;

    @FindBy(xpath = "//*[text()=' Save ']")
    public WebElement saveTicketButton;

    @FindBy(xpath = "//button[@type='reset']")
    public WebElement cancelTicketButton;
}
