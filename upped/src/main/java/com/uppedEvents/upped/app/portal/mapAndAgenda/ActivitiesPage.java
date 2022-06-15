package com.uppedEvents.upped.app.portal.mapAndAgenda;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ActivitiesPage extends Base {

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addActivityButton;

    @FindBy(tagName = "table")
    public WebElement activitiesTable;
}
