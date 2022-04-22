package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.EventInformationElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventInfoElementsActions extends Base {

    @Autowired
    EventInformationElements elements;

    public void clickPhotosTab(){ this.elements.photosTab.click(); }
    public void clickShopsTab(){ this.elements.shopsTab.click(); }
    public void clickLocationTab(){ this.elements.locationTab.click(); }
    public void clickDetailsTab(){ this.elements.detailsTab.click(); }


    public void clickBuyTicketsButton(){ this.elements.buyTicketsButton.click();}
}
