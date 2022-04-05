package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String name = "vent";
        String result = "";

        //Solution 1: use if statement
        if (name == "tall" || name == "grande" ||name == "vent") {

          if(name == "tall") {
            result = "Price is $3.69 "+
             "\n90 calories";
        } else if (name == "grande") {
            result = "Price is $3.99 "+
            "\n120 calories";

        } else {
                result = "price is $4.29 " +
                        "\n150 calories";
            }
        } else {
            result = "Invalid Size";

        }
        System.out.println(result);


        System.out.println("------------------");

        //Solution 2: use switch statement
        switch (name) {
            case "tall":

                result = "Price is $3.69 "+
               "\n90 calories";
                break;
            case "grande":
                result = "Price is $3.99 "+
               "\n120 calories";
                break;
            case "vent":
                result = "price is $4.29 "+
                "\n150 calories";
                break;

            default:
                result = "Invalid Size";
                break;
        }
        System.out.println(result);


        System.out.println("_______________________________");
        //Solution 2: use if & switch statements mixed
        if (name == "tall" || name == "grande" || name == "vent") {

            switch (name) {

                case "tall":
                    result = "Price is $3.69 "+
                    "\n90 calories";
                    break;
                case "grande":
                    result = "Price is $3.99 "+
                    "\n120 calories";
                    break;
                case "vent":
                    result = "price is $4.29 "+
                            "\n150 calories";
                    break;
            }

        } else {
            result = "Invalid Size";
        }
        System.out.println(result);

    }
}
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */