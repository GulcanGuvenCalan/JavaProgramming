package day20_Arrays;

import java.util.Arrays;

public class Task1ReverseNumbers {
    public static void main(String[] args) {

        int[] numbers=new int[101];

        int num1=0;

        for (int i = numbers.length - 1; i >= 0; i--,num1++) {
            numbers[i]=num1;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
/*
 create an array that has the numbers 100 to 1
 */