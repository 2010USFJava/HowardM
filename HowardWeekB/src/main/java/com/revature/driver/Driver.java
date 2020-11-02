package com.revature.driver;

import com.revature.house.House;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static String agentResponse;
    public static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        start();
    }


    public static void start() {


        System.out.println("Hello, Agent. Would you like to create a house entry. Please type (yes/no)");
//        agentResponse = scan.nextLine();
        String aR = scan.nextLine();

        if (aR.equals("yes")){
            System.out.println("Great!");
            enterAddress();

            System.out.println("Would you like to add another property? Please type (yes or no)");
            String ans = scan.next();

            if(ans.equals("yes")){
                enterAddress();
            }

        }
        else {
            System.out.println("Please come back when you ready to create a new entry. Goodbye");
//            enterAddress();
        }
    }

    public static void enterAddress(){
        System.out.println("Please enter the street number");
        String sNum = scan.nextLine();
        System.out.println("Please enter the street name");
        String sNam = scan.nextLine();
        System.out.println("Next, we will enter the comps for " + sNum + " " + sNam);
        System.out.println("If this is a multistory property enter 'true'. If not enter 'false'.");
        Boolean ms = scan.nextBoolean();
        System.out.println("How may bedrooms does this property have?");
        short bd = scan.nextShort();
        System.out.println("What is the total square fee for " + sNum + " " + sNam);
        int sf = scan.nextInt();
        System.out.println("If the following information is correct enter 'yes'. If not, enter 'no'.");
        System.out.println("Property address: " + sNum + " " + sNam);
        System.out.println("Square feet " + sf);
        System.out.println("Total bedrooms " + bd);
        System.out.println("...Populating info...");

        House h1 = new House(sNum, sNam, ms, bd, sf);

        System.out.print(h1.toString());

        ArrayList<House> houseList = new ArrayList();

        houseList.add(h1);
        System.out.println(houseList.toString());

    }

}
