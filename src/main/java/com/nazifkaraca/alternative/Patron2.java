package com.nazifkaraca.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

@Alternative
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "patron2: " + data;
    }
}
