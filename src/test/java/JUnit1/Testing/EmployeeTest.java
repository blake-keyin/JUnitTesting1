package JUnit1.Testing;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testGetAnnualSalary(){
        Employee employeeTest = new Employee(012,"Blake","Legge",5000);

        Assert.assertTrue(employeeTest.getAnnualSalary() == 5000 * 12);
    }

    @Test
    public void testRaiseSalaryBy20Percent(){
        Employee employeeTest = new Employee(219,"John","Smith",4500);
        Employee employeeTest2 = new Employee(100,"James","Doe",5000);

        employeeTest.raiseSalary(20);
        employeeTest2.raiseSalary(20);

        Assert.assertTrue(employeeTest.getSalary() == 4500 * 1.2);
        Assert.assertTrue(employeeTest2.getSalary() == 5000 * 1.2);
    }

}
