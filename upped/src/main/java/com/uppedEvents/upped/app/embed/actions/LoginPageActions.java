package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.LoginPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPageActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    LoginPageElements elements;

    public void login(){
        this.methods.sendKeysToElement(this.elements.emailInput,"parma15@parma.it");
        this.methods.sendKeysToElement(this.elements.passwordInput,"Pero1234");
        this.methods.clickElement(this.elements.loginButton);
    }
    public void clickForgotPasswordLink() { this.methods.clickElement(this.elements.forgotPassword); }
    public void clickRegisterLink() { this.methods.clickElement(this.elements.registerLink); }
}
