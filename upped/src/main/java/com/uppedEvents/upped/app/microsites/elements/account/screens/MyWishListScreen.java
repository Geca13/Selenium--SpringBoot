package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.MyWishlistScreenElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWishListScreen extends Base {

    @Autowired
    MyWishlistScreenElements elements;

    public Boolean isAtMyWishlistScreen() { return this.wait.until((d) -> this.elements.eventCards.get(0).isDisplayed()); }
    public Boolean firstEventCardIsDisplayed() { return this.elements.eventCards.get(0).isDisplayed(); }
    public Boolean noEventsMessageIsDisplayed() { return this.elements.noRecordsMessage.isDisplayed(); }
    public Boolean readMoreButtonIsDisplayed() { return this.elements.readMoreButton.get(0).isDisplayed(); }
    public Boolean bookmarkButtonIsDisplayed() { return this.elements.removeToWishlist.get(0).isDisplayed(); }
    public Boolean eventsContainerIsDisplayed() { return this.elements.allEvents.isDisplayed(); }


}
