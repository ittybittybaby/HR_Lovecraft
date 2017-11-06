package hrlovecraft;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Paystub {
    private Long employeeID;
    private Double amountPaid;
    private LocalDateTime payPeriodStartDate;
    private LocalDateTime payPeriodEndDate;

    public Paystub(long employeeID, double amountPaid, LocalDateTime payPeriodStartDate, LocalDateTime getPayPeriodEndDate) {
        this.employeeID = employeeID;
        this.amountPaid = amountPaid;
        this.payPeriodStartDate = payPeriodStartDate;
        this.payPeriodEndDate = getPayPeriodEndDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return this.employeeID + "\t$" + this.amountPaid + "\t|\t" + this.payPeriodStartDate.format(formatter) + " - " + this.payPeriodEndDate.format(formatter);
    }

    public LocalDateTime getPayPeriodStartDate() {
        return payPeriodStartDate;
    }

    public LocalDateTime getPayPeriodEndDate() {
        return payPeriodEndDate;
    }
}
