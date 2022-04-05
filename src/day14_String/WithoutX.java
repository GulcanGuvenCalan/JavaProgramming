package day14_String;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a word");
        String word= input.next();
input.close();
       String firstChar=word.replaceFirst("x","");
        System.out.println(firstChar);

    }
}
/*
.Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */