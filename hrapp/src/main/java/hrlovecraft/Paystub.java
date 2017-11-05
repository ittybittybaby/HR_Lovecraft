package hrlovecraft;

import java.time.LocalDateTime;

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
        return this.employeeID.toString() + " $" + this.amountPaid.toString() + " | " + this.payPeriodStartDate.toString() + " - " + this.payPeriodEndDate.toString();
    }

    public LocalDateTime getPayPeriodStartDate() {
        return payPeriodStartDate;
    }

    public LocalDateTime getPayPeriodEndDate() {
        return payPeriodEndDate;
    }
}
