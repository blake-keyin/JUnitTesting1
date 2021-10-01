package JUnit1.Testing;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {

    @Test
    public void testInvoiceCounter(){
        Invoice I1 = new Invoice("401", "FirstItem", 35, 12);
        Invoice I2 = new Invoice("210", "SecondItem", 59, 19);
        Invoice I3 = new Invoice("182", "ThirdItem", 18, 85);
        Invoice I4 = new Invoice("401", "FourthItem", 35, 12);
        Invoice I5 = new Invoice("210", "FifthItem", 59, 19);
        Invoice I6 = new Invoice("182", "SixthItem", 18, 85);

        Assert.assertTrue(I1.InvoiceCount == 6);

    }

}
