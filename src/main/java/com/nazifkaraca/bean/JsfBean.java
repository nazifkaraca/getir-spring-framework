package com.nazifkaraca.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named("cdiBean")  // EL içinde `#{cdiBean}` olarak kullanılmasını sağlar
@ApplicationScoped // Uygulama genelinde aynı instance'ı korur
@Getter
@Setter
public class JsfBean {
    private String patika;

    public JsfBean() {
        this.patika = "Spring Boot Eğitimine Hoşgeldiniz!";
    }
}
