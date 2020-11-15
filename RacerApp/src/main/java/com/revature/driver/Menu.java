package com.revature.driver;

import com.revature.race.Race;
import com.revature.racer.Racer;

import java.util.Scanner;

public class Menu {

    public static void greeting(){
        System.out.println("Welcome to Revature Racers");
        System.out.println("Lets get started...");
        System.out.println("Please enter the name of your racer");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Please enter your speed");

        int speed = sc.nextInt();
        System.out.println("Please enter your acceleration");
        int acceleration = sc.nextInt();
        System.out.println("Please enter your special item");
        String specialItem = sc.nextLine();

        Racer a = new Racer(input, specialItem, speed, acceleration);
        Racer b = new Racer("Matt", "Coffee", 40, 90);

       Race fastRace = new Race();

       fastRace.raceTime(a, b);
    }
}
