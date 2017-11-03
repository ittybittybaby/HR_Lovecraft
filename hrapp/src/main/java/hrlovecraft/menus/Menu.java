package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

import java.util.Scanner;

public abstract class Menu {
    EmployeeWarehouse eWH = EmployeeWarehouse.getInstance();

    static Employee employee;

    private final Enum[] enumerations;

    private String menuMessage;

    public Menu (Enum[] enumerations, String menuMessage) {
        this.enumerations = enumerations;
        this.menuMessage =  menuMessage;
        eWH.add("bob", "123 fake st", "wilminton", "DELAWARE", "5559991234", "none@zip.com");
    }

    Scanner in = new Scanner(System.in);

    public abstract void userSelect(String userInput);

    public void display(){
        String userInput="";
        do{
            userInput=getUserInput();
            userSelect(menuToInt(userInput.toUpperCase()));
        }while (!"quit".equalsIgnoreCase(userInput));
        System.out.println("exiting..");
    }

    public String menuToInt(String input) {
        int output = 0;
        try {
            output = Integer.parseInt(input)-1;
            return "" + this.enumerations[output];
        }
        catch (Exception e) {
            //System.err.println("\nInvalid menu option. Please try again.");
        }
        return null;
    }

    public String getUserInput(){
        int count = 0;
        printMenuMessage();

        for (Enum e:enumerations) {
            count++;
            System.out.println(count + ") " + e );
        }
        System.out.print("\nEnter your selection: " + "\n");
        return in.nextLine();
    }

    public void printMenuMessage() {
        System.out.println(this.menuMessage);
    }

    public void setMenuMessage(String newMessage) {
        this.menuMessage = newMessage;
    }
}
