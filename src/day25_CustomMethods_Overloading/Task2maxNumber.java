package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Task2maxNumber {
    public static void main(String[] args) {


    }
//1. create a method that can return the max number from an integer array
    public static int maxNumber(int[] array){
       int max=array[0];

        for (int each:array) {
            if(each>max){
                max=each;
            }
        }

       return max;
    }

//2. create a method that can return the max number from double array

    public static double maxNumber(double[] array){

        double max=array[0];

        for (double each:array) {

            if(each>max){
                max=each;
            }

        }
        return max;
    }

//3. create a method that can return the max number from long array

public static long maxNumber(long[] array){

        long max=array[0];

    for (long each:array) {

        if(each>max){
            max=each;

        }
    }
      return max;
}

//4. create a method that can return the max number from short array

    public static short maxNumber(short[] array){

        short max=array[0];
        for (short each:array) {

            if (each>max){
                max=each;
            }
        }
        return max;
    }

//5. create a method that can return the max number from float array
public static float maxNumber(float[] array){

    float max=array[0];
    for (float each:array) {

        if (each>max){
            max=each;
        }
    }
    return max;
}

//6. create a method that can return the max number from byte array

    public static byte maxNumber(byte[] array){

        byte max=array[0];
        for (byte each:array) {

            if (each>max){
                max=each;
            }
        }
        return max;
    }


}
/*
Task :
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */