package com.ecommerce.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.ecommerce.service.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Entering: " + joinPoint.getSignature());
    }

    @AfterReturning("execution(* com.ecommerce.service.*.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("Exiting: " + joinPoint.getSignature());
    }
}
