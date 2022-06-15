package com.uppedEvents.upped.app.portal.mapAndAgenda;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class PerformancesPage extends Base {

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addPerformanceButton;

    @FindBy(tagName = "table")
    public WebElement performancesTable;
}
