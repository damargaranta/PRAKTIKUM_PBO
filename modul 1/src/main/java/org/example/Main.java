package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("====Library System====\n");
        System.out.print("1.Login as Student\n");
        System.out.print("3.Login as Admin\n");
        System.out.print("3.Exit\n");

        Scanner input1 = new Scanner(System.in);
        System.out.print("Chose option 1-3:");
        int Choice = input1.nextInt();
        switch (Choice) {
            case 1:
                    Scanner input2 = new Scanner(System.in);
                    String NIM = input2.nextLine();
                    if (NIM.length() < 15){
                        System.out.print("Character must be 15");
                    }
                    else if (NIM.length() > 15){
                        System.out.print("Character must be 15");
            }
                    else {
                        System.out.print("Success Login");
                    }
                    break;
            case 2:
                Scanner input3 = new Scanner(System.in);
                System.out.print("Enter your username: ");
                String user = input3.nextLine();
                System.out.print("Enter your password: ");
                String pass = input3.nextLine();
                if (user.equals("admin") && pass.equals("admin")){
                    System.out.print("Success Login");
                } else {
                    System.out.print("Can't Login, incorrect password or user");
                }
                break;
            case 3:
                break;
            }

        }

    }