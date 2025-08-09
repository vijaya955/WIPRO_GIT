package com.aop;

public class LibraryAspect {

    public void logBefore() {
        System.out.println("[Before] Library method execution starting...");
    }

    public void logAfterReturning() {
        System.out.println("[After Returning] Book operation successful.");
    }

    public void logAfterThrowing(Exception ex) {
        System.out.println("[After Throwing] Error occurred: " + ex.getMessage());
    }

    public void logAfterFinally() {
        System.out.println("[After (Finally)] Library method completed.");
    }
}
