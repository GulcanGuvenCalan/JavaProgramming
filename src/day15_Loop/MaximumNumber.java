package day15_Loop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        
        int max=-2147483647;//any user entered number will be greater than -2147483647
        //max12

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter a number");
            int num= input.nextInt();
            
            if(num>max){//if the user entered number is greater than current maximum number
                max=num;
            }
        }
        System.out.println("max = " + max);

    }
}
              /*
Write a program that asks the user to enter a number for 5 times.
Return the maximum number.

 */