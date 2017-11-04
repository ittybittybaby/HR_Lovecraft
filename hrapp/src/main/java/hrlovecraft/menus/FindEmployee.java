package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

public class FindEmployee extends Menu {
    private static final FindEmployee INSTANCE = new FindEmployee();



    public enum FindEmployeeSelections {BY_ID, BY_DEPT, MAIN, QUIT}

    private FindEmployee() {
        super(FindEmployeeSelections.values(), "\n\n Add New Hire. What information would you like to input" +
                " on the following employee?");
    }

    @Override
    public void userSelect(String userInput) {
        switch(FindEmployeeSelections.valueOf(userInput)){
            case BY_ID: findById();
            break;
        }
    }

    private void findById() {
        System.out.println("Enter the Employee's ID");
        int employeeId=in.nextInt();

        employee=EmployeeWarehouse.getInstance().get(employeeId);
        if (employee!=null){
            System.out.println("Found "+employee.getName());
            new EmployeeManagementos(employee).display();}
        else System.out.println("Not Found");MainMenu.getInstance().display();

    }

    public static FindEmployee getInstance(){
        return INSTANCE;
    }
}
