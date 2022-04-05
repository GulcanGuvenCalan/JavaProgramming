package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word.");
        String word = input.next();

        int totalChar = word.length();
        String result = "";


        if (totalChar == 5) {
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        } else if (totalChar < 5) {
            result = "Too short!";

        } else {
          result="Too long!";
        }
        System.out.println(result);
input.close();
    }

}




/*
 Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */