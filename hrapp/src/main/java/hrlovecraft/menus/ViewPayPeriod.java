package hrlovecraft.menus;

import hrlovecraft.Paystub;
import hrlovecraft.PaystubWarehouse;

public class ViewPayPeriod extends Menu{
    private static final ViewPayPeriod INSTANCE = new ViewPayPeriod();

    public enum PayPeriod {VIEW_ALL_PAYSTUBS, MAIN, BACK};

    private ViewPayPeriod() {
        super(PayPeriod.values(), "test message"); }

    @Override
    public void userSelect (String userInput){
        switch (PayPeriod.valueOf(userInput)) {
            case VIEW_ALL_PAYSTUBS:
                viewAllPaystubs();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:
                PayrollManagement.getInstance().display();
                break;
        }
    }

    public void viewAllPaystubs(){
        System.out.println(employee.printAllPayStubs());
    }


    public static ViewPayPeriod getInstance() {return INSTANCE;}


}
