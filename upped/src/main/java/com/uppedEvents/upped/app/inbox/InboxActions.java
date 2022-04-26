package com.uppedEvents.upped.app.inbox;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.event.KeyEvent;

@Component
public class InboxActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    InboxElements elements;

    @Value("${inbox.url}")
    private String inboxUrl;

    public void openInbox(){ this.driver.get(inboxUrl);}
    public void loginToInbox() throws InterruptedException {
        Thread.sleep(5000);


       //Alert alert = this.driver.switchTo().alert();
        Thread.sleep(5000);
        ( (JavascriptExecutor) driver ).executeScript("window.alert = function(){ let list = document.getElementsByTagName(\"input\"); list[0].value = \"mail\"; list[1].value = \"upped2021\"; let button = document.getElementByTagName(\"button\"); button.click();}");

        Thread.sleep(5000);

    }
}
