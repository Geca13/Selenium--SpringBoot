package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ConfirmationPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationPage extends Base {

    @Autowired
    ConfirmationPageElements elements;

    @Autowired
    Methods methods;

    public Boolean thankYouMessageIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.thankYouMessage); }
    public Boolean confirmationMessageIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.confirmationMessage); }
    public Boolean shareButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.shareButton); }
    public Boolean firstTicketConfirmationContainerIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketConfirmationContainer.get(0)); }
    public Boolean firstTicketItemContainerIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketItemContainer.get(0)); }
    public Boolean firstTicketNameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.ticketName.get(0)); }
    public Boolean firstEventNameContainerIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.eventNamesContainer.get(0)); }
    public Boolean firstEventShortnameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.eventShortname.get(0)); }
    public Boolean firstEventFullnameIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.eventFullname.get(0)); }
    public Boolean backToStartButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.backToStartButton); }




}
