package com.uppedEvents.upped.app.portal.ticketing;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketsNav extends Base {

    @FindBy(xpath = "//*[text()=' Add Group']")
    public WebElement addGroupButton;

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addTicketButton;

    @FindBy(xpath = "//*[text()=' All ']")
    public WebElement allTicketsTab;

    @FindBy(xpath = "//*[text()=' Active ']")
    public WebElement activeTicketsTab;

    @FindBy(xpath = "//*[text()=' Inactive ']")
    public WebElement inactiveTicketsTab;

    @FindBy(className = "lc_off")
    public WebElement ticketToggle;

    @FindBy(xpath = "response-message-popup")
    public WebElement ticketActivationModal;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement ticketActivationYesButton;

    @FindBy(xpath = "//*[text()='No']")
    public WebElement ticketActivationNoButton;

    @FindBy(tagName = "textarea")
    public WebElement ticketActivationInput;

    @FindBy(xpath = "//input[@placeholder='Group Name']")
    public WebElement groupNameInput;

    @FindBy(xpath = "//i[@aria-hidden='true']")
    public List<WebElement> saveOrCancelGroupButton;

    @FindBy(className = "column-sold")
    public List<WebElement> soldNumber;
}
