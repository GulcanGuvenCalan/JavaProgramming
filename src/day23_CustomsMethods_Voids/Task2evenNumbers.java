package day23_CustomsMethods_Voids;

public class Task2evenNumbers {
    public static void main(String[] args) {
        evenNumbers();
    }


    public static void evenNumbers(){
        for (int i =2; i <=100; i+=2) {
            System.out.print(i+" ");
        }
    }
}
/*
create a method that can print even numbers between 1~100 in a same line saperated by space
 */