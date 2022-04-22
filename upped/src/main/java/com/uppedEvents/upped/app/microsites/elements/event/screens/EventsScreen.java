package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.EventsScreenElements;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EventsScreen extends Base {

    @Value("${microsites.url}")
    private String micrositesUrl;

    @Autowired
    EventsScreenElements elements;

    public EventsScreenElements getElements() {
        return elements;
    }

    public void openMicrositesPage(){
        this.driver.get(micrositesUrl);
    }

    public Boolean isAtEventsScreen() {
        return this.wait.until((d) -> this.elements.eventName.isDisplayed());
    }

    public Boolean logoIsDisplayed(){
        return this.elements.logo.isDisplayed();
    }
    public Boolean navbarIsDisplayed(){
        return this.elements.navbar.isDisplayed();
    }
    public Boolean whatsUppedIsDisplayed(){
        return this.elements.whatsUpped.isDisplayed();
    }
    public Boolean supportIsDisplayed(){
        return this.elements.support.isDisplayed();
    }
    public Boolean signUpIsDisplayed(){
        return this.elements.signUp.isDisplayed();
    }
    public Boolean signInIsDisplayed(){
        return this.elements.signIn.isDisplayed();
    }

    public Boolean eventsContainerIsDisplayed(){
        return this.elements.eventsContainer.isDisplayed();
    }
    public Boolean bannerImageIsDisplayed(){
        return this.elements.bannerImage.isDisplayed();
    }
    public Boolean bannerTextIsDisplayed(){
        return this.elements.bannerText.isDisplayed();
    }
    public Boolean topEventsHeaderIsDisplayed(){
        return this.elements.topEventsHeader.isDisplayed();
    }
    public Boolean eventNameIsDisplayed(){
        return this.elements.eventName.isDisplayed();
    }
    public Boolean footerIsDisplayed(){
        return this.elements.footer.isDisplayed();
    }

    public Boolean contactUsIsDisplayed(){
        return this.elements.contactUs.isDisplayed();
    }
    public Boolean contactDetailsIsDisplayed(){
        return this.elements.contactDetails.isDisplayed();
    }
    public Boolean facebookIconIsDisplayed(){
        return this.elements.facebookIcon.isDisplayed();
    }
    public Boolean instagramIconIsDisplayed(){
        return this.elements.instagramIcon.isDisplayed();
    }
    public Boolean twitterIconIsDisplayed(){
        return this.elements.twitterIcon.isDisplayed();
    }
    public Boolean eventBookmarkDisplayed(){
        return this.elements.eventBookmark.isDisplayed();
    }

    public Boolean nextEventsButtonIsDisplayed(){
        return this.elements.nextEventsButton.isDisplayed();
    }
    public Boolean previousEventsButtonIsDisplayed(){
        return this.elements.previousEventsButton.isDisplayed();
    }
    public Boolean readMoreButtonIsDisplayed(){
        return this.elements.readMoreButton.isDisplayed();
    }

    public Boolean accountDropdownButtonIsDisplayed(){
        return this.elements.accountDropdown.isDisplayed();
    }
    public Boolean accountDropdownElementIsDisplayed(){
        return this.elements.accountDropdownElement.isDisplayed();
    }
    //public Boolean readMoreButtonIsDisplayed(){return this.elements.readMoreButton.isDisplayed(); }

    public Boolean accountDropdownIsOnEventsScreen() {
        return this.wait.until((d) -> this.elements.accountDropdownElement.isDisplayed());
    }





}
