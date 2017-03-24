/**
 * Created by Rory on 2017-03-24.
 */
import java.util.*;
public class runSub {


    public static void main(String[] args) {
        Subtraction subObject = new Subtraction();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first amount: ");
        int firstNumber = input.nextInt();
        subObject.setNum1(firstNumber);
        System.out.print("Please enter the amount to subtract: ");
        int secondNumber = input.nextInt();
        subObject.setNum2(secondNumber);
        if(subObject.getNum1() >= subObject.getNum2() ) {
            System.out.println("The Answer is: " + subObject.subtract());
        }
        else
        {
            System.out.println("Syntax Error: Numbers are not valid");
            System.exit(-1);
        }
    }
}
