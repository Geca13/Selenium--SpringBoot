package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.EventInformationElements;
import com.uppedEvents.upped.app.microsites.elements.event.elements.PhotosTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventInformationScreen extends Base {

    @Autowired
    EventInformationElements informationElements;


    public EventInformationElements getInformationElements() {
        return informationElements;
    }


    public Boolean buyTicketsButtonIsDisplayed(){
        return this.informationElements.buyTicketsButton.isDisplayed();
    }
    public Boolean pageTitleIsDisplayed(){
        return this.informationElements.pageTitle.isDisplayed();
    }
    public Boolean addToWishlistButtonIsDisplayed(){
        return this.informationElements.addToWishlistButton.isDisplayed();
    }
    public Boolean detailsTabIsDisplayed(){
        return this.informationElements.detailsTab.isDisplayed();
    }

    public Boolean photosTabIsDisplayed(){
        return this.informationElements.photosTab.isDisplayed();
    }
    public Boolean shopsTabIsDisplayed(){
        return this.informationElements.shopsTab.isDisplayed();
    }
    public Boolean locationTabIsDisplayed(){
        return this.informationElements.locationTab.isDisplayed();
    }
    public Boolean featuredImageIsDisplayed(){
        return this.informationElements.featuredImage.isDisplayed();
    }

    public Boolean shortNameIsDisplayed(){
        return this.informationElements.shortName.isDisplayed();
    }
    public Boolean fullEventNameIsDisplayed(){
        return this.informationElements.fullEventName.isDisplayed();
    }
    public Boolean eventInfoIsDisplayed(){
        return this.informationElements.eventInfo.get(0).isDisplayed();
    }
    public Boolean eventTagsIsDisplayed(){
        return this.informationElements.eventTags.get(0).isDisplayed();
    }
    public Boolean verticalLineIsDisplayed(){
        return this.informationElements.verticalLine.get(0).isDisplayed();
    }
    public Boolean tabsContainer() { return this.informationElements.tabContent.isDisplayed();}

    public Boolean isAtEventInformation() {return this.wait.until((d) -> this.informationElements.featuredImage.isDisplayed()); }

}
