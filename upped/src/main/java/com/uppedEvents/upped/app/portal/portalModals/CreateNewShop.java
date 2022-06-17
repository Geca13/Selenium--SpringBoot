package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CreateNewShop extends Base {

    @Autowired
    DateTimePicker picker;

    @Autowired
    SetNewImage newImage;

    @FindBy(xpath = "//input[@formcontrolname='shopName']")
    public WebElement shopNameInput;

    @FindBy(xpath = "//label[@class='custom-checkbox']")
    public WebElement makeFeaturedLabel;

    @FindBy(xpath = "//input[@formcontrolname='description']")
    public WebElement descriptionInput;

    @FindBy(id = "category")
    public WebElement categoryDropdown;

    @FindBy(id = "associatedShops")
    public WebElement associatedShopsDropdown;

    @FindBy(className = "pl-1")
    public List<WebElement> categoryAndAssociatedOptions;

    @FindBy(xpath = "//input[@formcontrolname='startDate']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@formcontrolname='endDate']")
    public WebElement endDate;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement imageInput;

    @FindBy(id = "tags")
    public WebElement tagsInput;

    @FindBy(name = "PartnerOptions")
    public WebElement selectPartnerDropdown;

    @FindBy(xpath = "//*[text()='Source from Partner Management list']")
    public WebElement partnerListOption;

    @FindBy(xpath = "//*[text()='Event Manage Shop']")
    public WebElement eventManagedOption;

    @FindBy(className = "column-email")
    public WebElement vendorEmail;

    @FindBy(tagName = "select-picker")
    public List<WebElement> vendorLocation; //index 4

    @FindBy(tagName = "icon-event")
    public List<WebElement> calendarIcon; //index 4

    @FindBy(xpath = "//span[text()='Add Shop']")
    public WebElement addShop;

    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement cancelButton;
}
