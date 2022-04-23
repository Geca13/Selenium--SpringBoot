package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.LoginPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends Base {

    @Autowired
    LoginPageElements elements;
    @Autowired
    Methods methods;

    public Boolean welcomeHeaderIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.headerTitle);}
    public Boolean headerDescriptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.headerDescription);}
    public Boolean loginContinueMessageIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.loginContinueMessage);}
    public Boolean notMemberMessageIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.notMemberMessage);}
    public Boolean registerLinkIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.registerLink);}
    public Boolean emailInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.emailInput);}
    public Boolean passwordInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.passwordInput);}
    public Boolean loginButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.loginButton);}
    public Boolean forgotPasswordIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.forgotPassword);}
    public Boolean googleSignInButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.googleSignInButton);}
    public Boolean facebookSignInButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.facebookSignInButton);}
    public Boolean backToTicketsButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.backToTicketsButton);}
}
