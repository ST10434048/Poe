package org.example;

import java.util.Scanner;

public class Menu {
    enum Items {
        Register,
        Login,
        Exit,
    }

    static void showMenuItems() {
        System.out.println("\nMenu Options: \n");
        for (int x = 0; x < Items.values().length; x++) {
            System.out.println("(" + x + ")" + Items.values()[x]);

        }
        System.out.print("Insert Choice here: ");
    }

    static void promptUser() {
        showMenuItems();
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
        int choice = scanner.nextInt();
//        System.out.println(choice);
        switch (choice) {
            case 0:
                Register.registerUser();
                break;
            case 1:
                Login.loginUser();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
                promptUser();
        }
    }else{
            System.out.println("Invalid Choice");
            promptUser();
        }
    }

}
