package com.nazifkaraca.aop.interceptor;

import jakarta.enterprise.context.ApplicationScoped;

@InterceptorYolKesici
@ApplicationScoped
public class Login {

    public String isLoginMethod(String data) {
        return "isLogin: " + data;
    }
}
