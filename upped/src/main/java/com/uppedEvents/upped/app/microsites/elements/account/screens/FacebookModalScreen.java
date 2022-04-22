package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.FacebookModalElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FacebookModalScreen extends Base {

    @Autowired
    FacebookModalElements elements;

    public Boolean isAtFacebookSignInModal() {return this.wait.until((d) -> this.elements.loginButton.isDisplayed()); }

}
