/**
 * Created by Rory on 2017-03-24.
 */
import java.util.*;
public class runAddition {

    public static void main(String[] args) {
        Addition addObject = new Addition();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number to add: ");
        int firstNumber = input.nextInt();
        addObject.setNum1(firstNumber);
        System.out.print("Please enter the second number to add: ");
        int secondNumber = input.nextInt();
        addObject.setNum2(secondNumber);
        System.out.println("The Answer is: " + addObject.addition());

    }



}
