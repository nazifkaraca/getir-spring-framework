package com.nazifkaraca.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import jakarta.inject.Qualifier;
import java.lang.annotation.Documented;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Documented
public @interface CustomQualifier {

}
