package day05_Concatenation;

import java.time.Year;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2018;
        String  make = "Volvo";
        String model =" V50";
        long miles = 50000L;
        String color = "red";
        long price =190000L;

        System.out.println(year + " " + make + " " + model + ", " + miles + ", " + color + ", " + "$" + price + ".");


    }
}


/*
Create a class called CarInfo.java
Declare the following variables:
1.year
2.make
3.model
4.miles
5.color
6.price
Use concatenation to print the full info of the car in
the following format:
Year  Make  Model,  Miles,  Color,  Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */