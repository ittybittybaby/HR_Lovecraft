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


//    public double calculateWage(Employee employee) {
//        int hours = employee.;
//        for(int i = 0; i < ) {
//
//        }
//        return amountPaid;
//    }

    public LocalDateTime getPayPeriodStartDate(){
        return payPeriodStartDate;
    }

    public LocalDateTime getGetPayPeriodEndDate() {
        return payPeriodEndDate;
    }
}
