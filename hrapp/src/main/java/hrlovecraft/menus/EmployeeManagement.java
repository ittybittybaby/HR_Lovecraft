package hrlovecraft.menus;

public class EmployeeManagement extends Menu {
    private static final EmployeeManagement INSTANCE=new EmployeeManagement();

    public enum EmpManagement{UPDATE, PAYROLL_MANAGEMENT, TERMINATE, MAIN, BACK}

    private EmployeeManagement(){
        super(EmpManagement.values());
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
            case TERMINATE:
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
