package day33_Statics;

public class IPhoneTask {

    public String model;
    public int price;
    public String color;
    public String size;
    public static  String brand;
    public static  String OS="iOS";
    public static  String madeIn="China";

    public IPhoneTask(String model, int price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with  number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model+" is face timing with  email "+email);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public  void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "IPhoneTask{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
	1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */