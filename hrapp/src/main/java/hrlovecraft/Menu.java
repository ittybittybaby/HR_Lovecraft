package hrlovecraft;

public class Menu {
    private static String title;
    private static String message;
    private static String userChoice;
    private static String userInput;


    public static String welcomeMessage() {
        title = "Welcome to the HR application!\n";
        message = "What would you like to do today? Enter 1 for Hire New Employee. Enter 2 for Manage Current Employees.\n";
        userChoice = "1) Hire New Employee\n2) Manage Current Employees";
        return title + message + userChoice;
    }


    public static String hireNewEmployee() {
        title = "Hire New Employee\n";
        message = "Please fill out the following information.\n";
        userInput = "Please enter a name: ";
        // need to write more form fields for user to fill out
        return title + message + userInput;
    }


    public static String manageCurrentEmployees() {
        title = "Manage Current Employees\n";
        message = "Enter 1 to choose a Department. Enter 2 to choose a Specific Employee.\n";
        userChoice = "1) Department \n 2) Specific Employee";
        return title + message + userChoice;
    }

    // depending on choice, prompt user to input Department name or Employee ID
    // now prompt user to either view or manage Department or Specific Employee
    // if view, need to give options of what to view (e.g. paystubs, benefits, contact information etc.)
    // if manage, need to give options of what to manage (e.g. paystubs, benefits, update contact information, etc.)




}
