package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateNewEvent extends Base {

    @Autowired
    DateTimePicker picker;

    @FindBy(xpath = "//*[text()='Create Event']")
    public WebElement modalHeader;

    @FindBy(xpath = "//*[text()='Event Name ']")
    public WebElement eventNameLabel;

    @FindBy(xpath = "//lint-modal-window//input[@formcontrolname='eventName']" )
    public WebElement eventNameInput;

    @FindBy(xpath = "//select-picker[@formcontrolname='occurence']")
    public WebElement occurenceSelect;

    @FindBy(xpath = "//*[text()='Once']")
    public WebElement onceOccurance;

    @FindBy(xpath = "//*[text()='Various Times']")
    public WebElement variousTimes;

    @FindBy(xpath = "//input[@formcontrolname='eventStartDate']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@formcontrolname='eventEndDate']")
    public WebElement endDate;

    @FindBy(xpath = "//input[@formcontrolname='eventAttendees']")
    public WebElement attendeesInput;

    @FindBy(xpath = "//textarea[@formcontrolname='eventDescription']")
    public WebElement descriptionTextarea;

    @FindBy(xpath = "//*[text()='Close']")
    public WebElement cancelButton;

    @FindBy(className = "ar-btn")
    public WebElement createButton;


    public void createEvent(String eventName) {
        this.elementIsClickable(createButton);
        this.sendKeys(eventNameInput,eventName);
        this.clickElement(occurenceSelect);
        this.elementIsClickable(onceOccurance);
        this.clickElement(onceOccurance);
        this.sendKeys(attendeesInput,"100");
        this.sendKeys(descriptionTextarea, eventName+" description");
        this.clickElement(startDate);
        this.picker.setStartDateAndTimeForEvent();
        this.elementIsClickable(endDate);
        this.clickElement(endDate);
        this.picker.setEndDateAndTimeForEvent();
        this.elementIsClickable(createButton);
        this.clickElement(createButton);
    }
}
