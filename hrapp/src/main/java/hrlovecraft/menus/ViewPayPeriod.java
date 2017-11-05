package hrlovecraft.menus;

import hrlovecraft.Employee;

public class ViewPayPeriod extends Menu{
    private static final ViewPayPeriod INSTANCE = new ViewPayPeriod();

    public enum PayPeriod {MAIN, BACK};

    private Employee employee;

    private ViewPayPeriod(Employee employee) {
        super(PayPeriod.values());
        this.employee = employee;
    }

    @Override
    public void userSelect (String userInput){
        switch (PayPeriod.valueOf(userInput)) {
            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:
                return;
                        }
    }

    @Override
    public void printMenuMessage() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Viewing All Previous Pay Periods\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public void viewAllPaystubs(){
        System.out.println(employee.getAllPaystubRecords());
    }


    public static ViewPayPeriod getInstance() {return INSTANCE;}


}
