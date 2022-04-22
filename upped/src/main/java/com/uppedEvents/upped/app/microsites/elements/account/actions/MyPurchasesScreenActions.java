package com.uppedEvents.upped.app.microsites.elements.account.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.MyPurchasesScreenElements;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyPurchasesScreenActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    MyPurchasesScreenElements elements;

    public void clickEventDrawer(){
      this.methods.findParentElement(this.elements.eventsNames.get(0)).click();  ;
    }

    public void clickFullReceiptButton() { this.elements.viewReceiptButton.get(0).click();}

    public void clickCloseReceiptButton() { this.elements.closeButton.click();}
}
