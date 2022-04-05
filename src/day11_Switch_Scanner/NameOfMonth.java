package day11_Switch_Scanner;

public class NameOfMonth {
    public static void main(String[] args) {

        int number = 0;
        String result ="";

        switch (number){//1,2,3,4,5,6,7,,8,9,10,11,12

            case 1:
                result = "January";
                break;
            case 2:
                result ="February";
                break;
            case 3:
                result ="March";
                break;
            case 4:
                result ="April";
                break;
            case 5:
                result ="May";
                break;
             case 6:
                 result ="June";
                 break ;
             case 7:
                 result = "July";
                 break;
             case 8:
                 result ="August";
                 break;
            case 9:
                result ="September";
                break;
            case 10:
                result ="October";
                break;
            case 11:
                result ="November";
                break;
            case 12 :
                result ="December";
                break;
            default:
                result ="Invalid";
                break;
        }
        System.out.println(result);
    }
}
