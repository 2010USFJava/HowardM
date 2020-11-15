package com.revature.menu;

import java.util.Scanner;

public class Menu {

    scanner keyboard = new Scanner(System.in);
    Bank bank = new bank();
    boolean exit;

    public static void main(String[] args){

    }

    public void runMenu(){
        printerHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printerHeader(){
        System.out.println("+----------------------------------------+");
        System.out.println("           Welcome to the Bank            ");
        System.out.println("+----------------------------------------+");
    }

    private void printMenu(){
        System.out.println("Please make a selection");
        System.out.println("1 - Create a new account");
        System.out.println("2 - make a deposit");
        System.out.println("3 - make withdrawl");
        System.out.println("4 - balance");
        System.out.println((" 5 - exit"));
    }

    private int getInput() {
        int choice = 1;
        do {
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection Numbers only please");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("I'm sorry. I'm not sure what you mean.");
            }
            {
                while (choice < 0 || choice > 4) ;
                return choice;
            }
        }

    }
    private void performAction(int choice){
        switch (choice){
            case 0:
                System.out.println("Goodbye");
                break;
            case 1:
                createAccount();

        }
    }

    private void createAccount(){
        String firstName, lastName, ssn, accountType;
        double initialDeposit;
        boolean valid = false;
        while(!valid){
            System.out.println("Please enter an account type: checking or savaings");
            accountType = keyboard.nextLine();
            if(accountType.equalsIgnoreCase("checking") || accountType.equalsIgnoreCase("savings"))
        }
    }
}
