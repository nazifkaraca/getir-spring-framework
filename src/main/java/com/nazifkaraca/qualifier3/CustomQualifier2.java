package com.nazifkaraca.qualifier3;

import jakarta.inject.Qualifier;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Documented
public @interface CustomQualifier2 {

    // Enum
    EFazlaSecenekler value();
}
