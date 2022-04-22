package com.uppedEvents.upped.app.microsites.elements.account.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.EditProfilePageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditProfilePageActions extends Base {

    @Autowired
    Methods methods;
    @Autowired
    EditProfilePageElements elements;

    public void clickEditEmailButton() { this.elements.editEmailButton.click();}
    public void clickCancelButtonOnChangeEmailModal() { this.elements.cancelButton.click();}
    public void clickSaveButtonOnChangeEmailModal() { this.elements.saveButton.click();}
    public void clickSaveProfileButton() { this.elements.saveProfileButton.click();}
}
