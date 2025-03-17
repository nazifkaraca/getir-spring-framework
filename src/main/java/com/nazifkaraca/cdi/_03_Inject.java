package com.nazifkaraca.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named(value = "injectTuto")
@ApplicationScoped
public class _03_Inject {

    @Inject
    private List<String> consume; // CDI tarafından üretilen liste gelecek

    public List<String> getConsume() {
        return consume;
    }
}
