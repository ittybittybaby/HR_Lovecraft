package hrlovecraft;

import java.time.LocalDateTime;

public class Paystub {
    private Long employeeID;
    private Double amountPaid;
    private LocalDateTime payPeriodStartDate;
    private LocalDateTime getPayPeriodEndDate;

    public Paystub() {
        this.employeeID = null;
        this.amountPaid = null;
        payPeriodStartDate = null;
        getPayPeriodEndDate = null;
    }

    public Paystub(long employeeID, double amountPaid, LocalDateTime payPeriodStartDate, LocalDateTime getPayPeriodEndDate) {
        this.employeeID = employeeID;
        this.amountPaid = amountPaid;
        this.payPeriodStartDate = payPeriodStartDate;
        this.getPayPeriodEndDate = getPayPeriodEndDate;
    }


    // need method to calculateWage() double
    public double calculateWage() {
        // do something to calculate the amount the
        // employee would be paid.
        return amountPaid;
    }

    public LocalDateTime getPayPeriodStartDate(){
        return payPeriodStartDate;
    }

    public LocalDateTime getGetPayPeriodEndDate() {
        return getPayPeriodEndDate;
    }
}
