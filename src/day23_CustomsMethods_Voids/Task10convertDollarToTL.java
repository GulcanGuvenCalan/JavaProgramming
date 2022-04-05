package day23_CustomsMethods_Voids;

public class Task10convertDollarToTL {
    public static void main(String[] args) {
   convert$ToTl(1000);
    }

    public static void convert$ToTl(int dollar){

        double Tl=dollar*9.53;
        System.out.println(dollar+" dollar equals to "+Tl+" Tl");
    }

}
/*
create a method that can can convert dollar to lira
 */