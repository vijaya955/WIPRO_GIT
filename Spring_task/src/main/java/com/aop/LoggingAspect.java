package com.aop;
 
public class LoggingAspect {
 
    public void beforeAdvice() {
        System.out.println("[Before] Method is about to execute.");
    }
 
    public void afterReturningAdvice() {
        System.out.println("[After Returning] Method executed successfully.");
    }
 
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("[After Throwing] Exception occurred: " + ex.getMessage());
    }
 
    public void afterFinallyAdvice() {
        System.out.println("[After (Finally)] Method finished (success or exception).");
    }
}