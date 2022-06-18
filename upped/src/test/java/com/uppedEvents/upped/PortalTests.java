package com.uppedEvents.upped;

import com.uppedEvents.upped.app.portal.dashboard.Dashboard;
import com.uppedEvents.upped.app.portal.eventOverview.GeneralDetailsTab;
import com.uppedEvents.upped.app.portal.portalPages.PortalLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class PortalTests {



    @Autowired
    PortalLoginPage portalLoginPage;

    @Autowired
    Dashboard dashboard;

    @Autowired
    GeneralDetailsTab generalDetailsTab;

    private String eventName = RandomStringUtils.random(6,true,false);





    @Test
    @Order(1)
    public void createEvent() throws InterruptedException {
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.createNewEvent(eventName);
        Thread.sleep(5000);
    }

    @Test
    @Order(2)
    public void publishEvent() throws InterruptedException {
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.goToMyEventsPage(eventName);
        this.generalDetailsTab.publishEvent();
        Thread.sleep(5000);
    }
}
