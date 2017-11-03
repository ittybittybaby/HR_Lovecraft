package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PaystubWarehouseTest {

    PaystubWarehouse pSW=new PaystubWarehouse();
    {for (int i=1; i<10; i++)
        pSW.add(new Paystub(45, 1200, LocalDateTime.now(), LocalDateTime.now()));
    }
    @Test
    public void addTest() throws Exception {

        Paystub expected =new Paystub(45, 100, TimeCardWarehouse.stringToDate(("10-01-2017")),LocalDateTime.now());

        pSW.add(expected);
        Paystub actual= pSW.get("10-01-2017");

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTest2() throws Exception {

        String expected =" 1 2 3 4 5 6 7";

        ArrayList<Paystub> arr=pSW.get("11-01-2017", "11-04-2017");

        String actual="";
        for (int i=0; i<arr.size(); i++)
            actual+=" "+arr.get(i);
        Assert.assertEquals(expected,actual);
    }
    }



