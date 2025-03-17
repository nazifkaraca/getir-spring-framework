package com.nazifkaraca.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;

import java.io.Serializable;

// Kapsam
// Objenin yaşam süresi
// Performansı etkileyecektir
@Named
//@ApplicationScoped // Bütün uygulama boyunca çalışıyor ve bütün kullanıcılar
//@RequestScoped // Bir istek boyunca yaşar
//@SessionScoped // Bir kullanıcı için yaşar ancak logout olunca gider
//@Dependent // Bukalemun, çağırılan class'ın scope'unu alır
//@ConversationScoped // Belli istek boyunca yaşar (ürüne sepet ekleyip bittikten sonra)
@SessionScoped // Bean bir instance olmasını sağlamak için kullanılr
public class _00_Scoped implements Serializable {

}
