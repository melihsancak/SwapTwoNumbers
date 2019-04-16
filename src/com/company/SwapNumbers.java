package com.company;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String a[])
    {
        System.out.printf("Enter fist number");
        Scanner one = new Scanner(System.in);
        int firstNumber = one.nextInt();
        System.out.printf("Enter second number");
        Scanner second = new Scanner(System.in);
        int secondNumber = second.nextInt();

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("After swaping:"
                + "First number is = " + firstNumber + ",Second number is = " + secondNumber);
    }
}
