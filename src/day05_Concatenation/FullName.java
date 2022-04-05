package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Ali";
        String lastName = "Daniel";
        int age = 45;
        String JobTitle = "SDET";
        String CompanyName = "Apple Inc";
        double salary = 100000.58;

        String FullName = firstName +" " + lastName ;
        System.out.println(FullName);


        // Full name of the person is --------
        System.out.println("Full name of the person is " + FullName);
      //------ is ----years old
        System.out.println(FullName + " is " + 45 + " years old");

    // FullName is JobTitle, works at CompanyName, and FullName' salary is Salary
        System.out.println(FullName + " is " + JobTitle + ", works at "
                + CompanyName + ", and " + FullName + "'s salary is $ " + salary);


    }
}
