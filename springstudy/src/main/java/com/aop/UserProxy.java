package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    @Pointcut(value = "execution(* com.aop.*.*(..))")
    public void joinPoint() {

    }

    @Before(value = "joinPoint()")
    public void before() {
        System.out.println("...........before...........");
    }

    @After(value = "joinPoint()")
    public void after() {
        System.out.println("...........after...........");
    }

    @Around(value = "joinPoint()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("...........aroundbefore...........");
        proceedingJoinPoint.proceed();
        System.out.println("...........aroundafter...........");
    }

}
