package day14_String;

import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord= input.next();


        System.out.println("Enter second word");
        String secondWord= input.next();
      input.close();

      String result= firstWord.substring(2)+secondWord.substring(2);

        System.out.println(result);





    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */