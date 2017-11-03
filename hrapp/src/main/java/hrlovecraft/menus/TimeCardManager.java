package hrlovecraft.menus;

import hrlovecraft.TimeCard;

public class TimeCardManager extends Menu {

    private static final TimeCardManager INSTANCE=new TimeCardManager();

    public enum TimeCardManagement{CREATE, UPDATE, VIEW, MAIN, BACK}

    private TimeCardManager(){
        super(TimeCardManagement.values());
    }

    @Override
    public void userSelect(String userInput) {
        switch (TimeCardManagement.valueOf(userInput)) {
            case CREATE:
                createTimeCard();
                break;
            case UPDATE:
                updateTimeCard();
                break;
            case VIEW:
                viewTimeCard();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
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
