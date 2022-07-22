package com.uppedEvents.upped.app.micro.components;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketsTab extends Base {

    @FindBy(className = "terms-btn")
    public WebElement termsButton;

    @FindBy(className = "title")
    public List<WebElement> ticketsHeader;

    @FindBy(className = "tickets-list")
    public WebElement ticketsContainer;

    @FindBy(className = "name")
    public List<WebElement> ticketsNames;

    @FindBy(className = "ticket-price")
    public List<WebElement> ticketsPrices;

    @FindBy(className = "info")
    public List<WebElement> ticketsDescriptions;

    @FindBy(xpath = "//input[@type='number']")
    public List<WebElement> quantityInputs;

    @FindBy(xpath = "//*[text()=' + ']")
    public List<WebElement>  increaseQtyButton;

    @FindBy(xpath = "//*[text()=' - ']")
    public List<WebElement>  decreaseQtyButton;

}
