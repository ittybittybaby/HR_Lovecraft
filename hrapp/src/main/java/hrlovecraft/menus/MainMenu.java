package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.EmployeeWarehouse;

public class MainMenu extends Menu {

    private static final MainMenu INSTANCE = new MainMenu();

    public enum MainSelections {ADD_NEW_HIRE, EMPLOYEE_MANAGEMENT, QUIT}

    private MainMenu() {
        super(MainSelections.values());

    }

    @Override
    public void userSelect(String userInput) {
        try {
            switch (MainSelections.valueOf(userInput)) {
                case ADD_NEW_HIRE:
                    newHire();
                    break;
                case EMPLOYEE_MANAGEMENT:
                    findEmployee();
                    break;
                case QUIT:
                    System.exit(0);
                    break;
            }
        }
        // After new hire is added this exception message appears
        catch (Exception e) {
            System.out.println("\nInvalid main menu input. Please enter again.\n");
        }
    }

    @Override
    public void printMenuMessage() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to do today\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void findEmployee() {
        FindEmployee.getInstance().display();
    }

    private void newHire() {
        CreateNewEmployee createNewEmployee = CreateNewEmployee.getInstance();
        createNewEmployee.name();
        createNewEmployee.address();
        createNewEmployee.phone();
        createNewEmployee.email();
        createNewEmployee.createEmployee();
    }

    public static MainMenu getInstance() {
        return INSTANCE;
    }
}
