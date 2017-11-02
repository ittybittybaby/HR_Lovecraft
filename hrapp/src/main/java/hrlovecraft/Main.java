package hrlovecraft;

public class Main {

    public static void main(String[] args) {
        Menu menu = Menu.getMenu();

        menu.printWelcomeMessage();

        menu.setEmployeeName();
        menu.setEmployeeStAddress();
        menu.setEmployeeCity();
        menu.setEmployeeState();
        menu.setEmployeePhoneNumber();
        menu.setEmployeeEmail();
    }
}
