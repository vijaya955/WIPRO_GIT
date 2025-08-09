package com.aop;

public class LibraryService {

    public void borrowBook(String bookName) {
        System.out.println("Borrowing book: " + bookName);
    }

    public void returnBook() {
        System.out.println("Returning book...");
        throw new RuntimeException("Book return failed due to system error!");
    }
}
