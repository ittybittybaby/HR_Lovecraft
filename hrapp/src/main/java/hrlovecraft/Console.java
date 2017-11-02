package hrlovecraft;

import java.util.Scanner;

public class Console {


    public static void print(String s) {
        System.out.println(s);
    }

    public static void getWelcomeMenuOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            Menu.hireNewEmployee();
        }
        else if (choice == 2) {
            Menu.manageCurrentEmployees();
        }
        else {
            System.out.println("Invalid Choice. Please enter 1 or 2.");
        }
    }

}
