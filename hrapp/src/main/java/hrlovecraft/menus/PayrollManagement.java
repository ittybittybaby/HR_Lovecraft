package hrlovecraft.menus;

public class PayrollManagement extends Menu {
    private static final PayrollManagement INSTANCE = new PayrollManagement();

    public enum Payroll {CREATE_PAYSTUB, VIEW_PAY_PERIOD, MAIN, BACK}

    private PayrollManagement(){
        super(Payroll.values(), "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                "What would you like to do\n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
    }

    @Override
    public void userSelect(String userInput) {
        switch ( Payroll.valueOf(userInput)){
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
                EmployeeManagement.getInstance().display();
                break;
        }
    }

    private void createPaystub() {
    }

    private void viewPayPeriod() {
    }

    public static PayrollManagement getInstance(){
        return INSTANCE;
    }

}
