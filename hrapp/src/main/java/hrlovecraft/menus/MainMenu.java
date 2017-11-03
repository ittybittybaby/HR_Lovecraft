package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

public class MainMenu extends Menu {

    private static final MainMenu INSTANCE = new MainMenu();

    public enum MainSelections {ADD_NEW_HIRE, EMPLOYEE_MANAGEMENT, MAIN, QUIT}

    private MainMenu() {
        super(MainSelections.values());
    }

    @Override
    public void userSelect(String userInput) {

        switch (MainSelections.valueOf(userInput)) {
            case ADD_NEW_HIRE:
                newHire();
                break;
            case EMPLOYEE_MANAGEMENT:
                employeeManagement();
                break;
            case MAIN:
                break;
            case QUIT:
                System.exit(0);
                break;
            default:
                super.display();

        }

    }

    private void employeeManagement() {
        FindEmployee.getInstance().display();
    }

    private void newHire() {
        CreateNewEmployee.getInstance().display();

    }

    public static MainMenu getInstance() {
        return INSTANCE;
    }
}
