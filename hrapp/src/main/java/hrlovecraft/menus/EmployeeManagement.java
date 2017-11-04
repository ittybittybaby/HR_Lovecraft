package hrlovecraft.menus;

import hrlovecraft.Employee;

public class EmployeeManagement extends Menu {

    public enum EmpManagement{UPDATE, PAYROLL_MANAGEMENT, TERMINATE, TIMECARD, MAIN, }

    private Employee employee;
    public EmployeeManagement(Employee employee){
        super(EmpManagement.values(), "placeholder message");
        this.employee=employee;
    }

    @Override
    public void userSelect(String userInput) {
        switch ( EmpManagement.valueOf(userInput)){
            case UPDATE:
                updateInformation();
                break;
            case PAYROLL_MANAGEMENT:
                payrollManagement();
                break;
            case TIMECARD: timecard();
                break;
            case MAIN: MainMenu.getInstance().display();
                break;
            default:
                System.out.println("Enter New Selection: ");
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
