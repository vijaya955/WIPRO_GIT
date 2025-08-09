package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        LibraryService service = context.getBean("libraryService", LibraryService.class);

        System.out.println("=== Borrow Book ===");
        service.borrowBook("Java in Action");

        System.out.println("\n=== Return Book ===");
        try {
            service.returnBook();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
