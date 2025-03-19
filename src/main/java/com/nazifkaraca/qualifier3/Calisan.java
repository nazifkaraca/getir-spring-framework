package com.nazifkaraca.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("qualifier3CDI")
@ApplicationScoped
public class Calisan {

    // Defaultta çalışacak kodlar
    //@Inject
    //private PatronInterface patron;

    // istediğim seçeneği seçiyorum
    //@Inject
    //@CustomQualifier2(EFazlaSecenekler.BIRINCI)
    //private PatronInterface patron;

    @Inject
    @CustomQualifier2(EFazlaSecenekler.IKINCI)
    private PatronInterface patron;

    public String getData(String data) {
        return patron.surum(data);
    }
}
