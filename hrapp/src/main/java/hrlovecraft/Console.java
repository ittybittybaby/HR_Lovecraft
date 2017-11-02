package hrlovecraft;

import java.util.Scanner;

public class Console {

    private static Console INSTANCE = new Console();

    public static Console getConsole() {
        return INSTANCE;
    }

    private Console() {

    }

    public void handleWelcomeMessageInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            //Menu.getMenu().hireNewEmployee();
            Console.getConsole().handleHireNewEmployeePersonalInput();

        }
        else if (choice == 2) {
            //Menu.getMenu().manageCurrentEmployees();
        }
        else {
            System.out.println("Invalid response. Shutting down.");
            System.exit(0);
        }
    }

    public void handleHireNewEmployeePersonalInput() {
        System.out.println("Please enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter the employee's current street address.");
        String streetAddress = scanner.nextLine();
        System.out.println("Please enter the employee's current city.");
        String city = scanner.nextLine();
        System.out.println("Please enter the employee's current state.");
        String state = scanner.nextLine();
        State state1 = State.valueOfName(state);
        System.out.println("Please enter the employee's phone number.");
        int phoneNumber = scanner.nextInt();
        System.out.println("Please enter the employee's email address.");
        String email = scanner.nextLine();
        Contact contactInfo = new Contact(streetAddress, city, state1, phoneNumber, email);
        Person person = new Person(name, contactInfo);
    }


}
