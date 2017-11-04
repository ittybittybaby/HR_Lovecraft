package hrlovecraft.menus;

import hrlovecraft.Employee;

public class EmployeeManagement extends Menu {

    public enum EmpManagement{VIEW, UPDATE, PAYROLL_MANAGEMENT, TERMINATE, TIMECARD, MAIN, BACK}

    private Employee employee;
    public EmployeeManagement(Employee employee){
        super(EmpManagement.values(), "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to manage\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
        this.employee=employee;
    }

    @Override
    public void userSelect(String userInput) {
        switch ( EmpManagement.valueOf(userInput)){
            case VIEW:
                // method to print out all of an employee's info
                break;
            case UPDATE:
                updateInformation();
                break;
            case PAYROLL_MANAGEMENT:
                payrollManagement();
                break;
            case TERMINATE: // Create terminate method
                break;
            case TIMECARD:
                timecard();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:
                FindEmployee.getInstance().display();
                break;
        }
    }

    private void payrollManagement() {
        PayrollManagement.getInstance().display();
    }

    private void updateInformation() {
        new EmployeeUpdateos(employee).display();

    }

    public void timecard(){
        TimeCardManager.getInstance().display();
    }
}
