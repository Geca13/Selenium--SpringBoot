package com.uppedEvents.upped.app.microsites.elements.account.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.AccountPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountPageActions extends Base {

    @Autowired
    AccountPageElements elements;

    public void clickEditProfileButton() { this.elements.editProfileButton.click(); }
}
