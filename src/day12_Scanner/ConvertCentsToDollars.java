package day12_Scanner;

import java.util.Scanner;

public class ConvertCentsToDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter cents");
        int cents = input.nextInt();
        System.out.println(cents/100 +" dollars and "+cents%100 + " cents");

input.close();

    }
}
/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */