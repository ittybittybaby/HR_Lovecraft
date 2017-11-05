package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class EmployeeWarehouseTest {


    EmployeeWarehouse eWH = EmployeeWarehouse.getInstance();
    {
        for (int i = 1; i < 10; i++)
            eWH.add("bob", "123 fake st", "wilminton", "DELAWARE", "5559991234", "none@zip.com");
    }
    @Test
    public void addTest() throws Exception {
        Employee expected=new Employee(44,"tom","123 st", "newark", "delaware", "2222222222", "zip@zippity.com");

        eWH.add(expected);
        Employee actual =eWH.getById(44);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() throws Exception {
ArrayList<Employee> employees= eWH.getEmployees("New_Hire");
for(Employee emp:employees)
    System.out.println(emp.getName());


    }

}