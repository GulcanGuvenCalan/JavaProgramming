package day15_Loop;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String word= "mn@#123Ab!";
        String digits="";
        String letters="";
        String specialCharacter="";

        for (int i = 0; i<word.length(); i++) {
            char ch=word.charAt(i);
            if(ch>=1 && ch<=9){

            }
        }
    }
}
/*
write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */