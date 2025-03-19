package com.nazifkaraca.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("qualifierCDI")
@ApplicationScoped
public class Calisan {

    // Defaultta çalışacak kodlar
    // @Inject
    // private PatronInterface patron;

    // Qualifier yapısı gelecek
    @Inject
    @Named("Patron2")
    private PatronInterface patron;

    public String getData(String data) {
        return patron.surum(data);
    }
}
