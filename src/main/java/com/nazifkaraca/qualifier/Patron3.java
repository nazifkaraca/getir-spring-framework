package com.nazifkaraca.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@CustomQualifier
@Named("PATRON3")
@ApplicationScoped
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Custom Qualifier 3: " + data;
    }
}
