package com.nazifkaraca.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.enterprise.inject.Produces;
import java.util.List;
import java.util.ArrayList;

@Named(value="produceTuto")
@ApplicationScoped
public class _02_Produce {

    @Produces // produces will be consumed by "inject"
    public List<String> getList(){
        List<String> list = new ArrayList<String>();
        list.add("Html5");
        list.add("CSS3");
        list.add("Js");
        list.add("React");
        list.add("Angular");
        return list;
    }
}
