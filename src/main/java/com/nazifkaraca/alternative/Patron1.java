package com.nazifkaraca.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

@Alternative
@ApplicationScoped
public class Patron1 implements PatronInterface {

    // @Alternative:
    @Override
    public String surum(String data) {
        return "patron1: " + data;
    }
}
