package com.uppedEvents.upped.app.portal.dashboard;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyEventsTab extends Base {

    @FindBy(xpath = "//dashboard-events-page")
    public WebElement eventsTable;

    @FindBy(xpath = "//td/a/span")
    public List<WebElement> events;
}
