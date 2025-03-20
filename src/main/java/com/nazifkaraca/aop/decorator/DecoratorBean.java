package com.nazifkaraca.aop.decorator;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    private IEv iEv;  // Küçük harfle başlamalı


    public String beanMethod(String data) {
        return iEv.boyama(data);
    }
}
