package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ConfirmationPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationPageActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    ConfirmationPageElements elements;

    public void clickShareButton() { this.methods.clickElement(this.elements.shareButton);}
    public void clickBackToStartButton() { this.methods.clickElement(this.elements.backToStartButton);}
}
