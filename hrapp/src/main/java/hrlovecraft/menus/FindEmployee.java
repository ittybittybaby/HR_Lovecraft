package hrlovecraft.menus;

import hrlovecraft.Department;
import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

public class FindEmployee extends Menu {
    private static final FindEmployee INSTANCE = new FindEmployee();



    public enum FindEmployeeSelections {BY_ID, BY_DEPT, MAIN, BACK}

    private FindEmployee() {
        super(FindEmployeeSelections.values(), "\n\nSearch for employee. How would you like to search for an employee?");
    }

//    private void findByDepartment() {
//
//    }



    @Override
    public void userSelect(String userInput) {
        switch(FindEmployeeSelections.valueOf(userInput)){
            case BY_ID:
                findById();
                break;
            case BY_DEPT:
                //findByDepartment();
                findById(); // Placeholder option
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
        }
    }

    private void findById() {
        System.out.println("Enter the Employee's ID");
        int employeeId=in.nextInt();

        employee=EmployeeWarehouse.getInstance().get(employeeId);
        if (employee!=null){
            System.out.println("Found "+employee.getName());
            EmployeeManagement.getInstance().display();}
        else System.out.println("Not Found");MainMenu.getInstance().display();

    }



    public static FindEmployee getInstance(){
        return INSTANCE;
    }
}
