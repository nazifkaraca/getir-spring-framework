package com.nazifkaraca.iocli_dili;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("iocliCdiliCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    // Parametresiz constructor
    public Calisan(){
        // patronInterface = new Patron(); // Dependency injection yaptığımız için new yapısına gerek kalmadı
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
