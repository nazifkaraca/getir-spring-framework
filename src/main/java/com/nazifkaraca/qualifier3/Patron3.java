package com.nazifkaraca.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@CustomQualifier2(EFazlaSecenekler.IKINCI)
@ApplicationScoped
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Custom Qualifier ENUM 2: " + data;
    }
}
