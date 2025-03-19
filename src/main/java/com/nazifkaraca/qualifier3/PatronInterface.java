package com.nazifkaraca.qualifier3;

public interface PatronInterface {

    // @Altermative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı (Patron1 class'ı ya da Patron2 class'ı)
    // @Qualifier  : aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz

    public String surum(String data);
}
