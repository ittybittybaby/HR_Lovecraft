package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

public class MainMenu extends Menu {

    private static final MainMenu INSTANCE = new MainMenu();

    public enum MainSelections {ADD_NEW_HIRE, EMPLOYEE_MANAGEMENT, QUIT}

    private MainMenu() {
        super(MainSelections.values(),  "\n*****************************\n" +
                "Welcome to the HR application\n" +
                "*****************************\n\n" +
                "What would you like to do today\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }

    @Override
    public void userSelect(String userInput) {

        try {
            switch (MainSelections.valueOf(userInput)) {
                case ADD_NEW_HIRE:
                    newHire();
                    break;
                case EMPLOYEE_MANAGEMENT:
                    employeeManagement();
                    break;
                case QUIT:
                    System.exit(0);
                    break;
                default:
                    display();
            }
        }
        catch (Exception e) {
            this.setMenuMessage("");
            System.out.println("\nInvalid main menu input. Please enter again.\n");

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
