package hrlovecraft;

public class Menu {

    private static Menu INSTANCE = new Menu();

    public static Menu getMenu() {
        return INSTANCE;
    }

    private Menu() {

    }


    public void printWelcomeMessage() {
        System.out.println("Welcome to the HR application\n"
                            + "What would you like to do today\n"
                            + "1) Hire New Employee\n"
                            + "2) Manage Current Employees");
        Console.getConsole().handleWelcomeMessageInput();
    }

    public void hireNewEmployee() {
        System.out.println("Hire New Employee\n"
                         + "Please fill out the following information\n");
    }

    public void manageCurrentEmployees() {
        System.out.println("Manage Current Employees\n"
                + "1) Choose a Department"
                + "2) Choose a specific employee");
    }


    // depending on choice, prompt user to input Department name or Employee ID
    // now prompt user to either view or manage Department or Specific Employee
    // if view, need to give options of what to view (e.g. paystubs, benefits, contact information etc.)
    // if manage, need to give options of what to manage (e.g. paystubs, benefits, update contact information, etc.)




}
