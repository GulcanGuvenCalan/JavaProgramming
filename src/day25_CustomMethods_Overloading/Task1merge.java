package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Task1merge {
    public static void main(String[] args) {

        int[] num1={1,2,3,};
        int[] num2={4,5,6,7};
       int[] numbers= merger(num1,num2);

        double[] num3={1.5,2.5,3.5,};
        double[] num4={4.5,5.5,6.7,7.8};
        double[] elements= merger(num3,num4);

        char[]  ch1={'A','B','C'};
        char[] ch2={'D','F','G'};
        char[] elements1=merger(ch1,ch2);

        String[]  str1={"Ali","Ayse","Defne"};
        String[] str2={"Zulal","Yusuf","Orhan Akif"};
        String[] names=merger(str1,str2);




        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(elements));
        System.out.println(Arrays.toString(elements1));
        System.out.println(Arrays.toString(names));




    }
    //1. create a method that can merge two integer arrays.
    public static int[] merger(int[] arr1, int[] arr2){

        int[] merge=new int[arr1.length+ arr2.length];

        int i=0;

        for (int each:arr1) {
            merge[i++]=each;
        }
        for (int each:arr2) {
            merge[i++]=each;
        }
        return merge;
    }



    //2. create a method that can merge two double arrays.

    public static double[] merger(double[] arr1,double[] arr2){

        double[] merger=new double[arr1.length+ arr2.length];

        int i=0;

        for (double each :arr1) {
            merger[(int) i++]=each;
        }

        for (double each:arr2) {
            merger[(int) i++]=each;

        }
        return merger;
    }

    //3. create a method that can merge two char arrays.

    public static char[] merger(char[] arr1,char[] arr2){

        char[] merger=new char[arr1.length+ arr2.length];

        int i=0;

        for (char each :arr1) {
            merger[i++]=each;
        }

        for (char each:arr2) {
            merger[i++]=each;

        }
        return merger;
    }

    //4. create a method that can merge two String arrays.

    public static String[]  merger(String[] arr1, String[] arr2){

        String[] merger=new String[arr1.length+ arr2.length];

        int i=0;

        for (String each :arr1) {
            merger[i++]=each;
        }

        for (String each:arr2) {
            merger[i++]=each;

        }
        return merger;


    }

}
/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.


 */