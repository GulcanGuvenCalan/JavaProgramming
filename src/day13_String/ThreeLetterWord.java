package day13_String;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.next();

        char middle=word.charAt(1);
        int totalChar=word.length();

        if(totalChar==3){
            if(middle=='a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        }else if(totalChar!=3){
            if(totalChar<3){
                System.out.println("word is too short");
            }else{
                System.out.println("word is too long");
            }
        }


    }
}

/*
 write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */