package com.aop;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
 
        AccountService service = context.getBean("accountService", AccountService.class);
 
        System.out.println("=== Opening Account ===");
        service.openAccount("Preety");
 
        System.out.println("\n=== Closing Account ===");
        try {
            service.closeAccount();
        } catch (Exception e) {
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}