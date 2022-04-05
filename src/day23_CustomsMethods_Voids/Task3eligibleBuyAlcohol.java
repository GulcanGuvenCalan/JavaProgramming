package day23_CustomsMethods_Voids;

public class Task3eligibleBuyAlcohol {
    public static void main(String[] args) {
        eligibleBuyAlcohol(3);

    }
public static void eligibleBuyAlcohol(int age){


    if(age>=21){
        System.out.println("you are eligible");
    }else{
        System.out.println("you are not eligible");
    }
}



}
/*
 create a method that can check if a person is eligible to buy alcohol
 */