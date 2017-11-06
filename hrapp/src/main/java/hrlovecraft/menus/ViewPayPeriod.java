package hrlovecraft.menus;

import hrlovecraft.Employee;

public class ViewPayPeriod {

    private Employee employee;

    public ViewPayPeriod(Employee employee) {
        //super(PayPeriod.values());
        this.employee = employee;
    }
//
//    @Override
//    public void userSelect(String userInput) {
//        switch (PayPeriod.valueOf(userInput)) {
//            case MAIN:
//                MainMenu.getInstance().display();
//                break;
//            case BACK:
//                return;
//        }
//    }

//    @Override
//    public void printMenuMessage() {
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
//                "Viewing All Previous Pay Periods\n" +
//                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
//
//    }

    public void printAllPaystubs(){
        String[] empPaystubs = employee.getAllPaystubRecords();
        for(String str : empPaystubs)
            System.out.println(str);
    }


}
