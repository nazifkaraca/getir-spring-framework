package com.nazifkaraca.aop.decorator;

import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;

@Decorator
public class EvDecorator implements IEv {

    @Inject
    @Delegate
    private IEv iEv;


    @Override
    public String boyama(String data) {
        System.out.println("Decorator buradaydı!");
        String dataInformation=iEv.boyama(data);

        if (dataInformation.equals("kodluyoruz")) {
            dataInformation = dataInformation.toUpperCase();
        }

        return dataInformation;
    }
}
