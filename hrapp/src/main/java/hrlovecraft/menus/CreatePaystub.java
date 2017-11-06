package hrlovecraft.menus;

import hrlovecraft.Employee;
import hrlovecraft.Paystub;
import hrlovecraft.PaystubWarehouse;
import hrlovecraft.TimeCard;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class CreatePaystub {

    private Employee employee;
    private PaystubWarehouse psw;
    private String startDateString;
    private String endDateString;
    private Paystub paystub;
    Scanner in = new Scanner(System.in);
    public CreatePaystub(Employee employee) {
        this.employee = employee;
        this.psw = employee.getPSW();
    }

    public void printSamplePaystub() {
        System.out.print("Enter a start date (MM-dd-yyyy): ");
        this.startDateString = in.nextLine();
        System.out.print("Enter an end date (MM-dd-yyyy): ");
        this.endDateString = in.nextLine();

        ArrayList<TimeCard> timeCards = employee.getTimeCards(startDateString, endDateString);
        LocalDateTime startDate = timeCards.get(0).getTimeIn();
        LocalDateTime endDate = timeCards.get(timeCards.size() - 1).getTimeOut();

        double amountPaid = 0.0d;
        for (TimeCard card : timeCards) {
            amountPaid += card.getHoursWorked();
        }
        amountPaid *= employee.getPosition().getPayRate();

        Paystub newPaystub = new Paystub(employee.getEmployeeId(), amountPaid, startDate, endDate);
        NumberFormat formatter = new DecimalFormat("#0.00");

        this.paystub = newPaystub;

        System.out.println("========================================");
        System.out.println("\t\t\t" + timeCards.get(0).toString() + " - " + timeCards.get(timeCards.size() - 1).toString());
        System.out.println();
        System.out.println(employee.getName() + "\t--\t" + employee.getEmployeeId());
        System.out.println();
        System.out.println("\t\t\t$" + formatter.format(amountPaid));
        System.out.println();
        System.out.println("========================================");

        psw.add(newPaystub);
    }

}
