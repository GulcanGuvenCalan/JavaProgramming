package day23_CustomsMethods_Voids;

public class Task6areaOfCircle {
    public static void main(String[] args) {
        areaOfCircle(3.14,3.5);

    }


    public static void areaOfCircle(double PI,double radius){

        double  area=radius*radius*PI;
        System.out.println(area);
    }

}
/*
create a method that can calculate the area of a circle

 */