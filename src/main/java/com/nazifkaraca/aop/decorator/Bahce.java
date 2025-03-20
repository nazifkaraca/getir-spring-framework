package com.nazifkaraca.aop.decorator;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped  // CDI tarafından yönetilmesini sağlar!
public class Bahce implements IEv {

    @Override
    public String boyama(String data) {
        return data;
    }
}
