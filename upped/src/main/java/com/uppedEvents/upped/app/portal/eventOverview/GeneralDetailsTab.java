package com.uppedEvents.upped.app.portal.eventOverview;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class GeneralDetailsTab extends Base {

    @FindBy(xpath = "//*[text()='Publish']")
    public WebElement publishButton;

    @FindBy(xpath = "//*[text()='Unpublish']")
    public WebElement unPublishButton;

    /*public void elementIsClickable(WebElement element){
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }*/
}
