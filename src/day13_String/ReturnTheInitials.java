package day13_String;

import java.util.Scanner;

public class ReturnTheInitials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName= input.nextLine();

        System.out.println("Enter your last name");
        String lastName= input.nextLine();



    char f=firstName.toUpperCase().charAt(0);
    char l=lastName.toUpperCase().charAt(0);


    String result=f +"."+l;
        System.out.println(result);

input.close();


    }
}
/*
 write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */