package hrlovecraft.menus;

import com.oracle.deploy.update.UpdateCheck;

public class EmployeeManagement extends Menu {
    private static final EmployeeManagement INSTANCE=new EmployeeManagement();

    public enum EmpManagement{VIEW, UPDATE, PAYROLL_MANAGEMENT, TERMINATE, TIMECARD, MAIN, BACK}

    private EmployeeManagement(){
        super(EmpManagement.values(), "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                      "What would you like to manage\n" +
                                      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                      "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
    }

    @Override
    public void userSelect(String userInput) {
        switch (EmpManagement.valueOf(userInput)){
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
            default:
                display();
        }
    }

    private void payrollManagement() {
        PayrollManagement.getInstance().display();
    }

    private void updateInformation() {
        EmployeeUpdate.getINSTANCE().display();

    }

    public static EmployeeManagement getInstance(){
        return INSTANCE;
    }

    public void timecard(){
        TimeCardManager.getInstance().display();
    }
}
