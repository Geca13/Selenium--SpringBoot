package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.LoginTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginTab extends Base {

    @Autowired
    LoginTabElements loginElements;

    public Boolean googleSignInIsDisplayed() { return this.loginElements.googleSignInButton.isDisplayed(); }
    public Boolean facebookSignInButtonIsDisplayed() {return this.loginElements.facebookSignInButton.isDisplayed(); }
   // public Boolean pleaseLoginTitleIsDisplayed() {return this.loginElements.pleaseLoginTitle.isDisplayed(); }
    public Boolean pleaseLoginTitleIsDisplayed() { return this.loginElements.loginTitles.get(1).isDisplayed(); }
    public Boolean loginWithEmailIsDisplayed() { return this.loginElements.loginTitles.get(2).isDisplayed(); }
    public Boolean dontHaveAccountIsDisplayed() { return this.loginElements.loginTitles.get(3).isDisplayed(); }
    public Boolean loginWithEmailSubtitleIsDisplayed() {return this.loginElements.subtitle.get(0).isDisplayed(); }
    public Boolean dontHaveAccountSubtitleIsDisplayed() { return this.loginElements.subtitle.get(1).isDisplayed(); }
    public Boolean emailInputIsDisplayed() { return this.loginElements.emailInput.isDisplayed(); }
    public Boolean passwordInputIsDisplayed() { return this.loginElements.passwordInput.isDisplayed(); }
    public Boolean loginButtonIsDisplayed() { return this.loginElements.loginButton.isDisplayed(); }
    public Boolean forgotButtonIsDisplayed() { return this.loginElements.forgotButton.isDisplayed(); }
    public Boolean signUpButtonIsDisplayed() { return this.loginElements.signUpButton.isDisplayed(); }


    public Boolean isAtTLoginTab() {return this.wait.until((d) -> this.loginElements.googleSignInButton.isDisplayed()); }


}
