package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.event.elements.EventsScreenElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventsScreenElementActions extends Base {

    @Autowired
    EventsScreenElements elements;

    @Autowired
    Methods methods;

    public void moveToElement(){
        methods.moveToElement(this.elements.eventName);
    }
    public void clickEventCardToOpenEvent(){
        this.elements.eventName.click();
    }
    public void clickAccountButton() { this.elements.accountDropdownButton.click(); }
    public void clickUppedEventsLogo() { this.elements.logo.click(); }

    public void clickSignInButton(){
        this.elements.signIn.click();
    }
    public void clickSignUpCard(){ this.elements.signUp.click();}


    public void clickRightChevronIcon() {
        methods.findParentElement(this.elements.nextEventsButton).click();
    }

    public void clickLeftChevronIcon() {
        methods.findParentElement(this.elements.previousEventsButton).click();
    }

    public void getBannerText() { this.elements.bannerText.getText(); }

}
