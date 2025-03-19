package com.nazifkaraca.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@CustomQualifier2(EFazlaSecenekler.UCUNCU)
@ApplicationScoped
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Custom Qualifier ENUM 3: " + data;
    }
}
