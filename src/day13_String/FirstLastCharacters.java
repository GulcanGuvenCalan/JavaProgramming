package day13_String;

import java.util.Scanner;

public class FirstLastCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your string text");
        String s1= input.nextLine();

        char firstChar = s1.charAt(0);
        char lastChar = s1.charAt(s1.length()-1);


        if(firstChar==lastChar){
            System.out.println("same");
        }else{
            System.out.println("Not same");
        }
input.close();

    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */