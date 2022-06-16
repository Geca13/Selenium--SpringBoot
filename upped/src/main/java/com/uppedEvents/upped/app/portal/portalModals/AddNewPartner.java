package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class AddNewPartner extends Base {

    @FindBy(xpath = "//*[text()=' Add Partner']")
    public WebElement modalHeader;

    @FindBy(name = "partnerType")
    public WebElement partnerType;

    @FindBy(xpath = "//*[text()='Sponsor']")
    public WebElement sponsorOption;

    @FindBy(xpath = "//*[text()='Speaker']")
    public WebElement speakerOption;

    @FindBy(xpath = "//*[text()='Contractor']")
    public WebElement contractorOption;

    @FindBy(xpath = "//*[text()='Vendor/Merchant']")
    public WebElement vendorMerchantOption;

    @FindBy(name = "typeId")
    public WebElement inviteMethodSelect;

    @FindBy(xpath = "//*[text()='Invite by email']")
    public WebElement inviteByEmailOption;

    @FindBy(xpath = "//*[text()='Import by CSV']")
    public WebElement importCVSOption;

    @FindBy(xpath = "//*[text()='Source from Upped’s List']")
    public WebElement uppedList;

    @FindBy(xpath = "//select-picker[@formcontrolname='businessTypeId']")
    public WebElement businessType;

    @FindBy(xpath = "//*[text()='Individual / Sole Proprietorship']")
    public WebElement individualOption;


    @FindBy(xpath = "//input[@formcontrolname='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@formcontrolname='contactFirstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@formcontrolname='contactLastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//textarea[@formcontrolname='message']")
    public WebElement messageTextarea;

    @FindBy(xpath = "//*[text()='Save for Later']")
    public WebElement saveForLaterButton;

    @FindBy(xpath = "//*[text()='Send Invite']")
    public WebElement sendInviteButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addButton;
}
