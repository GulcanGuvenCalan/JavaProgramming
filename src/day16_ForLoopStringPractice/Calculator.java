package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= input.nextInt();

        System.out.println("Enter second number");
        int num2= input.nextInt();

        System.out.println("Enter a math operator ");// -,+,*
        char ch= input.next().charAt(0);

        while(!(ch=='*' ||ch=='-' )){
            System.out.println("Invalid number please re-enter number");
        }

        System.out.println((ch=='*')? num1*num2:num1-num2);
    }
}
/*
 Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */