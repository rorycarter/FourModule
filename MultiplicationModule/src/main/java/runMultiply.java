/**
 * Created by Rory on 2017-03-24.
 */
import java.util.*;
public class runMultiply {

    public static void main(String[] args) {
        Multiplication multiObj = new Multiplication();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first amount: ");
        int firstNumber = input.nextInt();
        multiObj.setNumber1(firstNumber);
        System.out.print("Please enter the amount to multiply by: ");
        int secondNumber = input.nextInt();
        multiObj.setNumber2(secondNumber);
        if( (multiObj.getNumber1() >0 ) &&(multiObj.getNumber2() > 0) ) {
            System.out.println("The Answer is: " + multiObj.multiply());
        }
        else
        {
            System.out.println("Syntax Error: Numbers are not valid");
            System.exit(-1);
        }
    }

}
