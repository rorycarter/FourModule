import junit.framework.*;

/**
 * Created by Rory on 2017-03-24.
 */
public class SubtractionTest extends TestCase {


    private boolean isValidNumber = false;
    Subtraction subObject= new Subtraction();

    public void testSetNumber() throws Exception
    {
        try
        {
            subObject.setNum1(93);
            subObject.setNum2(27);
            Assert.assertTrue(subObject.getNum1() >= subObject.getNum2());
            isValidNumber = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testSubtraction() throws Exception
    {
        if(isValidNumber) {
            subObject.subtract();
        }
    }

}