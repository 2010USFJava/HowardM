package com.monicahoward.emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp(){
        System.out.println("Enter your first name");
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toUpperCase();
        System.out.println("Your name is: " + input);
    }
}
