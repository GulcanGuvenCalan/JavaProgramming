package day20_Arrays;

import java.util.Arrays;

public class Task2ReverseClassmates {
    public static void main(String[] args) {

        String[] classmates={"Ayse X", "Ibo Y","Gul X", "Zulal Y","Yusuf Z","Daniel V","Muko X","Zinet Gul","Zulal Y","Yusuf Z"};
        for (int i = 0; i < classmates.length; i++) {
        String name=classmates[i];

        String reverseName="";

            for (int j =name.length()-1; j>=0 ; j--) {
                 reverseName+=name.charAt(j);
            }
            System.out.println(reverseName);
            }

        }

        }



/*
 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */