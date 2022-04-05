package day12_Scanner;

//import java.util.*;//wild import: imports everything from package
import java.util.Scanner;// regular import: imports one class

public class ScannerPractice {
    public static void main(String[] args) {
         /*
        new Scanner(System.in).nextInt();
         new Scanner(System.in).nextInt();
         ....
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a between 1 to 7:");
        int num = scan.nextInt();
String result = "";//temp
if(num>=1 && num<=7){ //7 out put
 result=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday"
:(num==6)?"Saturday":"Sunday";

}else{
    result = "Invalid Number";
}
        System.out.println(result);
scan.close();
    }
}
