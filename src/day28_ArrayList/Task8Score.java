package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8Score {
    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        int countGradeOfA=0;
        int countGradeOfB=0;
        int countGradeOfC=0;
        int countGradeOfD=0;
        int countGradeOfF=0;

        for (Integer each : scores) {
            if(each>=90 && each<=100){
                countGradeOfA++;

             }else if(each>=80 && each<=89){
                countGradeOfB++;

             }else if(each>=70 && each<=79){

                countGradeOfC++;
            }else if(each>=60 && each<=69){
                countGradeOfD++;

            }else {
                countGradeOfF++;
            }
        }
        System.out.println("countGradeOfA = " + countGradeOfA);
        System.out.println("countGradeOfB = " + countGradeOfB);
        System.out.println("countGradeOfC = " + countGradeOfC);
        System.out.println("countGradeOfD = " + countGradeOfD);
        System.out.println("countGradeOfF = " + countGradeOfF);
    }
}
/*
Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */