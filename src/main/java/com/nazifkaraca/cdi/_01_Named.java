package com.nazifkaraca.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor // Parametreli Constructor
@NoArgsConstructor  // Parametresiz Constructor
@Builder            // Builder Pattern

@Named(value= "namedtuto")
@ApplicationScoped
public class _01_Named {

    private Long namedId;
    private String namedData="Merhabalar Named CDI Bean";
}
