package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DateTimePicker extends Base {

    @FindBy(css = "button[aria-label='Next month']")
    public WebElement nextMonthSelect;

    @FindBy(xpath = "//*[text()='13']")
    public WebElement day13;

    @FindBy(xpath = "//*[normalize-space(text())='Set']")
    public WebElement setButton;

    @FindBy(xpath = "//*[normalize-space(text())='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "owl-dt-timer-input")
    public List<WebElement> timeInputs;

    public void setStartDateAndTimeForEvent() {
        this.elementIsClickable(setButton);
        this.clickElement(nextMonthSelect);
        this.clickElement(day13);
        this.elementIsClickable(setButton);
        this.clickElement(setButton);
    }

    public void setEndDateAndTimeForEvent() {
        this.elementIsClickable(day13);
        this.clickElement(day13);
        this.elementIsClickable(setButton);
        this.clickElement(setButton);
    }
}
