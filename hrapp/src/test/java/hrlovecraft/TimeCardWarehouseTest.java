package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TimeCardWarehouseTest {
    TimeCardWarehouse tCW=TimeCardWarehouse.getInstance();

    @Test
    public void addTest() throws Exception {
        int expected =tCW.getSize()+1;

        //tCW.add(new TimeCard(43));
        int actual= tCW.getSize();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest() throws Exception {

        int expected =3;

        //TimeCard tc=tCW.get();
        //int actual=tc.;

        //Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest2() throws Exception {

        String expected =" 2 3 4";

        ArrayList<TimeCard> arr=tCW.get("11032017","11062017");

        String actual="";
        for (int i=0; i<arr.size(); i++)
            actual+=" "+arr.get(i).toString();
        //Assert.assertEquals(expected,actual);
    }

}