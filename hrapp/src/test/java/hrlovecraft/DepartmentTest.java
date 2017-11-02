package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import static hrlovecraft.Department.*;


public class DepartmentTest {

   @Test
    public void setToInventoryManagementTest(){
        Department expected = InventoryManagement;

        Department actual = Department.InventoryManagement;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setToOperationsTest(){
        Department expected = Operations;

        Department actual = Department.Operations;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setToHumanResourcesTest(){
        Department expected = HumanResources;

        Department actual = Department.HumanResources;

        Assert.assertEquals(expected, actual);
    }

}