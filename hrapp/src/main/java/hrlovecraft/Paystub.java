package hrlovecraft;

import java.time.LocalDateTime;

public class Paystub {
    private Long employeeID;
    private Double amountPaid;
    private LocalDateTime payPeriodStartDate;
    private LocalDateTime payPeriodEndDate;

    public Paystub() {
        this.employeeID = null;
        this.amountPaid = null;
        payPeriodStartDate = null;
        payPeriodEndDate = null;
    }

    public Paystub(long employeeID, double amountPaid, LocalDateTime payPeriodStartDate, LocalDateTime getPayPeriodEndDate) {
        this.employeeID = employeeID;
        this.amountPaid = amountPaid;
        this.payPeriodStartDate = payPeriodStartDate;
        this.payPeriodEndDate = getPayPeriodEndDate;
    }

    @Override
    public String toString(){
        return this.employeeID.toString() + " $" + this.amountPaid.toString() + " | " + this.payPeriodStartDate.toString() + " - " + this.payPeriodEndDate.toString();
    }

    // need method to calculateWage() double
    public double calculateWage() {
        // do something to calculate the amount the
        // employee would be paid.
        return amountPaid;
    }

    public double getAmountPaid() {
        return this.amountPaid;
    }

    public LocalDateTime getPayPeriodStartDate(){
        return payPeriodStartDate;
    }

    public LocalDateTime getPayPeriodEndDate() {
        return payPeriodEndDate;
    }
}
