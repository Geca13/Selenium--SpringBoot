package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.AccountDropdownElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDropdownScreen extends Base {

    @Autowired
    AccountDropdownElements elements;

    public Boolean profileIconIsDisplayed() { return this.elements.profileIcon.isDisplayed();}
    public Boolean profileOptionIsDisplayed() { return this.elements.profileItem.isDisplayed();}
    public Boolean receiptIconIsDisplayed() { return this.elements.receiptIcon.isDisplayed();}
    public Boolean receiptsOptionIsDisplayed() { return this.elements.receiptsItem.isDisplayed();}
    public Boolean myEventsIconIsDisplayed() { return this.elements.myEventsIcon.isDisplayed();}
    public Boolean myEventsOptionIsDisplayed() { return this.elements.myEventsItem.isDisplayed();}
    public Boolean paymentInfoIconIsDisplayed() { return this.elements.paymentInfoIcon.isDisplayed();}
    public Boolean paymentInfoOptionIsDisplayed() { return this.elements.receiptsItem.isDisplayed();}
    public Boolean logoutIconIsDisplayed() { return this.elements.logoutIcon.isDisplayed();}
    public Boolean logoutOptionIsDisplayed() { return this.elements.logoutItem.isDisplayed();}


}
