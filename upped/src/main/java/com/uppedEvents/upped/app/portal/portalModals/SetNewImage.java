package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SetNewImage extends Base {

    @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setImageButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelImageButton;

    @FindBy(xpath = "//*[text()=' Zoom In ']")
    public WebElement zoomInButton;

    @FindBy(xpath = "//*[text()=' Zoom Out ']")
    public WebElement zoomOutButton;

    @FindBy(xpath = "//*[text()=' Rotate Left ']")
    public WebElement rotateLeftButton;

    @FindBy(xpath = "//*[text()=' Rotate Right ']")
    public WebElement rotateRightButton;

    @FindBy(xpath = "//*[text()='Reset']")
    public WebElement resetButton;

    @FindBy(className = "move")
    public WebElement moveBlock;

    @FindBy(className = "topright")
    public WebElement topRightDot;

    @FindBy(className = "topleft")
    public WebElement topLeftDot;

    @FindBy(className = "bottomright")
    public WebElement bottomRightDot;

    @FindBy(className = "bottomleft")
    public WebElement bottomLeftDot;
}
