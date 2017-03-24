import junit.framework.*;

/**
 * Created by Rory on 2017-03-24.
 */
public class DivisionTest extends TestCase {

    private boolean numbersAreValid = false;
    Division divObject = new Division();

    public void testIfNumbersAreValid() throws Exception {
        try {
            divObject.setNumber1(47);
            divObject.setNumber2(13);
            Assert.assertTrue(divObject.getNumber2() > 0);
            numbersAreValid = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testDivision() throws Exception
    {
        if (numbersAreValid)
        {
            divObject.divide();
        }
    }

}