package com.monicahoward.driver;

import com.monicahoward.beans.Customer;
import com.monicahoward.daoimpl.CustomerDaoImpl;
import com.monicahoward.daoimpl.EmployeeDaoImpl;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
//        CustomerDaoImpl cdi= new CustomerDaoImpl();
//        try{
//            ArrayList<Customer> custoList = (ArrayList<Customer>)cdi.getAllCustomers();
//            System.out.println(custoList.toString());
//        } catch (SQLException e){
//            e.printStackTrace();
//        }


//        Scanner scan = new Scanner(System.in);
//        String customerInput = scan.next();
        header();
        startMenu();

    }

    public static void header(){
        System.out.println("****************************************************************************************");
        System.out.println("*                                                                                      *");
        System.out.println("*              W E L C O M E  T O  C Y B E R  B A N K I N G  5 0 0 0                   *");
        System.out.println("*                                                                                      *");
        System.out.println("****************************************************************************************");
    }

    public static void startMenu(){
        System.out.println("                                                                                        ");
        System.out.println("Are you a customer or employee? Please make a selection.");
        System.out.println(" [1]  =>  Customer ");
        System.out.println(" [2]  =>  Employee ");

        Scanner scan = new Scanner(System.in);
        int customerInput = scan.nextInt();

        if(customerInput == 1){
            customerPortalHome();
        }
        else if( customerInput == 2){
           employeePortalHome();
        }
        else {
            errorMessage();
            startMenu();
        }
    }

    public static void customerPortalHome(){
        System.out.println("****************************************************************************************");
        System.out.println("*                                                                                      *");
        System.out.println("*                     C U S T O M E R  P O R T A L  -  H O M E                         *");
        System.out.println("*                                                                                      *");
        System.out.println("****************************************************************************************");
        System.out.println("Login to an existing account or Register for a new account");
        System.out.println(" [1]  =>  Login ");
        System.out.println(" [2]  =>  Register ");
        Scanner scan = new Scanner(System.in);
        int customerInput = scan.nextInt();
        if(customerInput == 1){
            customerPortalLogin();
        }
        else if( customerInput == 2){
            customerPortalRegister();
        }
        else {
            errorMessage();
            customerPortalHome();
        }
    }

    public static void customerPortalLogin(){
        System.out.println("Enter your user name followed by the enter key");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();
        CustomerDaoImpl cdi = new CustomerDaoImpl();


       try{
           cdi.login(userName, password);
       }
       catch (SQLException e){

       }
       customerMenu();
    }

    public static String getAccountNumber(){
        int random_int = 10000 + new Random().nextInt(9000000);
        String s = String.valueOf(random_int);
        return s;
    }

    public static void customerPortalRegister(){
        System.out.println("Enter your name followed by the enter key");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Enter your user name followed by the enter key");
        String userName = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();
        String acctNumber = getAccountNumber();

        CustomerDaoImpl cdi = new CustomerDaoImpl();
        Customer custo = new Customer(0, name, userName, password, acctNumber);
        try{
            cdi.register(custo);

            System.out.println(custo.toString());
        } catch (SQLException e){
            e.printStackTrace();
        }

        startMenu();

    }
    public static void employeePortalHome(){
        System.out.println("****************************************************************************************");
        System.out.println("*                                                                                      *");
        System.out.println("*                     E M P L O Y E E  P O R T A L  -  H O M E                         *");
        System.out.println("*                                                                                      *");
        System.out.println("****************************************************************************************");
        System.out.println("Login");
        System.out.println("Enter your user name followed by the enter key");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();

        EmployeeDaoImpl edi = new EmployeeDaoImpl();

        try{
            edi.login(userName, password);
        }
        catch (SQLException e){

        }

        System.out.println("Welcome back, " + userName);

    }


    public static void errorMessage(){
        System.out.println("Please make a valid selection");

    }
    public static void customerMenu() {
//        System.out.println("W E L C O M E  B A C K!");

        System.out.println("What would you like to do?");
        System.out.println("1. See full account summary");
        System.out.println("2. Check your balance");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. Make a deposit");
        System.out.println("0. Exit");

        Scanner sc = new Scanner(System.in);

        int userChoice = Integer.parseInt(sc.nextLine());

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
                Customer.withdrawal();
                customerMenu();
                break;
            case 4:
                Customer.deposit();
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
