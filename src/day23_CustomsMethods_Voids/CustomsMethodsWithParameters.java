package day23_CustomsMethods_Voids;

public class CustomsMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(4); // the methods demands additional info to complete its task

        ageOfPerson(1995);
     printNumbers(1000,2000);
    }
    //create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number) {


        if (number % 2 == 0) {
            System.out.println(number + " is even number");

        } else {
            System.out.println(number + " is odd number");
        }

    }


    //create a function that can display the age of the person

    public static void ageOfPerson(int birthYear) {


        int age = 2021 - birthYear;
        System.out.println("Your age is: " + age);
    }

    //                                                       10       50
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y) {

    }
}