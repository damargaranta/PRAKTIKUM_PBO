package org.example;
import java.util.Scanner;

public class Student {
    private String[][] bookList = {
            {"1", "Book 1", "Author 1"},
            {"2", "Book 2", "Author 2"},
            {"3", "Book 3", "Author 3"}
    };

    public void menuStudent() {
        int choice;
        do {
            System.out.println("1. Display Books");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 0:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public void displayBooks() {
        System.out.println("Book List:");
        for (String[] book : bookList) {
            System.out.println("ID: " + book[0] + ", Title: " + book[1] + ", Author: " + book[2]);
        }
    }

    public void logout() {
        System.out.println("Logging out...");
    }
}