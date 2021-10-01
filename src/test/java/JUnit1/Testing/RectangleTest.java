package JUnit1.Testing;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testRectangleArea(){
        Rectangle R1 = new Rectangle(4,5);
        Rectangle R2 = new Rectangle(34,12);

        Assert.assertTrue(R1.getArea() == 4 * 5);
        Assert.assertTrue(R2.getArea() == 34 * 12);
    }

    @Test
    public void testRectanglePerimeter(){
        Rectangle R1 = new Rectangle(4,5);
        Rectangle R2 = new Rectangle(34,12);

        Assert.assertTrue(R1.getPerimeter() == (4 * 2) + (5 * 2));
        Assert.assertTrue(R2.getPerimeter() == (34 * 2) + (12 * 2));

    }
}
