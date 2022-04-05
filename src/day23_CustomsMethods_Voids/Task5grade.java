package day23_CustomsMethods_Voids;

public class Task5grade {
    public static void main(String[] args) {

      grade(75);
    }

    public static void grade(int score) {


        String result = "";

        if (score >= 0 && score <= 100) {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" :(score>=60)? "D":"E";

        }

        System.out.println(result);

    }

}
/*
create a method that can calculate the grade of the student based on the score
 */