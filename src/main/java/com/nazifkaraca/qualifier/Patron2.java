package com.nazifkaraca.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

@CustomQualifier
@Named("Patron2")
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Custom Qualifier 2: " + data;
    }
}
