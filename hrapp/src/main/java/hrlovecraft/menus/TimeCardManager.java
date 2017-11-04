package hrlovecraft.menus;

import hrlovecraft.TimeCard;

public class TimeCardManager extends Menu {

    private static final TimeCardManager INSTANCE=new TimeCardManager();

    public enum TimeCardManagement{CREATE_TIMECARD, UPDATE_TIMECARD, VIEW_TIMECARD, MAIN, BACK}

    private TimeCardManager(){
        super(TimeCardManagement.values(), "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                           "What would you like to do\n" +
                                           "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                           "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
    }

    @Override
    public void userSelect(String userInput) {
        switch (TimeCardManagement.valueOf(userInput)) {
            case CREATE_TIMECARD:
                createTimeCard();
                break;
            case UPDATE_TIMECARD:
                updateTimeCard();
                break;
            case VIEW_TIMECARD:
                viewTimeCard();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:
                EmployeeManagement.getInstance().display();
            default:
                display();
        }
    }

    private void createTimeCard(){
        System.out.println("Enter time in (MM-DD-YYYY-HHmm):");
        String timeIn = in.nextLine();
        TimeCard timeCard = new TimeCard(timeIn);
        employee.submitTimeCard(timeCard);

    }

    private void updateTimeCard(){

    }

    private void viewTimeCard(){

    }

    public static TimeCardManager getInstance(){
        return INSTANCE;
    }

}
