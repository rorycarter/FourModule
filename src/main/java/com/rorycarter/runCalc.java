package com.rorycarter;

/**
 * Created by Rory on 2017-03-25.
 */
import java.util.*;
public class runCalc {
    public static void main(String[] args)
    {
        Calculator calcObject = new Calculator();
        Scanner input = new Scanner(System.in);
        int choice;
        int numb1;
        int numb2;
        do{
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers" );
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers: ");
            System.out.println("5. Exit");
            System.out.println("Please enter a choice: ");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter first amount: ");
                    numb1 = input.nextInt();
                    calcObject.setNumber1(numb1);
                    System.out.print("Enter second amount: ");
                    numb2 = input.nextInt();
                    calcObject.setNumber2(numb2);
                    System.out.println("The result of " + calcObject.getNumber1() + "+" + calcObject.getNumber2() + "=" + calcObject.addition());
                    break;
                case 2:
                    System.out.print("Enter first amount: ");
                    numb1 = input.nextInt();
                    calcObject.setNumber1(numb1);
                    System.out.print("Enter second amount: ");
                    numb2 = input.nextInt();
                    calcObject.setNumber2(numb2);
                    if(calcObject.getNumber1() > calcObject.getNumber2())
                    {
                        System.out.println("The result of: " + calcObject.getNumber1() + "-" + calcObject.getNumber2() + "=" + calcObject.subtraction());
                        break;
                    }
                    else {
                        System.out.println("Error: off we go");
                        System.exit(-1);
                    }
                case 3:
                    System.out.print("Enter first amount: ");
                    numb1 = input.nextInt();
                    calcObject.setNumber1(numb1);
                    System.out.print("Enter second amount: ");
                    numb2 = input.nextInt();
                    calcObject.setNumber2(numb2);
                    System.out.println("The result of: " + calcObject.getNumber1() + "*" + calcObject.getNumber2() + "=" + calcObject.multiplication());
                    break;
                case 4:
                    System.out.print("Enter first amount: ");
                    numb1 = input.nextInt();
                    calcObject.setNumber1(numb1);
                    System.out.print("Enter second amount: ");
                    numb2 = input.nextInt();
                    calcObject.setNumber2(numb2);
                    if(calcObject.getNumber2() >0)
                    {
                        System.out.println("The result of: " + calcObject.getNumber1()+"/"+calcObject.getNumber2() + "=" + calcObject.divide());
                        break;
                    }
                    else {
                        System.out.println("Error: Off we go");
                        System.exit(-1);
                    }
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choice invalid please enter another");
                    choice = input.nextInt();
            }

        }while(choice != 5);
    }
}
