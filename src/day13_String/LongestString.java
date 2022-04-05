package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first string text");
        String s1= input.nextLine();

        System.out.println("Enter your second string text");
        String s2= input.nextLine();
     input.close();

        if(s1.length()>s2.length()){
            System.out.println("s1");


        }else if(s2.length()>s1.length()){

            System.out.println("s2");
        }else {
            System.out.println("Both are same length");

        }



    }
}
/*
write a program that asks user to enter two strings, and print out the longest string
 */