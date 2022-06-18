package com.uppedEvents.upped.app.portal.eventOverview;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class GeneralDetailsTab extends Base {

    @FindBy(xpath = "//a[text()='Publish']")
    public WebElement publishButton;

    @FindBy(xpath = "//a[text()='Unpublish']")
    public WebElement unPublishButton;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveButton;

    public void isOnGeneralDetailsPage(){
        this.elementIsClickable(saveButton);;
    }

    public void publishEvent(){
        this.isOnGeneralDetailsPage();
        this.clickElement(publishButton);
        this.elementIsClickable(unPublishButton);
    }

    public void unPublishEvent(){
        this.isOnGeneralDetailsPage();
        this.clickElement(unPublishButton);
        this.elementIsClickable(publishButton);
    }

    /*public void elementIsClickable(WebElement element){
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }*/
}
