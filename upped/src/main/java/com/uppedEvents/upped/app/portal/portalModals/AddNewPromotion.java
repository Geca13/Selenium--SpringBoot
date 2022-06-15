package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddNewPromotion extends Base {

    @Autowired
    DateTimePicker picker;

    @FindBy(xpath = "//*[text()='Add New Promotion']")
    public WebElement headerTitle;

    @FindBy(xpath = "//div[@class='fields']/input[@name='name']")
    public WebElement titleInput;

    @FindBy(name = "description")
    public WebElement descriptionInput;

    @FindBy(id = "tickets")
    public WebElement ticketsDropdown;

    @FindBy(id = "status")
    public WebElement statusDropdown;

    @FindBy(className = "pl-4") // or pl-1 for the span
    public List<WebElement> ticketLabelOption;

    @FindBy(xpath = "//*[text()='Enabled']")
    public WebElement enabledStatus;

    @FindBy(xpath = "//*[text()='Disabled']")
    public WebElement disabledStatus;

    @FindBy(css = "input[name='membersLimit'")
    public WebElement membersOnlyLimit;

    @FindBy(name = "quantity")
    public WebElement quantityInput;

    @FindBy(name = "price")
    public WebElement priceInput;

    @FindBy(name = "percentage")
    public WebElement percentageInput;

    @FindBy(name = "accountLimit")
    public WebElement accountLimitQuantityInput;

    @FindBy(name = "promoCode")
    public WebElement promoCodeInput;

    @FindBy(name = "accountUseLimit")
    public WebElement promoPerAccountLimit;

    @FindBy(id = "accountTickets")
    public WebElement selectLimitTicketsDropdown;

    @FindBy(name = "quantityOfCodes")
    public WebElement quantityOfCodesInput;

    @FindBy(name = "useLimit")
    public WebElement codeUseLimitInput;

    @FindBy(name = "startDate")
    public WebElement startDateInput;

    @FindBy(name = "endDate")
    public WebElement endDateInput;

    @FindBy(xpath = "//*[text()='Generate Multiple Unique Codes']")
    public WebElement generateMultipleCodesButton;

    @FindBy(xpath = "//*[text()='Generate Single Code']")
    public WebElement generateSingleCodeButton;

    @FindBy(xpath = "//*[text()='Please provide me each discount code']")
    public WebElement provideCodesToEO;

    @FindBy(xpath = "//*[text()='Email unique codes to recipients']")
    public WebElement emailUniqueCodes;

    @FindBy(xpath = "//*[text()=' Save ']")
    public WebElement savePromotionButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButton;

}
