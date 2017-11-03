package hrlovecraft;


import org.junit.Test;
import org.junit.Assert;

public class PositionTest {


    @Test
    public void getPayRateTestManager() {
        double expected = 25.00;
        double actual = Position.Manager.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestSupervisor() {
        double expected = 20.00;
        double actual = Position.Supervisor.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestITManager() {
        double expected = 20.00;
        double actual = Position.ITManager.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestHRRepresentative() {
        double expected = 15.00;
        double actual = Position.HRRepresentative.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestMaintenanceWorker() {
        double expected = 15.00;
        double actual = Position.MaintenanceWorker.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestDriver() {
        double expected = 15.00;
        double actual = Position.Driver.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestLoader() {
        double expected = 10.00;
        double actual = Position.Loader.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestUnloader() {
        double expected = 10.00;
        double actual = Position.Unloader.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestReceiver() {
        double expected = 10.00;
        double actual = Position.Reciever.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestShipper() {
        double expected = 10.00;
        double actual = Position.Shipper.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getPayRateTestHandler() {
        double expected = 10.00;
        double actual = Position.Handler.getPayRate();
        Assert.assertEquals(expected, actual, 0);
    }
}

