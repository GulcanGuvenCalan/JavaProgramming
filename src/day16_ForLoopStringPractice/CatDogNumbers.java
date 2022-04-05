package day16_ForLoopStringPractice;

import java.util.Locale;

public class CatDogNumbers {
    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <=sentence.length() - 3; i++) {
            String s = sentence.substring(i, i + 3).toLowerCase();
            if (s.equalsIgnoreCase("cat")) {
                countCat++;
            }
            if (s.equalsIgnoreCase("dog")) {
                countDog++;
            }
        }
            boolean result = countCat == countDog;

            System.out.println(result);


    }
}
/*
 write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */