package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddNewPerformance extends Base {

    @Autowired
    SetNewImage newImage;

    @Autowired
    DateTimePicker picker;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    public WebElement performanceNameInput;

    @FindBy(xpath = "//select-picker[@formcontrolname='typeId']")
    public WebElement performanceTypeDropdown;

    @FindBy(xpath = "//select-picker[@formcontrolname='location']")
    public WebElement locationDropdown;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    public WebElement performanceDescription;

    @FindBy(xpath = "//textarea[@formcontrolname='message']")
    public WebElement performanceReminderMessage;

    @FindBy(xpath = "//input[@formcontrolname='startDate']")
    public WebElement startDateInput;

    @FindBy(xpath = "//input[@formcontrolname='endDate']")
    public WebElement endDateInput;

    @FindBy(xpath = "//input[@formcontrolname='featured']")
    public WebElement featuredCheckbox;

    @FindBy(xpath = "//input[@formcontrolname='isFullDay']")
    public WebElement allDayEventCheckbox;

    @FindBy(xpath = "//input[@formcontrolname='tag']")
    public WebElement tagInput;

    @FindBy(xpath = "//button[text()='Add']")
    public WebElement addTagButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadPhotoInput;

    @FindBy(xpath = "//*[text()='Add reminder']")
    public WebElement addReminderLink;

    @FindBy(xpath = "//button[@type='reset']")
    public WebElement closeModalButton;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement savePerformanceButton;

    @FindBy(xpath = "//select[@formcontrolname='sendTo']")
    public WebElement notifyUsersDropdown;

    @FindBy(xpath = "//select[@formcontrolname='sendTime']")
    public WebElement notifyTimeDropdown;

    @FindBy(className = "icon-del")
    public WebElement removeReminderButton;

    @FindBy(xpath = "//*[text()='Attendees']")
    public WebElement attendeesOption;

    @FindBy(xpath = "//*[text()='Vendors']")
    public WebElement vendorsOption;

    @FindBy(xpath = "//*[text()='Staff']")
    public WebElement staffOption;

    @FindBy(xpath = "//*[text()='When session begins']")
    public WebElement eventStartTime;

    @FindBy(xpath = "//*[text()='10 minutes before']")
    public WebElement minutes10Before;

    @FindBy(xpath = "//*[text()='30 minutes before']")
    public WebElement minutes30Before;

    @FindBy(xpath = "//*[text()='1 hour before']")
    public WebElement hour1Before;

    @FindBy(xpath = "//*[text()='2 hour before']")
    public WebElement hour2Before;

    @FindBy(xpath = "//*[text()='Create Event Performance']")
    public WebElement modalHeader;

    @FindBy(className = "primary-badge")
    public List<WebElement> savedTags;
}
