package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeWarehouseTest {

    EmployeeWarehouse eWH= EmployeeWarehouse.getInstance();
    @Test
    public void addTest() throws Exception {
        int expected=eWH.size()+1;
        eWH.add(new Employee(44));
        int actual =eWH.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() throws Exception {


    }

}