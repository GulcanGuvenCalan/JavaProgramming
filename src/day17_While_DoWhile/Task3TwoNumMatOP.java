package day17_While_DoWhile;

import java.util.Scanner;

public class Task3TwoNumMatOP {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1=input.nextInt();

        System.out.println("Enter second number");
        int num2=input.nextInt();

        System.out.println("Enter a math operator");

        char ch=input.next().charAt(0);// *,/,+,-

        while (!(ch=='*' || ch=='/'||ch=='+' || ch=='-')){
            System.err.println("Invalid Operator, please re-enter:");
            ch = input.next().charAt(0);

        }
       double result=0;

        if(ch=='+'){
            result=num1+num2;
        }else if(ch=='-'){
            result=result=num1-num2;

        }else if(ch=='*') {
            result = result = num1 * num2;
        }else{
            result = result = num1 / num2;
        }
        System.out.println(result);
        input.close();
    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */