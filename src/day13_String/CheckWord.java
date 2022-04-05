package day13_String;

import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String s1= input.next();

        System.out.println("Enter second word");
        String s2= input.next();

        System.out.println("Enter third word");
        String s3= input.next();


      if(s1.length()==s2.length() && s2.length()==s3.length() ){

          System.out.println("All words are same length");

      }else if(s1.length()==s2.length()){
          System.out.println("Not Same nor Different lengths");


      }else if(s1.length()==s3.length()){
          System.out.println("Not Same nor Different lengths");
      }else if(s2.length()==s3.length()){

          System.out.println("Not Same nor Different lengths");
      }else{
          System.out.println("All different length");
      }




    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
