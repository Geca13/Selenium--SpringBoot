package com.uppedEvents.upped.app.microsites.elements.account.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.FacebookModalElements;
import com.uppedEvents.upped.app.microsites.elements.account.elements.SignInModalElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignInModalScreenActions extends Base {

    @Autowired
    SignInModalElements elements;
    @Autowired
    FacebookModalElements facebookElements;

    @Autowired
    Methods methods;

    public void switchToNewFacebookWindow() { this.methods.switchToPopupWindow(); }

    public void clickFacebookButton() { this.elements.signInWithFacebookButton.click(); }
    public void loginWithFacebook(){
        this.facebookElements.emailInput.sendKeys("javageca@gmail.com");
        this.facebookElements.passInput.sendKeys("Vardar13Negotino");
        this.facebookElements.loginButton.click();
    }

}
