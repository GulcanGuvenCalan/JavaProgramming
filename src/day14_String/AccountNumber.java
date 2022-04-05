package day14_String;

import java.util.Scanner;

public class AccountNumber {


    private static CharSequence num;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountNumber = input.next();
        input.close();

        char c=accountNumber.charAt(0);
        int l=accountNumber.length();



        if((c=='2' && l==7) || (c=='5' && l==10)){
            System.out.println("Account number is valid");
        }else{
            System.out.println("Invalid account number");
        }
        }

    }

/*
Create a class called AccountNumber.

       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
*/

