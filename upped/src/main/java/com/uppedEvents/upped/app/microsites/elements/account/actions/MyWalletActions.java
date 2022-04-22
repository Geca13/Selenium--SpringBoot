package com.uppedEvents.upped.app.microsites.elements.account.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.MyWalletScreenElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWalletActions extends Base {

    @Autowired
    MyWalletScreenElements elements;

    @Autowired
    Methods methods;


}
