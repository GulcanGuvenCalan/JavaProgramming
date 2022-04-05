package task;

import java.util.Arrays;

public class ArrayPracticeZero {
    public static void main(String[] args) {
        int[]  array ={1,0,2,0,3,0,0,4,5,6,7};

        int[] result=new int[array.length];


        int zero=0;
        for (int i = 0; i < result.length; i++) {

            if(array[i]!=0){
                result[zero++]=array[i];

            }



        }
        System.out.println(Arrays.toString(result));
    }
}
/*
move all zeros end of array
array ={1,0,2,0,3,0,0,4,5,6,7}

output={1,2,3,4,5,6,7,0,0,0,0}
Do not use sort
 */

