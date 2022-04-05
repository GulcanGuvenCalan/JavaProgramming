package day15_Loop;

public class Alphabet {
    public static void main(String[] args) {
        /*
        Print:
            A~Z
            a~z
            Z~A
            z~a
         */
      //A~Z
        for(int i=65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("---------------");

        for (char i='A'; i<='Z'; i++){//i:A,B,C,D------Z
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------------");

        //   a~z
        for (char i='a'; i<='z'; i++){//i:a,b,c,d------z
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        // Z~A
        for (char i='Z'; i>='A'; i--) {//i:Z.....A
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("---------------------------");
     //  z~a
        for (char i='z'; i>='a'; i--) {//i:z.....z
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("---------------------------");
        for (char i=1; i<=40000; i++) {//i:z.....z
            System.out.print(i +" ");
        }
        System.out.println();


    }
}
