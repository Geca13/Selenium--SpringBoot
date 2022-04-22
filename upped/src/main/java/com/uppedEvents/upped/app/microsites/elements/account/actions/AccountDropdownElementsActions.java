package com.uppedEvents.upped.app.microsites.elements.account.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.AccountDropdownElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDropdownElementsActions extends Base {

    @Autowired
    AccountDropdownElements elements;

    public void clickProfileOption(){ this.elements.profileItem.click();}
    public void clickReceiptsOption(){ this.elements.receiptsItem.click();}
    public void clickMyEventsOption(){ this.elements.myEventsItem.click();}
    public void clickPaymentInfoOption(){ this.elements.paymentInfoItem.click();}
    public void clickLogoutOption(){ this.elements.logoutItem.click();}

}
