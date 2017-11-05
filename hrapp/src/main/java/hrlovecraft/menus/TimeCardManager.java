package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.TimeCard;

public class TimeCardManager extends Menu {

    public enum TimeCardManagement{CREATE_TIMECARD, UPDATE_TIMECARD, VIEW_TIMECARD, MAIN, BACK}

    private Employee employee;

    public TimeCardManager(Employee employee){
        super(TimeCardManagement.values());
        this.employee = employee;
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
                return;
            default:
                display();
        }
    }

    @Override
    public void printMenuMessage() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to do\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
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




}
