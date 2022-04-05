package day23_CustomsMethods_Voids;

public class Task14printEachElement {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7};
        printEachElement(arr);

    }

public static void printEachElement(int[] array){

    for (int each : array) {
        System.out.println(each);
    }
}

}
/*
create a method named printEachElement that can print each elements of an integer array

 */