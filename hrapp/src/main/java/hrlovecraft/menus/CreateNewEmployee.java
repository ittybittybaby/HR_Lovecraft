package hrlovecraft.menus;

//import hrlovecraft.MenuPrompts;

import hrlovecraft.EmployeeWarehouse;
import hrlovecraft.State;

import java.util.Scanner;

public class CreateNewEmployee {

    private Scanner in = new Scanner(System.in);

    private static final CreateNewEmployee INSTANCE = new CreateNewEmployee();

    private EmployeeWarehouse eWH = EmployeeWarehouse.getInstance();

    private String[] employee = new String[6];

    private CreateNewEmployee() {
    }

    public void createEmployee() {
        eWH.add(employee);
        System.out.println("\nEmployee added!");
        MainMenu.getInstance().display();
    }

    public void email() {
        System.out.print("Enter an email address: ");
        String email = in.nextLine();
        while (!email.contains("@")) {
            System.out.print("\nPlease make sure your email address has an @ in it.\n\n");
            System.out.print("Enter an email address: ");
            email = in.nextLine();
        }
        employee[5] = email;
    }

    public void phone() {

        System.out.print("Enter a phone number: ");
        String phoneNumber = in.nextLine();
        while (!phoneNumber.matches("\\d{10}")) {
            System.out.print("\nPlease make sure your phone number is 10 digits long.\n\n");
            System.out.print("Enter a phone number: ");
            phoneNumber = in.nextLine();
        }
        employee[4] = phoneNumber;
    }

    public void address() {

        System.out.print("Enter the street address: ");
        employee[1] = in.nextLine().trim();
        System.out.print("Enter the city: ");
        employee[2] = in.nextLine().trim();
        boolean flag = false;
        while (!flag)
            try {
                System.out.print("Enter the State: ");
                String state = in.nextLine().trim().toUpperCase();
                State.valueOf(state);
                employee[3] = state;
                flag = true;
            } catch (Exception ex) {
                System.out.println("Invalid State.");
            }
    }


    public void name() {
        System.out.print("\nEnter the employee's name: ");
        employee[0] = in.nextLine().trim();
    }

    public static CreateNewEmployee getInstance() {
        return INSTANCE;
    }
}
