package day33_Statics;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("Lucy", "Husky", "Small", 'F',4, "White" );
        System.out.println(dog1);
        System.out.println(dog1.numberOfWings);
        dog1.eat();
        dog1.play();

        System.out.println(dog1.numberOfEyes);

    }
}
