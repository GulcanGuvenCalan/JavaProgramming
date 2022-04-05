package day33_Statics;

public class PersonObjects {

    public static void main(String[] args) {


        Person person1 = new Person("Ayse", 32, 'F');
        Person person2 = new Person("Ali", 17, 'M');

        System.out.println(person1);
        System.out.println(person2);


        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);



        person1.eat("soop");
        person2.eat("Makaroni");

        person1.drink("juice");
        person2.drink("Water");

        person1.hasNose=true;
        person2.hasWings=false;




    }
}