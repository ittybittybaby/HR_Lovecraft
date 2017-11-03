package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

import java.util.Scanner;

public abstract class Menu {
    EmployeeWarehouse eWH=EmployeeWarehouse.getInstance();

    Employee employee;

    private final Enum[] enumerations;

    public Menu (Enum[] enumerations){this.enumerations=enumerations;}

    Scanner in=new Scanner(System.in);

    public abstract void userSelect(String userInput);

    public void display(){
        String userInput="";
        do{
            userInput=getUserInput();
            userSelect(userInput.toUpperCase());
        }while (!"quit".equalsIgnoreCase(userInput));
        System.out.println("exiting..");
    }

    public String getUserInput(){

        for (Enum e:enumerations)
            System.out.print(" {" +e+"} ");
        System.out.println("Enter your selection: ");
        return in.nextLine();
    }
}
