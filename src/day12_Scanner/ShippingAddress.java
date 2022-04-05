package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
         String buildingNumber = input.next();

        input.nextLine();//Enter

        System.out.println("Enter your Street name:");
        String street= input.nextLine();

        System.out.println("Enter your city name:");
        String city = input.nextLine();

        System.out.println("Enter your state name:");
        String state = input.next();

        input.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();

        input.nextLine();//EnterEnter

        System.out.println("Enter your country name:");
        String country =input.nextLine();


        input.close();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);






    }
}
/*
Enter your full name(nextLine() )
Enter your building number(next() )
Enter your Street name (nextLine() )
Enter your city name (nextLine() )
Enter your state (next() )
Enter your zip code (next() )
 Display the shipping address
 */