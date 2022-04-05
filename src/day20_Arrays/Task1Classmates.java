package day20_Arrays;

import java.util.Arrays;

public class Task1Classmates {
    public static void main(String[] args) {

        String[] classmates={"Ayse X", "Ibo Y","Gul X", "Zulal Y","Yusuf Z","Daniel V","Muko X","Zinet Gul","Zulal Y","Yusuf Z"};



        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initial);
        }
    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */