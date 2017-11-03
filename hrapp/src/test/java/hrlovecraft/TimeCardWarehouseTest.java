package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TimeCardWarehouseTest {
    TimeCardWarehouse tCW=TimeCardWarehouse.getInstance();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
    @Test
    public void addTest() throws Exception {

        TimeCard expected = new TimeCard("10-12-2017-1045");

        tCW.add(expected);
        TimeCard actual= tCW.get("10-12-2017");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest() throws Exception {

        String expected ="11-04-2017";

        TimeCard tc=tCW.get("11-04-2017");
        LocalDateTime time=tc.getTimeIn();
        String actual=time.format(formatter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest2() throws Exception {

        String expected =" 2 3 4";

        tCW.add(new TimeCard("10-12-2017-1045"));
        ArrayList<TimeCard> arr=tCW.get("10-03-2017","11-02-2017");

        String actual="";
        for (int i=0; i<arr.size(); i++)
            actual+="\n"+arr.get(i).toString();
        Assert.assertEquals(expected,actual);
    }

}