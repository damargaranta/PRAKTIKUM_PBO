package org.example;

import java.util.Scanner;

public class Admin {
    private String[][] userStudent = {
            {"1", "John Doe", "123456789012345", "Computer Science"},
            {"2", "Jane Doe", "234567890123456", "Electrical Engineering"}
    };

    public void menuAdmin() {
        int choice;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 0:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter NIM: ");
        String nim = scanner.nextLine();
        if (nim.length() != 15) {
            System.out.println("NIM must be 15 characters long.");
            return;
        }
        System.out.print("Enter Faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter Program Study: ");
        String programStudy = scanner.nextLine();
        String[] newStudent = {String.valueOf(userStudent.length + 1), name, nim, faculty, programStudy};
        String[][] newUserStudent = new String[userStudent.length + 1][];
        System.arraycopy(userStudent, 0, newUserStudent, 0, userStudent.length);
        newUserStudent[newUserStudent.length - 1] = newStudent;
        userStudent = newUserStudent;
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        System.out.println("Student List:");
        for (int i = 0; i < userStudent.length; i++) {
            System.out.println((i + 1) + ". " + userStudent[i][1] + " (" + userStudent[i][2] + ")");
        }
    }

    public void logout() {
        System.out.println("Logging out...");
    }
}