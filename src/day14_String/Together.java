package day14_String;

import java.util.Scanner;

public class Together {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord= input.next();

        System.out.println("Enter second word");
        String secondWord= input.next();

       input.close();

       char c1=firstWord.charAt(firstWord.length()-1);
       char c2=secondWord.charAt(0);

       if(c1==c2){

           System.out.println(firstWord+secondWord.substring(1));


        }else{
           System.out.println(firstWord+secondWord);
       }


    }
}
/*

    4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */