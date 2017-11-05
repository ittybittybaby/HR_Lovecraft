package hrlovecraft.menus;

import hrlovecraft.Employee;

public class PayrollManagement extends Menu {

    public enum Payroll {CREATE_PAYSTUB, VIEW_PAY_PERIOD, MAIN, BACK}

    private Employee employee;

    public PayrollManagement(Employee employee) {
        super(Payroll.values());
        this.employee = employee;
    }

    @Override
    public void userSelect(String userInput) {
        switch (Payroll.valueOf(userInput)) {
            case CREATE_PAYSTUB:
                createPaystub();
                break;
            case VIEW_PAY_PERIOD:
                viewPayPeriod();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:
                new EmployeeManagement(employee).display();
                break;
        }
    }

    @Override
    public void printMenuMessage() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to do\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
    }

    private void createPaystub() {
        new CreatePaystub(employee).display();
    }

    private void viewPayPeriod() {
        new ViewPayPeriod(employee).display();
    }

}
