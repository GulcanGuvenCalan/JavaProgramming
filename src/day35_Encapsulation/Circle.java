package day35_Encapsulation;

public class Circle {

    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius!=0 || radius<0){
            return;
        }

        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea(double radius){

        return radius*radius*pi;
    }

    public double calcPerimeter(){

        return 2*(radius*pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

/*
 Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()




 */