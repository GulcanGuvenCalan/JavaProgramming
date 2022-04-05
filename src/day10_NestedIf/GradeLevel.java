package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        byte grdLvl= 18;
        String result ="";
        if(grdLvl>=1 && grdLvl<=18){// Valid grade level

           if(grdLvl>=1 && grdLvl<=5){
               result ="Elementary school";

           }else if(grdLvl>=6 && grdLvl<=8){
               result ="Middle school";
           }else if(grdLvl>=9 && grdLvl<=12){
               result ="High school";
           }else if(grdLvl>=13 && grdLvl<=16){
                result = "College";
           }else {
                result = "Grad School";
           }
        }else{
            result = "Invalid grade level";
        }
        System.out.println(result);
       }
       }
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */