package com.nazifkaraca.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

@Default
@Named("Patron1")
@ApplicationScoped
public class Patron1 implements PatronInterface {

    // @Alternative:
    @Override
    public String surum(String data) {
        return "Default Data: " + data;
    }
}
