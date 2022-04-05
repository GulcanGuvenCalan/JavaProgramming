package day17_While_DoWhile;

public class Task1TwoNumDivide {
    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 9;

        int count = 0;

        while (num1 >= num2) {
            num1-= num2;
            count++;
        }

        System.out.println(count+" with a remainder of "+num1);


    }
}
