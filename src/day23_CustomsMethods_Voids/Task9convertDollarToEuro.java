package day23_CustomsMethods_Voids;

public class Task9convertDollarToEuro {
    public static void main(String[] args) {
  dollarToEuro(500);
    }

    public static void dollarToEuro(int dollar){
        double euro=dollar*1.13;

        System.out.println(dollar +" dollar equals to " + euro+" euro ");
    }
}
/*
create a method that can convert dollar to euro
 */