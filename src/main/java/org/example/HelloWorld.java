package org.example;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = reader.nextInt();
        System.out.println("You entered:" + number);

    }
}