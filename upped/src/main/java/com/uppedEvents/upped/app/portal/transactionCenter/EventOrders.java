package com.uppedEvents.upped.app.portal.transactionCenter;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventOrders extends Base {

    @FindBy(xpath = "//*[text()=' Add Group']")
    public WebElement addGroupButton;

    @FindBy(xpath = "//*[text()='All']")
    public WebElement allTicketsNav;

    @FindBy(xpath = "//*[text()='Tickets']")
    public WebElement ticketsNav;

    @FindBy(xpath = "//*[text()='Items']")
    public WebElement itemsNav;

    @FindBy(xpath = "//*[text()=' All ']")
    public WebElement allTicketsTab;

    @FindBy(xpath = "//*[text()=' In Process ']")
    public WebElement inProcessTab;

    @FindBy(xpath = "//*[text()=' Completed ']")
    public WebElement completedTab;

    @FindBy(xpath = "//*[text()=' Refunded ']")
    public WebElement refundedTab;

    @FindBy(xpath = "//*[text()=' Transaction View ']")
    public WebElement transactionViewTab;

    @FindBy(xpath = "//*[text()=' Detailed View ']")
    public WebElement detailedViewTab;

    @FindBy(className = "tbl-drpdwn")
    public WebElement itemMenusButtons;

    @FindBy(xpath = "//*[text()=' Details ']")
    public WebElement detailsOption;

    @FindBy(className = "tbl-drpdwn")
    public List<WebElement> orderTotals;
}
