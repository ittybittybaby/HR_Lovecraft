package hrlovecraft;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person {
    final long employeeId;
    Contact contactInfo;
    Department department;
    boolean isFullTime;
    LocalDateTime hireDate;
    LocalDateTime terminationDate;
    SalaryTier salaryTier;
    Benefits benefits;
    Position position;
    TimeCardWarehouse TCW=TimeCardWarehouse.getInstance();
    PaystubWarehouse PSW=PaystubWarehouse.getInstance();

    Employee(long employeeId){
        this.employeeId=employeeId;
        hireDate= LocalDateTime.now();
    }

    public long getEmployeeId(){
        return employeeId;
    }

    public LocalDateTime getHireDate(){

        return hireDate;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department dept){
        department=dept;
    }

    public void setSalaryTier(SalaryTier salaryTier){
        this.salaryTier=salaryTier;
    }

    public ArrayList<TimeCard> getTimeCards(Date fromDate, Date toDate){
        return TCW.get(fromDate, toDate);
    }

    public TimeCard getTimeCard(Date fromDate){
        return TCW.get(fromDate);
    }

    public Paystub getPaystub(Date fromDate){
        return PSW.get(fromDate);
    }

    public ArrayList<Paystub> getPaystubs(Date fromDate, Date toDate){
        return PSW.get(fromDate, toDate);
    }


}
