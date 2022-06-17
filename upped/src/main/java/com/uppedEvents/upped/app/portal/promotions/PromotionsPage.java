package com.uppedEvents.upped.app.portal.promotions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.portal.portalModals.DateTimePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PromotionsPage extends Base {

    @Autowired
    DateTimePicker picker;

    @FindBy(xpath = "//*[text()='Promotions']")
    public WebElement promotionsHeader;

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addPromotionsButton;
}
