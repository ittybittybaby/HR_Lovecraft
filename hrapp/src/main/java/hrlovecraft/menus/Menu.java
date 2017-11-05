package hrlovecraft.menus;

import hrlovecraft.*;

import java.util.Scanner;

public abstract class Menu {
    EmployeeWarehouse eWH = EmployeeWarehouse.getInstance();

    private final Enum[] enumerations;



    public Menu (Enum[] enumerations) {
        this.enumerations = enumerations;
    }

    Scanner in = new Scanner(System.in);

    public abstract void userSelect(String userInput);


    public void display(){

        String userInput="";

        do{
            userInput=getUserInput();
            userInput=menuToInt(userInput.toUpperCase());
                userSelect(userInput);
        }while (!"back".equalsIgnoreCase(userInput));

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

    public abstract void printMenuMessage();


    public String checkDepartment(){
        String dept="";
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Enter the name of the department you would like to look in: ");
                dept = in.nextLine().toUpperCase();
                Department.valueOf(dept);
                flag=true;
            } catch (Exception ex) {
                System.out.println("Invalid Department Name");
            }
        }
        return dept;
    }

    public String checkState(){
        boolean flag=false;
        String state="";
        while(!flag){
            try{
                System.out.print("Enter the State: ");
                state=in.nextLine().toUpperCase();
                State.valueOf(state);
                flag=true;
            }catch (Exception e){
                System.out.println("Invalid State Entered.");
            }
        }
        return state;
    }

    public String checkPosition(){
        boolean flag=false;
        String position="";
        while(!flag){
            try{
                System.out.print("Enter the new Position: ");
                position=in.nextLine().toUpperCase();
                Position.valueOf(position);
                flag=true;
            }catch (Exception e){
                System.out.println("Invalid Position Entered.");
            }
        }
        return position;
    }

    public String checkSalaryTier(){
        boolean flag=false;
        String salaryTier="";
        while(!flag){
            try{
                System.out.print("Enter the new Salary Tier: ");
                salaryTier=in.nextLine().toUpperCase();
                SalaryTier.valueOf(salaryTier);
                flag=true;
            }catch (Exception e){
                System.out.println("Invalid Salary Tier Entered.");
            }
        }
        return salaryTier;
    }
}
