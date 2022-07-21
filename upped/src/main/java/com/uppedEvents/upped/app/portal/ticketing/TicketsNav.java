package com.uppedEvents.upped.app.portal.ticketing;

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
    public List<WebElement> ticketToggle;

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

    @FindBy(className = "column-startdate")
    public List<WebElement> ticketsStartDate;

    @FindBy(className = "column-enddate")
    public List<WebElement> ticketsEndDate;

    @FindBy(className = "column-price")
    public List<WebElement> ticketsPrices;

    @FindBy(className = "column-quantity")
    public List<WebElement> ticketsQuantity;

    @FindBy(className = "column-sold")
    public List<WebElement> ticketsSold;

    @FindBy(xpath = "//a[@class='text-second']")
    public List<WebElement> updateTicketButtons;

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
        Thread.sleep(5000);
        Integer ticketIndex = ticketsNames.size() - 1;
        this.elementIsClickable(ticketToggle.get(ticketIndex));
        this.activateTicket(ticketIndex);
        Thread.sleep(5000);
        String name = this.getElementText(ticketsNames.get(ticketIndex));
        assertEquals(name,ticketName);
        String savedPrice = this.getElementText(ticketsPrices.get(ticketIndex));
        String qty = this.getElementText(ticketsQuantity.get(ticketIndex));
        String sold = this.getElementText(ticketsSold.get(ticketIndex));
        assertEquals(savedPrice,"$" + price);
        assertEquals("100" , qty);
        assertEquals("0" , sold);
    }

    public void activateTicket(Integer index) throws InterruptedException {
        this.elementIsClickable(ticketToggle.get(index));
        this.clickElement(ticketToggle.get(index));
        this.elementIsClickable(ticketActivationYesButton);
        this.clickElement(ticketActivationYesButton);
        Thread.sleep(2000);
    }

    public void createTicketForStaff(String ticketName, String price) throws InterruptedException {
        this.elementIsClickable(addTicketButton);
        this.clickElement(addTicketButton);
        this.newTicket.createStaffTicket(ticketName,price);
        Thread.sleep(5000);
        Integer ticketIndex = ticketsNames.size() - 1;
        this.elementIsClickable(ticketToggle.get(ticketIndex));
        this.activateTicket(ticketIndex);
        Thread.sleep(5000);
        String name = this.getElementText(ticketsNames.get(ticketIndex));
        assertEquals(name,ticketName);
        String savedPrice = this.getElementText(ticketsPrices.get(ticketIndex));
        String qty = this.getElementText(ticketsQuantity.get(ticketIndex));
        String sold = this.getElementText(ticketsSold.get(ticketIndex));
        assertEquals(savedPrice,"$" + price);
        assertEquals("100" , qty);
        assertEquals("0" , sold);

    }

    public void checkForNewTicketOnePrice(String tax1, String tax2, String fee1, String fee2) throws InterruptedException {
        this.clickElement(updateTicketButtons.get(0));
        this.newTicket.validateTicketPriceWithTaxesAndFees(tax1,tax2,fee1,fee2);
        this.newTicket.validateTaxesAndFeesValues(tax1,tax2,fee1,fee2);
        this.newTicket.validateTaxesAndFeesTotalsAndAssertTotal();
    }
}
