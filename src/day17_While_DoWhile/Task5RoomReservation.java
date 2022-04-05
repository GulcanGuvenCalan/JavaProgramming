package day17_While_DoWhile;

import java.util.Scanner;

public class Task5RoomReservation {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Do you want to reserve a room?");
        String yesOrNo= input.nextLine();



        if(yesOrNo.equalsIgnoreCase("Yes")){
            System.out.println("Which type of room do you want to reserve?");
            String whichTypeRoom= input.nextLine();

            while (!(yesOrNo=="Yes"|| yesOrNo=="No")) {
                System.out.println("Invalid answer.Please re-enter valid answer");

            }

        }else {
            System.out.println("have a nice day");
input.close();

        }

            }
    }

/*
 Create a class called RumReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */