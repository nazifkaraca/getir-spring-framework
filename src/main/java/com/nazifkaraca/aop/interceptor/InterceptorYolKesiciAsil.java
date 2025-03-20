package com.nazifkaraca.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsil {

    @AroundInvoke public Object loglama(InvocationContext context) {
        System.out.println("İlk Hali: " + context.getMethod().getName());

        // Kullanıcı: Giriş yapmış mı?
        boolean isLogin = false; // Yol kesici olacak değişkenimiz
        Object isContinue = null; // Yol kesilmezse devam edecek

        if (isLogin) {
            // Önce sisteme giriş yapsın
            System.out.println("Önce sisteme giriş yapsın");
           return null;
        } else {
            try {
                isContinue = context.proceed(); // devam etmesini sağlamak
                System.out.println("Sonraki hali " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
