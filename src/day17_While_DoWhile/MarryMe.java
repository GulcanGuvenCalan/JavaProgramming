package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer= input.nextLine();

        while (!(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("no") )){
            System.out.println("Invalid answer, please re-enter");
            answer= input.nextLine();

        }
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{

            System.out.println("Goodbye");
        }
    }
}
/*
Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no

 */