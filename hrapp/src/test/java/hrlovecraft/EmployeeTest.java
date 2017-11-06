package hrlovecraft;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee generateEmployee() {
        Employee employee = new Employee(1, "tom", "123 st", "newark", "delaware", "2222222222", "zip@zippity.com");
        PaystubWarehouse psw = employee.getPSW();
        TimeCard timeCard1 = new TimeCard("04-20-1999-0420");
        TimeCard timeCard2 = new TimeCard("04-21-1999-0420");
        Paystub paystub1 = new Paystub(1, 100, LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        Paystub paystub2 = new Paystub(1, 100, LocalDateTime.now(), LocalDateTime.now().plusDays(2));
        employee.submitTimeCard(timeCard1);
        employee.submitTimeCard(timeCard2);
        psw.add(paystub1);
        psw.add(paystub2);

        return employee;
    }

    @Test
    public void getAllPaystubRecords() throws Exception {
        Employee employee = generateEmployee();
        String [] arr = employee.getAllPaystubRecords();
        for(String e: arr)
        System.out.println(e);
    }

}