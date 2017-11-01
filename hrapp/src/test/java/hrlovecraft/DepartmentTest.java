package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import static hrlovecraft.Department.HUMAN_RESOURCES;
import static hrlovecraft.Department.INVENTORY_MANAGEMENT;
import static hrlovecraft.Department.QUALITY_CONTROL;

public class DepartmentTest {

    @Test
    public void setToInventoryManagementTest(){
        Department expected = INVENTORY_MANAGEMENT;

        Department actual = Department.INVENTORY_MANAGEMENT;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setToQualityControlTest(){
        Department expected = QUALITY_CONTROL;

        Department actual = Department.QUALITY_CONTROL;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setToHumanResourcesTest(){
        Department expected = HUMAN_RESOURCES;

        Department actual = Department.HUMAN_RESOURCES;

        Assert.assertEquals(expected, actual);
    }

}