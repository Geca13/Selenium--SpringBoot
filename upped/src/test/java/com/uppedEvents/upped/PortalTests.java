package com.uppedEvents.upped;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.portal.dashboard.Dashboard;
import com.uppedEvents.upped.app.portal.dashboard.MyEventsTab;
import com.uppedEvents.upped.app.portal.eventModules.MenusPage;
import com.uppedEvents.upped.app.portal.eventOverview.GeneralDetailsTab;
import com.uppedEvents.upped.app.portal.portalPages.PortalLoginPage;
import com.uppedEvents.upped.app.portal.shopManagement.ShopCategoriesPage;
import com.uppedEvents.upped.app.portal.shopManagement.ShopsNavs;
import com.uppedEvents.upped.app.portal.ticketing.TicketsNav;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class PortalTests extends Base {



    @Autowired
    PortalLoginPage portalLoginPage;

    @Autowired
    Dashboard dashboard;

    @Autowired
    MyEventsTab events;

    @Autowired
    GeneralDetailsTab generalDetailsTab;

    @Autowired
    TicketsNav ticketsNav;

    @Autowired
    ShopCategoriesPage categoriesPage;

    @Autowired
    ShopsNavs shopsNavs;

    @Autowired
    MenusPage menusPage;

    private String eventName = "DECNCC" ;//RandomStringUtils.random(6,true,false);


    //TICKETS
    private String ticketOne = "T1 " + eventName;
    private String ticketTwo = "T2 " + eventName;
    private String ticketThree = "T3 " + eventName;
    private String ticketFour = "T4 " + eventName;
    private String ticketOnePrice = "1";
    private String ticketTwoPrice = "0.75 ";
    private String ticketThreePrice = "0.5";
    private String ticketFourPrice = "0.25";





    @BeforeEach
    private void getWebDriver() throws InterruptedException {
        this.driver.manage().window().maximize();
    }

    @AfterEach
    private void quitDriver(){
        this.driver.quit();
    }


    @Test
    @DirtiesContext
    @Order(1)
    public void createEvent() throws InterruptedException {
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.createNewEvent(eventName);
        Thread.sleep(2000);
    }

    @Test
    @DirtiesContext
    @Order(2)
    public void publishEvent() throws InterruptedException {
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.goToMyEventsPage();
        this.events.clickEventByName(eventName);
        this.generalDetailsTab.publishEvent();
        Thread.sleep(5000);
    }

    @Test
    @DirtiesContext
    @Order(3)
    public void createTicketOne() throws InterruptedException {
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.goToMyEventsPage();
        this.events.clickEventByName(eventName);
        this.generalDetailsTab.isOnGeneralDetailsPage();
        this.generalDetailsTab.clickTicketingTab();
        this.ticketsNav.createNewTicket(ticketOne, ticketOnePrice);
        Thread.sleep(2000);
    }

    @Test
    @DirtiesContext
    @Order(3)
    public void navigateToTicketingAndChangeColumns() throws InterruptedException {
        String eventName = "7-15-4:24:6";
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.goToMyEventsPage();
        this.generalDetailsTab.isOnGeneralDetailsPage();
        this.generalDetailsTab.clickTicketingTab();
        this.ticketsNav.clickAddColumnButton();
        Thread.sleep(5000);
    }
    @Test
    @DirtiesContext
    @Order(4)
    public void navigateToShopsAndAddCategories() throws InterruptedException {
        String eventName = "7-12-3:16:27";
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        this.dashboard.isOnDashboardPage();
        this.dashboard.goToMyEventsPage();
        this.generalDetailsTab.isOnGeneralDetailsPage();
        this.generalDetailsTab.clickShopsTab();
        this.shopsNavs.clickShopCategoriesNav();
        this.categoriesPage.moveWinesCategory();
        Thread.sleep(5000);
    }

    @Test
    @DirtiesContext
    @Order(5)
    public void vendorCreateMenuAndAddItemInSection() throws InterruptedException {
        String eventName = "7-12-3:16:27";
        this.portalLoginPage.openPortal();
        this.portalLoginPage.loginToPortal();
        Thread.sleep(5000);
        this.dashboard.goToMenusPage();
        Thread.sleep(5000);
        this.menusPage.addItemToSection();
        Thread.sleep(5000);
    }
}
