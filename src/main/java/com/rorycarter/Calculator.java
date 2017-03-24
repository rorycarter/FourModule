package com.rorycarter;

/**
 * Created by Rory on 2017-03-25.
 */
public class Calculator {
    int num1;
    int num2;

    public void setNumber1(int number1) {
        this.num1 = number1;
    }

    public void setNumber2(int number2) {
        this.num2 = number2;
    }

    public int getNumber1() {
        return num1;
    }

    public int getNumber2() {
        return num2;
    }

    public int addition()
    {
        return num1 + num2;
    }
    public int subtraction()
    {
        return num1 - num2;
    }
    public int multiplication()
    {
        return num1 * num2;
    }

    public int divide()
    {
        return num1/num2;
    }



}
