package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your hourlyRate?");
        int hourlyRate= input.nextInt();

        System.out.println("how many hours do you work  in a week?");
        int hoursWeek= input.nextInt();

        System.out.println("What is state tax?");
        double stateTaxRate=input.nextDouble();

        System.out.println("What is federal tax?");
        double federalTaxRate=input.nextDouble()/100;
       input.close();
        int salary=hourlyRate*hoursWeek*52;//52 total number of weeks in a year
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate;
        double totalTax=stateTax+federalTax;
        double netIncome=salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);





    }
}
/*
3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

 */

