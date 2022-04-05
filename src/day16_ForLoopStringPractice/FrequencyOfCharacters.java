package day16_ForLoopStringPractice;


import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string and a char");
        String str=input.nextLine();

        char ch='g';

        int frequency=0;

        for (int i = 0; i <str.length(); i++) {
            char eachChar=str.charAt(i);

            if(ch==eachChar){
                frequency++;
            }
        }


        System.out.println(frequency);
    }
}
/*
Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
