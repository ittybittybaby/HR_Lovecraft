package hrlovecraft;

public class Menu {
    private static String title;
    private static String message;
    private static String options;


    public static String welcomeMessage() {
        title = "Welcome to the HR application!\n";
        message = "What would you like to do today?\n";
        options = "1) Hire new employee\n2) Manage current employees";
        return title + message + options;
    }


    public static String hireNewEmployee() {
        title = "Hire New Employee\n";
        message = "Please fill out the following information.\n";
        options = "Please enter a name: ";
        return title + message + options;
    }

    public static void manageCurrentEmployees() {
    }
}
