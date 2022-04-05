package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {
        //age:38 years old
        byte age=38;
     //weight:160 pounds
        // byte weight=160; // 160 is out of byte´ range
       //byte num=-129; //-129 is out of byte´ range

     short weight=160; // 160 is within the range of short
        // salary;100000$
        //short salary =100000; // is out of short range
     int salary=100_000; // int is the preferred data type for integer numbers
     long asset=3_333_333_333L;
     // tax:0.26;
        float tax=026F;
        double PI =3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char name = 'E';
        System.out.println("name = " + name);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        System.out.println("isEmployeed = " + isEmployeed);


        boolean isMarried = false;

        System.out.println("isMarried = " + isMarried);

        boolean result = 100> 300;
        System.out.println("result = " + result);
        
        String grade = "Wooden Spoon";
        System.out.println("name = " + name);
        
        String city = "Toronto";
        System.out.println("city = " + city);
        
                


    }
}

