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

}
