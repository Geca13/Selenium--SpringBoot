package com.uppedEvents.upped.app.portal.ticketing;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.portal.portalModals.ColumnOptions;
import com.uppedEvents.upped.app.portal.portalModals.CreateNewTicket;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class TicketsNav extends Methods {

    @Autowired
    ColumnOptions options;

    @Autowired
    CreateNewTicket newTicket;

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

    @FindBy(xpath = "//a[contains(@class, 'addcolumn_btn')]//span")
    public WebElement addColumnButton;

    @FindBy(className = "column-name")
    public List<WebElement> ticketsNames;

    @FindBy(xpath = "//td[@class='column-startdate']/span")
    public List<WebElement> ticketsStartDate;

    @FindBy(xpath = "//td[@class='column-enddate']/span")
    public List<WebElement> ticketsEndDate;

    @FindBy(xpath = "//td[@class='column-price']/span")
    public List<WebElement> ticketsPrices;

    @FindBy(xpath = "//td[@class='column-quantity']/span")
    public List<WebElement> ticketsQuantity;

    @FindBy(xpath = "//td[@class='column-sold']/span")
    public List<WebElement> ticketsSold;

    public void clickAddColumnButton() throws InterruptedException {
        this.elementIsClickable(addColumnButton);
        this.clickElement(addColumnButton);
        this.options.addColumnModalIsOpened();
        this.options.clickAndDragColumn();
    }

    public void createNewTicket(String ticketName, String price) throws InterruptedException {
        this.elementIsClickable(addTicketButton);
        this.clickElement(addTicketButton);
        this.newTicket.createRegularTicket(ticketName,price);
        this.activateTicket();
        this.elementIsClickable(ticketToggle);
        Thread.sleep(15000);
        WebElement element = this.ticketsNames.get(0);
        String name = element.getText();
        System.out.println(ticketsNames.size() + " siz");
        assertEquals(name,ticketName);
        assertEquals(this.getElementText(ticketsPrices.get(0)),"$" +price);
        assertEquals(this.getElementText(ticketsQuantity.get(0)),"100");
        assertEquals(this.getElementText(ticketsSold.get(0)),"0");
    }

    public void activateTicket(){
        this.elementIsClickable(ticketToggle);
        this.clickElement(ticketToggle);
        this.elementIsClickable(ticketActivationYesButton);
        this.clickElement(ticketActivationYesButton);
    }
}
