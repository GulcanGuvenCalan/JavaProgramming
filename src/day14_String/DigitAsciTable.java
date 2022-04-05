package day14_String;

import java.util.Scanner;

public class DigitAsciTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        input.close();

        char c = word.charAt(0);

        String result = "";

        if (c >='0' && c <='9') {
            result = "first character is digit";
        } else if (c >='a' && c <= 'z') {
            result = "first character is lowercase letter";
        } else if (c >='A' && c <= 'Z') {
            result = "first character is uppercase  letter";

        } else {
            result = "first character is special character";
        }
        System.out.println(result);
    }
}






/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table

 */