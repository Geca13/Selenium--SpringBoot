package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.TicketsComponentElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketComponent extends Base {

    @Autowired
    TicketsComponentElements elements;

    @Autowired
    Methods methods;

    public Boolean groupTicketsContainerIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.groupsTabsContainer); }
    public Boolean firstTicketGroupTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketGroupsTabs.get(0)); }
    public Boolean secondTicketGroupTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketGroupsTabs.get(1)); }
    public Boolean thirdTicketGroupTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketGroupsTabs.get(2)); }
    public Boolean fourthTicketGroupTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketGroupsTabs.get(3)); }
    public Boolean firstTicketNameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketName.get(0)); }
    public Boolean secondTicketNameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketName.get(1)); }
    public Boolean thirdTicketNameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketName.get(2)); }
    public Boolean fourthTicketNameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketName.get(3)); }
    public Boolean firstTicketDescriptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketDescription.get(0)); }
    public Boolean secondTicketDescriptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketDescription.get(1)); }
    public Boolean thirdTicketDescriptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketDescription.get(2)); }
    public Boolean fourthTicketDescriptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketDescription.get(3)); }
    public Boolean firstTicketPriceIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketPrice.get(0)); }
    public Boolean secondTicketPriceIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketPrice.get(1)); }
    public Boolean thirdTicketPriceIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketPrice.get(2)); }
    public Boolean fourthTicketPriceIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketPrice.get(3)); }
    public Boolean firstTicketInfoIconIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.infoIconContainer.get(0))); }
    public Boolean secondTicketInfoIconIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.infoIconContainer.get(1))); }
    public Boolean thirdTicketInfoIconIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.infoIconContainer.get(2))); }
    public Boolean fourthTicketInfoIconIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.infoIconContainer.get(3))); }
    public Boolean firstTicketSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketSelect.get(0)); }
    public Boolean secondTicketSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketSelect.get(1)); }
    public Boolean thirdTicketSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketSelect.get(2)); }
    public Boolean fourthTicketSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketSelect.get(3)); }



}
