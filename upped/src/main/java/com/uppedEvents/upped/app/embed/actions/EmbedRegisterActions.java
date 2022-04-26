package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.EmbedRegisterPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmbedRegisterActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    EmbedRegisterPageElements elements;

    public void clickSignInLink() { this.methods.clickElement(this.elements.signInLink);}
    public void clickBackToLoginButton() { this.methods.clickElement(this.elements.backToLoginButton);}
    public void clickCreateAccountButton() { this.methods.clickElement(this.elements.createAccountButton);}
    public void enterFirstName() { this.methods.sendKeysToElement(this.elements.firstNameInput, this.methods.generateRandom6LetterString());}
    public void enterLastName() { this.methods.sendKeysToElement(this.elements.lastNameInput, this.methods.generateRandom9LetterString());}
    public void enterEmail() { this.methods.sendKeysToElement(this.elements.emailInput, this.methods.generateRandomEmail());}
    public void enterGender() { this.methods.sendKeysToElement(this.elements.genderSelect, "Male");}
    public void enterPassword() { this.methods.sendKeysToElement(this.elements.passwordInput, this.methods.generatePassword());} //for not passing match
    public void enterVerifyPassword() { this.methods.sendKeysToElement(this.elements.confirmPassInput, this.methods.generatePassword());}  //for not passing match
    public void enterMatchingPasswords() { this.methods.enterMatchingPasswords(this.elements.passwordInput, this.elements.confirmPassInput);}
    public void enterDateOfBirth() { this.methods.sendKeysToElement(this.elements.birthdayInput, "11112001");}
    public void clearFirstNameInput() { this.methods.clearInputField(this.elements.firstNameInput); }
    public void clearLastNameInput() { this.methods.clearInputField(this.elements.lastNameInput); }
    public void clearBirthdayInput() { this.methods.clearInputField(this.elements.birthdayInput); }
    public void clearGenderSelect() { this.methods.clearInputField(this.elements.genderSelect); }
    public void clearEmailInput() { this.methods.clearInputField(this.elements.emailInput); }
    public void clearPasswordInput() { this.methods.clearInputField(this.elements.passwordInput); }
    public void clearConfirmPassInput() { this.methods.clearInputField(this.elements.confirmPassInput); }
}
