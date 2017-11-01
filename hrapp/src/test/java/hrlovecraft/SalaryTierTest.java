package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import static hrlovecraft.SalaryTier.HIGH;
import static hrlovecraft.SalaryTier.LOW;
import static hrlovecraft.SalaryTier.MEDIUM;

public class SalaryTierTest {

    @Test
    public void setTierToLowTest(){
        SalaryTier expected = LOW;

        SalaryTier actual = SalaryTier.LOW;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTierToMediumTest(){
        SalaryTier expected = MEDIUM;

        SalaryTier actual = SalaryTier.MEDIUM;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTierToHighTest(){
        SalaryTier expected = HIGH;

        SalaryTier actual = SalaryTier.HIGH;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowTierMinTest(){
        double expected = 100.00;

        double actual = SalaryTier.LOW.getTierMin();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getLowTierMaxTest(){
        double expected = 999.99;

        double actual = SalaryTier.LOW.getTierMax();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getMediumTierMinTest(){
        double expected = 1000.00;

        double actual = SalaryTier.MEDIUM.getTierMin();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getMediumTierMaxTest(){
        double expected = 4999.99;

        double actual = SalaryTier.MEDIUM.getTierMax();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getHighTierMinTest(){
        double expected = 5000.00;

        double actual = SalaryTier.HIGH.getTierMin();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getHighTierMaxTest(){
        double expected = 20000.00;

        double actual = SalaryTier.HIGH.getTierMax();

        Assert.assertEquals(expected, actual, 0);
    }

}