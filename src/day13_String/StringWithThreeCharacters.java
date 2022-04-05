package day13_String;

import java.util.Scanner;

public class StringWithThreeCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter a string");
        String word= input.nextLine();

         String result="";

        if(word.length()==0){
            result="string is empty";
        }else if(word.length()>3){
            int lastIndex= word.length()-1;
            result=""+word.charAt(word.length()-3)+word.charAt(word.length()-2)+word.charAt(word.length()-1);

        }else{
           result=word;
        }
        System.out.println(result);

        input.close();
    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */