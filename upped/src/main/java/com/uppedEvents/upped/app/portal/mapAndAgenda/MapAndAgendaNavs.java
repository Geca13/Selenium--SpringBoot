package com.uppedEvents.upped.app.portal.mapAndAgenda;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class MapAndAgendaNavs extends Base {

    @FindBy(xpath = "//*[text()='Map and Agenda']")
    public WebElement mapAndAgendaHeader;

    @FindBy(xpath = "//*[text()='Event Map']")
    public WebElement eventMapNav;

    @FindBy(xpath = "//*[text()='Schedule']")
    public WebElement scheduleNav;

    @FindBy(xpath = "//*[text()='Performances']")
    public WebElement performancesNav;

    @FindBy(xpath = "//*[text()='Activities']")
    public WebElement activitiesNav;

}
