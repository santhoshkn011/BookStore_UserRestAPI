package com.example.bookstore_user.aspectservice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectServices {
    @Before(value = "execution(* com.example.bookstore_user.service.UserService.*(..))")
    public void Before(JoinPoint joinpoint) {
        System.out.println("Before:" + joinpoint.getSignature().getName());
    }

    @After(value = "execution(* com.example.bookstore_user.service.UserService.*(..))")
    public void After(JoinPoint joinpoint) {
        System.out.println("After:" + Arrays.toString(joinpoint.getArgs()));
    }
}
