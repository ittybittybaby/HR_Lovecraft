package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import static java.time.temporal.ChronoField.MINUTE_OF_DAY;
import static org.junit.Assert.*;

public class TimeCardTest {

    TimeCard tc1=new TimeCard( "11-10-2017-0555");
    TimeCard tc2=new TimeCard( "11-10-2017-1230");
    TimeCard tc3=new TimeCard( "11-10-2017-1630");
    @Test
    public void getHoursWorkedTest() throws Exception {
        double expected=5.02;

        double actual=tc2.getHoursWorked();

        Assert.assertEquals(expected,actual, .001);
    }

    @Test
    public void toStringTest() throws Exception {
        String expected = "";

        String actual=tc2.toString();

        Assert.assertEquals(expected,actual);
    }

}