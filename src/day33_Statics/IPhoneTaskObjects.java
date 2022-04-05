package day33_Statics;

public class IPhoneTaskObjects {
    public static void main(String[] args) {

        IPhoneTask iPhone1=new IPhoneTask("iphone 12", 1000, "black", "5.6 inches");
        System.out.println(iPhone1);
        iPhone1.faceTime(123456789);
        iPhone1.faceTime("gmail@yahoo.com");
        iPhone1.call(123456789);
        iPhone1.text(123456789);


    }
}
