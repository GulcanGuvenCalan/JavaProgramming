package day21_ForEachLoop;

import java.util.Arrays;

public class Task2EvenAndOddNum {
    public static void main(String[] args) {


        int[] numbers={2,4,6,8,10,35,7,9,77};

        int count=numbers[0];

        for (int each : numbers) {

            if (each % 2 == 0) {
                count = each;
            }
        }
            for (int each : numbers) {

                if(each%2==1){
                    count=each;
                }

        }

        System.out.println(count);


    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */