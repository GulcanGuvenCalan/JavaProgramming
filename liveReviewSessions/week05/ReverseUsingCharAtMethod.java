package week05;

import java.util.Scanner;

public class ReverseUsingCharAtMethod {
    public static void main(String[] args) {
//What is palindrome? "Madam" when you reverse : "madam" again || kayak is palindrome, noon: palindrome PIO for JAVA

    // check for 5 characters word, and without methods that we did not learn

      String word="Madam";


        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));

        String reversedWord = "";
        reversedWord+=word.charAt(4); // reversedWord =  reversedWord + word.charAt(4);
        reversedWord+=word.charAt(3); // += : shorthand operators
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else {
            System.out.println("The word is NOT Palindrome");

        }
    }
}
