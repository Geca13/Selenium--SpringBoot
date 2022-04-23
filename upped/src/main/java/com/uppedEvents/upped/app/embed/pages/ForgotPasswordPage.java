package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ForgotPasswordPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForgotPasswordPage extends Base {

    @Autowired
    Methods methods;

    @Autowired
    ForgotPasswordPageElements elements;

    public Boolean forgotPasswordHeaderIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.headerTitle); }
    public Boolean forgotPasswordDescriptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.headerDescription); }
    public Boolean loginLinkIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.loginLink); }
    public Boolean emailInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.emailInput); }
    public Boolean submitButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.submitButton); }
}
