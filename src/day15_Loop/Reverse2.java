package day15_Loop;

public class Reverse2 {
    public static void main(String[] args) {

        String str="Java";

        String result="";

        for (int i =str.length()-1; i>=0 ; i--) {
               result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
/*
 Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */