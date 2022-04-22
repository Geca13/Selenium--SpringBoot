package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.EmbedPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmbedPage extends Base {

    @Autowired
    EmbedPageElements elements;

    @Autowired
    Methods methods;


    public void iFrameIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.iframe); }
    public void bannerIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.banner); }
    public void headerTextIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.headerText); }
    public void eventNameIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.eventName); }
    public void loggedInUserTextIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.loggedInUserText); }
    public void changeUserLinkIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.changeUserLink); }
    public void loginInfoMessageIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.loginInfoMessage); }
    public void loginLinkIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.loginLink); }
    public void totalsContainerIsDisplayed(){ this.methods.elementIsDisplayed(this.elements.totalsContainer); }
    public void subtotalTextIsDisplayed() { this.methods.findFirstChildElement(this.elements.mini.get(1)); }
    public void subtotalAmountIsDisplayed() { this.methods.findSecondChildElement(this.elements.mini.get(1)); }

}
