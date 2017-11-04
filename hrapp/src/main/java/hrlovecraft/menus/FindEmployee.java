package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

public class FindEmployee extends Menu {
    private static final FindEmployee INSTANCE = new FindEmployee();



    public enum FindEmployeeSelections {BY_ID, BY_DEPT, MAIN}

    private FindEmployee() {
        super(FindEmployeeSelections.values(), "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                                 "What would you like to look Employee up by?\n" +
                                                 "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public void userSelect(String userInput) {
        switch(FindEmployeeSelections.valueOf(userInput)){
            case BY_ID:
                findById();
                break;
            case BY_DEPT:
                //Find by department method
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
        }
    }

    private void findById() {
        System.out.println("Enter the Employee's ID: ");
        int employeeId = in.nextInt();

        try {
            employee = EmployeeWarehouse.getInstance().get(employeeId);
            if (employee != null) {
                System.out.println("\n*** Found " + employee.getName() + " ***\n");
                EmployeeManagement.getInstance().display();
            } else {
                System.out.println("Not Found");
                FindEmployee.getInstance().display();
            }
        }
        catch (Exception e) {
            this.setMenuMessage("\nInvalid ID. Please enter again.\n");
        }
    }

    public static FindEmployee getInstance(){
        return INSTANCE;
    }
}
