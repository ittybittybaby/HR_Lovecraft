package hrlovecraft;

import java.util.Date;

public class Paystub {
    private Long employeeID;
    private Double amountPaid;
    private Date payPeriodStartDate;
    private Date getPayPeriodEndDate;

    public Paystub() {
        this.employeeID = null;
        this.amountPaid = null;
        payPeriodStartDate = null;
        getPayPeriodEndDate = null;
    }

    public Paystub(long employeeID, double amountPaid, Date payPeriodStartDate, Date getPayPeriodEndDate) {
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


}

