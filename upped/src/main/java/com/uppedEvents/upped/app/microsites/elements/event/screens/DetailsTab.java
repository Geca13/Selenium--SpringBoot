package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.DetailsTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetailsTab extends Base {

    @Autowired
    DetailsTabElements detailsElements;

    public Boolean eventDescriptionSubTabIsDisplayed() {return this.detailsElements.eventDescriptionSubTab.isDisplayed();}
    public Boolean eventTitleIsDisplayed() { return this.detailsElements.eventTitle.isDisplayed(); }
    public Boolean eventDescriptionIsDisplayed() { return this.detailsElements.eventDescription.isDisplayed(); }

    public Boolean isAtDetailsTab() {return this.wait.until((d) -> this.detailsElements.eventTitle.isDisplayed()); }


}
