package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.users.User;

public class Driver {
    public static void main(String[] args) {
        User u1 = new User("Beyonce", "Knowles-Carter", "111 Main", "queenbey", "444");
        Menu.greeting();
    }
}
