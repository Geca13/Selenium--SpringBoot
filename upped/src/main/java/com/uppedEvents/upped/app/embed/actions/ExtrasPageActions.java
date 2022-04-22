package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ExtrasPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExtrasPageActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    ExtrasPageElements elements;
}
