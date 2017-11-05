package hrlovecraft.menus;

import hrlovecraft.Department;
import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

import java.util.ArrayList;

public class FindEmployee extends Menu {
    private static final FindEmployee INSTANCE = new FindEmployee();



    public enum FindEmployeeSelections {BY_ID, BY_DEPT, MAIN}

    private FindEmployee() {
        super(FindEmployeeSelections.values());
    }

    @Override
    public void userSelect(String userInput) {
        switch(FindEmployeeSelections.valueOf(userInput)){
            case BY_ID:
                findById();
                break;
            case BY_DEPT:
                findByDept();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
        }
    }

    private void findByDept() {
        String dept=checkDepartment();
        ArrayList<Employee>employeeList=eWH.getEmployees(dept);
        if(employeeList.size()!=0){
        for (Employee employee: employeeList){
            System.out.println("Name: "+employee.getName()+" ID: "+employee.getEmployeeId());
        }
        findById();}
        else System.out.println("No employees found");
    }

    @Override
    public void printMenuMessage() {
        System.out.println( "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
            "What would you like to look Employee up by?\n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");}

    private void findById() {
        System.out.println("Enter the ID of the employee you wish to view: ");
        int employeeId = in.nextInt();

        Employee employee = eWH.getById(employeeId);
        if (employee != null) {
            System.out.println("\n*** Found " + employee.getName() + " ***\n");
            new EmployeeManagement(employee).display();;
        } else {
            System.out.println("Not Found");
            FindEmployee.getInstance().display();
        }
    }

    public static FindEmployee getInstance(){
        return INSTANCE;
    }
}
