package com.uppedEvents.upped.app.portal.eventOverview.DesignNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class DesignNavs extends Base {

    @FindBy(xpath = "//*[text()='Event Card Design']")
    public WebElement eventCardDesignSubNav;

    @FindBy(xpath = "//*[text()='App Design']")
    public WebElement appDesignSubNav;

    @FindBy(xpath = "//*[text()='Event Site']")
    public WebElement eventSiteSubNav;

    @FindBy(xpath = "//*[text()='Sponsorship']")
    public WebElement sponsorshipSubNav;

    @FindBy(xpath = "//*[text()='Embedding']")
    public WebElement embeddingSubNav;
}
