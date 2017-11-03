package hrlovecraft.menus;

public class EmployeeManagement extends Menu {
    private static final EmployeeManagement INSTANCE=new EmployeeManagement();

    public enum EmpManagement{UPDATE, REPORTS, TERMINATE, TIMCARD, MAIN, BACK}

    private EmployeeManagement(){
        super(EmpManagement.values(), "placeholder message");
    }

    @Override
    public void userSelect(String userInput) {
        switch ( EmpManagement.valueOf(userInput)){
            case UPDATE: updateInformation();
                break;
            case REPORTS: employeeReports();
                break;
            case TIMCARD: timecard();
                break;
            case TERMINATE:
                break;
            case BACK: MainMenu.getInstance().display();
            break;

        }

    }

    private void employeeReports() {
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
