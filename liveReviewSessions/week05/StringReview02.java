package week05;

import java.util.Locale;

public class StringReview02 {
    public static void main(String[] args) {

        /*
        length(): it does not take parameter, it returns an integer number
        toUpperCase()
     charAt() toLowerCase()
      trim() indexOf()
     lastIndexOf() replace() replaceFirst()
      Substring() repeat()

         */

        String message ="EU8 is Avwesome!!";
        int count =message.length();
        System.out.println("how may characters we have : "+count);
        System.out.println(count==16);
        if(message.length()==16) {
            System.out.println("happy testing");
        }
        System.out.println(message.toUpperCase());
        System.out.println("message after uppercase");
        System.out.println(message);
        // assign changes to a refernces
        String messageTwo=message.toUpperCase();
        System.out.println(messageTwo);//EU8 IS AVESOME!!


        String str ="  abc  ";
        str =str.trim();
        System.out.println(str);

        //can we also trim not the spaces before or after, but the one that is inside the text?

     String str2=" abc  cde  ";
     str2=str2.replaceFirst("  ","");
        System.out.println(str2);

        String str3="  EU8 Awesome  ";
        str3=str3.trim().replaceFirst("  ","");//EU8AWESOME
        System.out.println(str3);

        //can we trim and replace and do upperCase and substring in the same expression  ??
        //YES it is possible










    }
}
