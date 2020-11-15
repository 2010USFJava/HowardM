
package com.revature.menu;

import com.revature.users.CustomerAccount;
import com.revature.users.User;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    static int userChoice;


    public static void greeting() {
        System.out.println("====================================================");
        System.out.println("=                                                  =");
        System.out.println("=                                                  =");
        System.out.println("= Welcome to the Bank of America Cyber Banking App =");
        System.out.println("=                                                  =");
        System.out.println("=                                                  =");
        System.out.println("====================================================");

        System.out.println("Please make a selection from the menu");
        System.out.println("1 ==> Register for a new account");
        System.out.println("2 ==> Log in.");
        System.out.println("3 ==> Help");
        System.out.println("0 ==> Exit");
        userChoice  = Integer.parseInt(sc.nextLine());


        switch(userChoice) {

            case 1:
                newUserRegistration();
                break;
            case 2:
                login();

                break;
            case 3: //employee login
                greetingHelp();
                greeting();
                break;
            case 0: //Exit
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("**********************************");
                System.out.println("* Please make a valid selection. *");
                System.out.println("**********************************");


        }

    }

    public static void newUserRegistration() {
        System.out.println("Please enter your first name.");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name");
        String lastName = sc.nextLine();
        System.out.println("Please enter your address");
        String address = sc.nextLine();
        System.out.println("Please enter your username");
        String userName = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        User newUser = new User(firstName, lastName, address, userName, password );
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        System.out.println(newUser.getFirstName()+ " account has been created");
        System.out.println("Please keep a copy of this for your records");
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        System.out.println("-------------------------------------------");

        greeting();
    }

    public static void login(){
            System.out.println("Welcome back!");

            System.out.println("Please enter your user name.");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();
//        System.out.println("Please enter your account number");
//        String accountNumber = sc.nextLine();
        customerMenu( );

    }

    public static void greetingHelp() {
        System.out.println("If you would like to register for a new Bank of America Cyber Banking Account please select option #1");

        System.out.println("If you have already made an account and your account has been approved you may select option #2.");

        System.out.println("If you require further assistance please call our customer support number 1-800-BOA-HELP ");
    }

    public static void customerMenu() {
//        System.out.println("W E L C O M E  B A C K!");

        System.out.println("What would you like to do?");
        System.out.println("1. See full account summary");
        System.out.println("2. Check your balance");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. Make a deposit");
        System.out.println("0. Exit");

        userChoice = Integer.parseInt(sc.nextLine());

        switch (userChoice) {

            case 1:
                System.out.println("You previously created an account");
                customerMenu();
                break;
            case 2:
                System.out.println("Your current balance is " );
                customerMenu();
                break;
            case 3:
                CustomerAccount.withdrawal();
                customerMenu();
                break;
            case 4:
                CustomerAccount.deposit();
                customerMenu();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("**********************************");
                System.out.println("* Please make a valid selection. *");
                System.out.println("**********************************");
                customerMenu();
        }

    }
}


