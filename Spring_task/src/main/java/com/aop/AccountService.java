package com.aop;

public class AccountService {
	    public void openAccount(String name) {
	        System.out.println("Opening account for: " + name);
	    }
	 
	    public void closeAccount() {
	        System.out.println("Closing account...");
	        throw new RuntimeException("Failed to close account!");
	    }
	}
