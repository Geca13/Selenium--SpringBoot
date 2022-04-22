package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.TicketingScreenElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketingScreen extends Base {

    @Autowired
    TicketingScreenElements ticketingElements;

    public TicketingScreenElements getTicketsElements() {
        return ticketingElements;
    }
    public Boolean ticketingTitleIsDisplayed() { return this.ticketingElements.pageTitle.isDisplayed(); }
    public Boolean ticketsTabIsDisplayed() { return this.ticketingElements.ticketsTab.isDisplayed(); }
    public Boolean loginTabIsDisplayed() { return this.ticketingElements.loginTab.isDisplayed(); }
    public Boolean extrasTabIsDisplayed() { return this.ticketingElements.extrasTab.isDisplayed(); }
    public Boolean payTabIsDisplayed() { return this.ticketingElements.payTab.isDisplayed(); }
    public Boolean confirmTabIsDisplayed() { return this.ticketingElements.confirmTab.isDisplayed(); }
    public Boolean backToEventInfoButtonIsDisplayed() { return this.ticketingElements.backToEventInfoButton.isDisplayed(); }
    public Boolean subtitleContainerIsDisplayed() { return this.ticketingElements.summaryElements.get(0).isDisplayed(); }
    public Boolean taxesContainerIsDisplayed() { return this.ticketingElements.summaryElements.get(1).isDisplayed(); }
    public Boolean feesContainerIsDisplayed() { return this.ticketingElements.summaryElements.get(2).isDisplayed(); }
    public Boolean totalContainerIsDisplayed() { return this.ticketingElements.totalContainer.isDisplayed(); }
    public Boolean loginInfoMessageIsDisplayed() { return this.ticketingElements.loginInfoMessage.isDisplayed(); }
    public Boolean loginLinkIsDisplayed() { return this.ticketingElements.loginLink.isDisplayed(); }
    public Boolean nextButtonIsDisplayed() { return this.ticketingElements.nextButton.isDisplayed(); }
    public Boolean feesInfoIconIsDisplayed() { return this.ticketingElements.infoIcons.get(1).isDisplayed(); }
    public Boolean taxesInfoIconIsDisplayed() { return this.ticketingElements.infoIcons.get(0).isDisplayed(); }
    public Boolean discountLabelIsDisplayed() { return this.ticketingElements.discountLabel.isDisplayed(); }
    public Boolean applyButtonIsDisplayed() { return this.ticketingElements.applyButton.isDisplayed(); }
    public Boolean discountInputIsDisplayed() { return this.ticketingElements.inputs.get(ticketingElements.inputs.size()-1).isDisplayed(); }
    public Boolean taxesTooltipIsDisplayed() { return this.ticketingElements.taxesTooltip.isDisplayed(); }
    public Boolean closeModalButtonIsDisplayed() { return this.ticketingElements.closeBtn.isDisplayed(); }
    public Boolean closeTaxesContainerIsDisplayed() { return this.ticketingElements.taxesContainer.isDisplayed(); }




    public Boolean isAtTicketingScreen() {return this.wait.until((d) -> this.ticketingElements.ticketsTab.isDisplayed()); }

    public Integer findIconsSizes () { return this.ticketingElements.infoIcons.size();}

}
