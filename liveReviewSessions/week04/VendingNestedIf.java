package week04;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = "chips";

        if (selection == "drink") {
            System.out.println("drink option is selected");
            if (drinkItem == "tea") {
                System.out.println("tea option is selected");
            } else if (drinkItem == "coffee") {
                System.out.println("coffee option is selected");

            }

        } else if (selection == "snack") {
            System.out.println("snack option is selected");
            if (snackItem == "chips") {
                System.out.println("chips option is selected");
            } else if (snackItem == "candy") {
                System.out.println("candy option is selected");
            }
        }else{
            System.err.println("Invalid ENTRY");
        }



    }
}



/*
dd new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */