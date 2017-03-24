/**
 * Created by Rory on 2017-03-24.
 */
import java.util.*;
public class runDivision {
    public static void main(String[] args) {
        Division divObject = new Division();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first amount: ");
        int firstNumber = input.nextInt();
        divObject.setNumber1(firstNumber);
        System.out.print("Please enter the amount to divide by: ");
        int secondNumber = input.nextInt();
        divObject.setNumber2(secondNumber);
        if(divObject.getNumber2() > 0) {
            System.out.println("The Answer is: " + divObject.divide());
        }
        else
        {
            System.out.println("Syntax Error: Numbers are not valid");
            System.exit(-1);
        }

    }
}
