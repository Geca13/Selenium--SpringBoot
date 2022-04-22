package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketsComponentElements extends Base {


    @FindBy(id = "pills-tab")
    public WebElement groupsTabsContainer;

    @FindBy(className = "nav-item")
    public List<WebElement> ticketGroupsTabs;

    @FindBy(className = "list-group-item")
    public List<WebElement> ticketRow;

    @FindBy(className = "name-container")
    public List<WebElement> ticketInfoContainer;

    @FindBy(className = "name")
    public List<WebElement> name;

    @FindBy(className = "ticket-price")
    public List<WebElement> ticketPrice;

    @FindBy(className = "fa-info-circle")
    public List<WebElement> infoIcon;

    @FindBy(className = "ticket-info")
    public List<WebElement> ticketRulesTooltip;

    @FindBy(className = "info")
    public List<WebElement> ticketDescription;

    @FindBy(tagName = "select")
    public List<WebElement> ticketSelect;

    @FindBy(tagName = "option")
    public List<WebElement> ticketQty;

}
