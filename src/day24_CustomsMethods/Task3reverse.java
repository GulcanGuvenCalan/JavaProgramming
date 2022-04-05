package day24_CustomsMethods;

public class Task3reverse {
    public static void main(String[] args) {

        String str1="I love Java";

      String  result= reverse(str1);
        System.out.println(result);
    }

public static String  reverse(String str){
  String result="";

    for (int i =str.length()-1; i>=0; i--) {

        result+=str.charAt(i);

    }
    return result;


}

}
/*
 create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */