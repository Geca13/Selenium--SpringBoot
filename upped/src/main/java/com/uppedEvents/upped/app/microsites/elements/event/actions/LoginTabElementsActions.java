package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.LoginTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginTabElementsActions extends Base {

    @Autowired
    LoginTabElements elements;

    public void sendLoginEmail() {
        this.elements.emailInput.sendKeys("parma15@parma.it");
    }

    public void sendLoginPassword() {
        this.elements.passwordInput.sendKeys("Pero1234");
    }
    public void clickLoginButton(){
        this.elements.loginButton.click();
    }
    public void clickGoogleLoginButton(){
        this.elements.googleSignInButton.click();
    }
    public void clickFacebookLoginButton(){
        this.elements.facebookSignInButton.click();
    }
}
