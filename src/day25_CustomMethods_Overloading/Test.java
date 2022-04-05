package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";

        StringUtility.printEachChar(str);
        System.out.println("---------------------");

        String s1="Wooden Spoon";

       String reverse= StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("---------------------------");

        String word="Civic";
       boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);


        System.out.println("--------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);

    }
}
