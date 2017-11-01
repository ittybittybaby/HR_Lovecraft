package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

public class BenefitsTest {

    @Test
    public void getSetSickDaysTest(){
        Benefits benefits = new Benefits();
        int sickDaysExpected = 25;
        benefits.setSickDays(sickDaysExpected);
        int sickDaysActual = benefits.getSickDays();
        Assert.assertEquals(sickDaysExpected, sickDaysActual);
    }

    @Test
    public void getSetVacationDays(){
        Benefits benefits = new Benefits();
        int vacationDaysexpected = 30;
        benefits.setVacationDays(vacationDaysexpected);
        int vacationDaysactual = benefits.getVacationDays();
        Assert.assertEquals(vacationDaysexpected, vacationDaysactual);
    }

    @Test
    public void getHasHealthcare(){
        Benefits benefits = new Benefits();
        boolean expected = false;
        benefits.setBenefitPackageBySalaryTier();
        boolean actual = benefits.getHasHealthcare();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasRetirementPlan(){
        Benefits benefits = new Benefits();
        boolean expected = false;
       benefits.setBenefitPackageBySalaryTier();
        boolean actual = benefits.getHasRetirementPlan();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBenefitsPackageBySalaryTier(){
        Benefits benefits = new Benefits();

    }

}