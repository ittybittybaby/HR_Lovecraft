package hrlovecraft;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person {
    private final long employeeId;
    private Department department;
    boolean isFullTime;
    private LocalDateTime hireDate;
    private LocalDateTime terminationDate;
    private SalaryTier salaryTier;
    private Benefits benefits;
    private Position position;
    private TimeCardWarehouse TCW = new TimeCardWarehouse();
    private PaystubWarehouse PSW = new PaystubWarehouse();

    Employee(long employeeId, String name,String addr, String city, String state, String phone, String email){
        super(name, addr, city, state, phone, email);
        this.employeeId=employeeId;
        hireDate= LocalDateTime.now();
        terminationDate = null;
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

    public ArrayList<TimeCard> getTimeCards(String fromDate, String toDate){
        return TCW.get(fromDate, toDate);
    }

    public TimeCard getTimeCard(String fromDate){
        return TCW.get(fromDate);
    }

   public Paystub getPaystub(String fromDate){
       return PSW.get(fromDate);
    }

    public ArrayList<Paystub> getPaystubs(String fromDate, String toDate){
        return PSW.get(fromDate, toDate);
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
    }


}
