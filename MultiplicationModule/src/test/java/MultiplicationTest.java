import junit.framework.*;

/**
 * Created by Rory on 2017-03-24.
 */
public class MultiplicationTest extends TestCase {

    Multiplication multiOb = new Multiplication();

    public void testNumberInput() throws Exception
    {
        multiOb.setNumber1(7);
        multiOb.setNumber2(5);
        Assert.assertTrue(multiOb.getNumber1() != 0);
        Assert.assertTrue(multiOb.getNumber2() !=0);
    }

    public void testMultiplication() throws Exception
    {
        multiOb.multiply();
    }


}