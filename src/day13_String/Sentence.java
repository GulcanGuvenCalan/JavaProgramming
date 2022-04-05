package day13_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a sentence.");
        String s1 = scan.nextLine();

        char firstChar=s1.charAt(0);

        char lastChar=s1.charAt(s1.length()-1);

        System.out.println(firstChar+"."+lastChar);








        scan.close();






    }
}
/*
write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */