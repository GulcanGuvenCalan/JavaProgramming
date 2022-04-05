package day15_Loop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int min=2147483647;//any user entered number will be less than 2147483647

        for (int i = 10; i < 15; i++) {

            System.out.println("Enter a number");
            int num =input.nextInt();//

            if(num<min){
                min=num;
            }
        }
        System.out.println("min = " + min);
        input.close();
    }
}




    /*
Write a program that asks the user to enter a number for 5 times.
Return the maximum number.
 */