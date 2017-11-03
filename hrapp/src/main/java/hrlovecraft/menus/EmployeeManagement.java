package hrlovecraft.menus;

public class EmployeeManagement extends Menu {
    private static final EmployeeManagement INSTANCE=new EmployeeManagement();

    public enum EmpManagement{UPDATE_EMPLOYEE_INFORMATION, PAYROLL_MANAGEMENT, TERMINATE_EMPLOYEE, MAIN, BACK}

    private EmployeeManagement(){
        super(EmpManagement.values());
    }

    @Override
    public void userSelect(String userInput) {
        switch ( EmpManagement.valueOf(userInput)){
            case UPDATE_EMPLOYEE_INFORMATION:
                updateInformation();
                break;
            case PAYROLL_MANAGEMENT:
                payrollManagement();
                break;
            case TERMINATE_EMPLOYEE:
                break;
            case BACK:
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;


        }

    }

    private void payrollManagement() {
    }

    private void updateInformation() {
    }

    public static EmployeeManagement getInstance(){
        return INSTANCE;
    }
}
