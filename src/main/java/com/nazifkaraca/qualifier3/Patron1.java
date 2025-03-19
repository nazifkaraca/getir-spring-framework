package com.nazifkaraca.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

@Default
@ApplicationScoped
public class Patron1 implements PatronInterface {

    // @Alternative:
    @Override
    public String surum(String data) {
        return "Default Data: " + data;
    }
}
