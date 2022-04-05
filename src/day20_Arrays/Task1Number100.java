package day20_Arrays;

import java.util.Arrays;

public class Task1Number100 {
    public static void main(String[] args) {

        int[] numbers=new int[101];

        int num1=0;
        for (int i =0; i <numbers.length; i++,num1++) {

           numbers[i]=num1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
/*
 create an array that has the numbers 1 to 100
 */