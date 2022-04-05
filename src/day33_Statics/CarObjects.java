package day33_Statics;

public class CarObjects {
    public static void main(String[] args) {
        Car car=new Car("Toyota", "Corolla", "Gray", 2021, 35000);

        System.out.println(car);
        car.drive();

        System.out.println(car.hasSeats);

    }
}
