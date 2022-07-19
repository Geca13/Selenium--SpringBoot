package com.uppedEvents.upped.app.portal.dashboard;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//a[text()=' Published ']")
    public WebElement publishedTab;

    public void isOnMyEventsPage() throws InterruptedException {
        this.elementIsClickable(publishedTab);
    }
    public void clickEventByName(String name) throws InterruptedException {
        Thread.sleep(5000);
        this.elementIsVisible(events.get(0));
       WebElement element =  this.driver.findElement(By.xpath("//td[contains(@class, 'column-eventname')]//a[contains(@class, 'table-ticket-name')]//span[text()='"+name+"']"));
        this.clickElement(element);
    }
}
