package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

       String  str = "AAABBBC";
       char  ch = 'A';
       int frequency=0;//1+1+1==>3

        for (int i = 0; i < str.length(); i++) {//i:indexes of str
            char eacChar =str.charAt(i);//eacChar:each character of str
               //'A'=='B'
            if(ch==eacChar){//if given ch is matching with the eachChar , then ch is appeared in the string
                frequency++;
            }
        }
        System.out.println(frequency);


    }
}
/*
Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */