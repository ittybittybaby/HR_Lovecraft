package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PaystubWarehouseTest {

    PaystubWarehouse pSW=PaystubWarehouse.getInstance();
    @Test
    public void addTest() throws Exception {

        int expected =pSW.getSize()+1;

        pSW.add(new Paystub(45, 100, LocalDateTime.now(),LocalDateTime.now()));
        int actual= pSW.getSize();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTest() throws Exception {

        String expected =" 1 2 3 4 5 6 7";

        ArrayList<Paystub> arr=pSW.get("11-01-2017", "11-02-2017");

        String actual="";
        for (int i=0; i<arr.size(); i++)
            actual+=" "+arr.get(i);
        Assert.assertEquals(expected,actual);
    }
    }



