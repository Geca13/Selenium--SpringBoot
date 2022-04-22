package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.TicketsTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketsTab extends Base {

    @Autowired
    TicketsTabElements elements;

    public Boolean isAtTicketsScreen() {return this.wait.until((d) -> this.elements.ticketsContainer.isDisplayed()); }

    public Boolean ticketsTermsButtonIsDisplayed() { return this.elements.termsButton.isDisplayed();}
    public Boolean ticketsHeaderIsDisplayed() { return this.elements.ticketsHeader.get(0).isDisplayed();}
    public Boolean ticketsContainerIsDisplayed() { return this.elements.ticketsContainer.isDisplayed();}
    public Boolean firstTicketNameIsDisplayed() { return this.elements.ticketsNames.get(0).isDisplayed();}
    public Boolean firstTicketPriceIsDisplayed() { return this.elements.ticketsPrices.get(0).isDisplayed();}
    public Boolean firstTicketsDescriptionIsDisplayed() { return this.elements.ticketsDescriptions.get(0).isDisplayed();}
    public Boolean firstIncreaseQtyButtonIsDisplayed() { return this.elements.increaseQtyButton.get(0).isDisplayed();}
    public Boolean firstDecreaseQtyButtonIsDisplayed() { return this.elements.decreaseQtyButton.get(0).isDisplayed();}


}
