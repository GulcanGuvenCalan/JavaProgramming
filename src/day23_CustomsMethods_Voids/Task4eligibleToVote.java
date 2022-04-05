package day23_CustomsMethods_Voids;

public class Task4eligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(21,"USA");

    }
public static void eligibleToVote(int age, String citizenShip){

        if(age>=19 && citizenShip.equalsIgnoreCase("USA")){

            System.out.println("You are eligible to vote!");

        }else {
            System.out.println("You are not eligible to vote!");
        }
}








}
/*
create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */