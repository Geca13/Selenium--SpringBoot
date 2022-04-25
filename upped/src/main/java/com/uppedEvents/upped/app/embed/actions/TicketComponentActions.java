package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.TicketsComponentElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketComponentActions extends Base {

    @Autowired
    TicketsComponentElements elements;

    @Autowired
    Methods methods;

    public Boolean isAtEmbedTicketing() {return this.wait.until((d) -> this.methods.elementIsDisplayed(this.elements.ticketGroupsTabs.get(0)));}
    public void clickFirstTicketsGroupTab() { this.methods.clickElement(this.elements.ticketGroupsTabs.get(0)); }
    public void clickSecondTicketsGroupTab() { this.methods.clickElement(this.elements.ticketGroupsTabs.get(1)); }
    public void clickThirdTicketsGroupTab() { this.methods.clickElement(this.elements.ticketGroupsTabs.get(2)); }
    public void clickFourthTicketsGroupTab() { this.methods.clickElement(this.elements.ticketGroupsTabs.get(3)); }
    public void selectQuantityForTheFirstTicket() { this.methods.sendKeysToElement(this.elements.ticketSelect.get(0),"2"); }
    public void selectQuantityForTheSecondTicket() { this.methods.sendKeysToElement(this.elements.ticketSelect.get(1),"1"); }
    public void selectQuantityForTheThirdTicket() { this.methods.sendKeysToElement(this.elements.ticketSelect.get(2),"2"); }
    public void selectQuantityForTheFourthTicket() { this.methods.sendKeysToElement(this.elements.ticketSelect.get(3),"1"); }


}
