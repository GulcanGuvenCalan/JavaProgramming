package day15_Loop;

public class SumOfOddNum {
    public static void main(String[] args) {


        int sum=0;

        for (int i = 0; i <=100 ; i++) {

            if(i%2!=0){
                sum+=i;

            }
        }
        System.out.println("sum = " + sum);
    }
}
/*
Write a program that can return the sum of odd numbers between 1 to 100
 */