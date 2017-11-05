package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.Paystub;
import hrlovecraft.TimeCard;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class CreatePaystub extends Menu {

    public enum createPaystubSelections {YES, NO}

    private Employee employee;

    private CreatePaystub(Employee employee) {
        super(createPaystubSelections.values());
        this.employee = employee;
    }

    public void printMenuMessage() {
        System.out.println("Would you like to create this Paystub?");
    }

    @Override
    public void userSelect(String userInput) {
        switch (createPaystubSelections.valueOf(userInput)) {

        }
    }

    public void printSamplePaystub(String startDateString, String endDateString) {

        ArrayList<TimeCard> timeCards = employee.getTimeCards(startDateString, endDateString);
        LocalDateTime startDate = timeCards.get(0).getTimeIn();
        LocalDateTime endDate = timeCards.get(timeCards.size()).getTimeOut();

        double amountPaid = 0.0d;
        for(TimeCard card : timeCards) {
            amountPaid += card.getHoursWorked();
        }
        amountPaid *= employee.getPosition().getPayRate();

        Paystub newPaystub = new Paystub(employee.getEmployeeId(), amountPaid, startDate, endDate);
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println("========================================");
        System.out.println("\t\t\t" + startDateString + " - " + endDateString);
        System.out.println();
        System.out.println(employee.getName() + "\t--\t" + employee.getEmployeeId());
        System.out.println();
        System.out.println("\t\t\t$" + formatter.format(amountPaid));
        System.out.println();
        System.out.println("========================================");
    }

}
