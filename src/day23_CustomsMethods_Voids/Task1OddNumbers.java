package day23_CustomsMethods_Voids;

public class Task1OddNumbers {
    public static void main(String[] args) {
        oddNumbers();
    }


    public static void oddNumbers(){
        for (int i =1; i <=100; i+=2) {
            System.out.print(i+" ");
        }
    }
}
/*
create a method that can print odd numbers between 1~100 in a same line saperated by space

 */