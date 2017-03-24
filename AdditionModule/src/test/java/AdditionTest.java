import junit.framework.*;
import java.util.Scanner;


/**
 * Created by Rory on 2017-03-24.
 */
public class AdditionTest extends TestCase {

    private boolean numbersAreValid = false;
    Addition add = new Addition();

    public void testSetNumber() throws Exception {
        try
        {
            add.setNum1(93);
            add.setNum2(27);
            numbersAreValid = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testGetNumbers() throws Exception
    {
        add.getNum1();
        add.getNum2();
    }

    public void testAddition() throws Exception
    {
        if(numbersAreValid) {
            add.addition();
        }
    }

}