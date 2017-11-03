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
        int choice = Integer.parseInt(getStringInput());
        switch (choice) {
            case 1 :
                //Menu.getMenu().hireNewEmployee();

                break;

            case 2 :
                //Menu.getMenu().manageCurrentEmployees();
                int userChoice = Integer.parseInt(getStringInput());
                switch (userChoice){
                    case 1 :
                        System.out.println("Please enter a specific employee ID: ");
                        long employeeID = Long.parseLong(getStringInput());
                        break;

                    default :
                        System.out.println("Wrong input");
                        break;
                } // End switch on userChoice
                break;

            default :
                System.out.println("Wrong input");
                break;


        }
    }

    public String getStringInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getStringInput(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.nextLine();
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
       // Contact contactInfo = new Contact(streetAddress, city, state1, phoneNumber, email);
        //Person person = new Person(name, contactInfo);
    }


}
