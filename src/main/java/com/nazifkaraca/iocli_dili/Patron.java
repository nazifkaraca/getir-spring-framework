package com.nazifkaraca.iocli_dili;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Patron implements PatronInterface {

    @Override
    public String surum(String data) {
        return "sürüm " + data;
    }
}
