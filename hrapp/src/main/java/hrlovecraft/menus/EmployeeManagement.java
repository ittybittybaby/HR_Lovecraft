package hrlovecraft.menus;

import com.oracle.deploy.update.UpdateCheck;

public class EmployeeManagement extends Menu {
    private static final EmployeeManagement INSTANCE=new EmployeeManagement();

    public enum EmpManagement{UPDATE, PAYROLL_MANAGEMENT, TERMINATE, TIMECARD, MAIN, BACK}

    private EmployeeManagement(){
        super(EmpManagement.values(), "placeholder message");
    }

    @Override
    public void userSelect(String userInput) {
        switch ( EmpManagement.valueOf(userInput)){
            case UPDATE:
                updateInformation();
                break;
            case PAYROLL_MANAGEMENT:
                PayrollManagement.getInstance().display();
                break;
            case TIMECARD: timecard();
                break;
            case MAIN: MainMenu.getInstance().display();
            break;
            default: display();
        }
    }

    private void payrollManagement() {
    }

    private void updateInformation() {

    }

    public static EmployeeManagement getInstance(){
        return INSTANCE;
    }

    public void timecard(){
        TimeCardManager.getInstance().display();
    }
}
