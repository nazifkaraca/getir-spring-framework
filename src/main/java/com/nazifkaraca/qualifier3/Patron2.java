package com.nazifkaraca.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@CustomQualifier2(EFazlaSecenekler.BIRINCI)
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Custom Qualifier ENUM 1: " + data;
    }
}
