package day23_CustomsMethods_Voids;

public class Task12positiveNegativeZero {
    public static void main(String[] args) {
        number(100);
    }

    public static void number(int number){

        if(number>0){

            System.out.println("positive");
        }else if(number<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}
