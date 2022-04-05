package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a= 20,
                b = 5,
                c = 30;


        boolean aIsMedian =(a>b && a<c) || (a>c && a<b);

      /*
      in order for a to be the medium number:
       1. if c is the maximum number & b is the minimum number, then a is the median number
       2. if b is the maximum number & c is the minimum number , then a is the median number
       */
        boolean bIsMedian =(b>a && b<c) || (b>c && b<a);
      /*
      in order for b to be the medium number:
       1. if c is the maximum number & a is the minimum number, then b is the median number
       2. if a is the maximum number & c is the minimum number , then b is the median number
       */

        boolean cIsMedian =!aIsMedian &&!bIsMedian;
        /*
        in order for b to be the medium number:
       1. if a is the maximum number & b is the minimum number, then c is the median number
       2. if c is the maximum number & a is the minimum number , then c is the median number
         */


        if(aIsMedian){// if a is the median number
            System.out.println(a + " is median number");
        }

        if(bIsMedian){// if b is the median number
            System.out.println(b + " is median number");
        }

        if(cIsMedian){// if c is the median number
            System.out.println(c + " is median number");
        }
    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number



 */