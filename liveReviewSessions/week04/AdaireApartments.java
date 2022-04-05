package week04;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms =1;
        double startingPrice=0;
        String result ="";

        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        switch(numberOfBedrooms){
            case 0:
                result ="Studio apartment selected";
                startingPrice =1454;
                break;
            case 1:
                result="One bedroom apartment selected";
                startingPrice = 1725;
                break;
            case 2:
                result ="Two bedroom apartment selected";
                startingPrice=2899;

            default:
                result ="5 bedroom currently unavailable";
                break;

        }
        System.out.println(result);
    }
}
/*
add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
print: "Studio apartment selected"
startingPrice -> 1454

when numberOfBedrooms 1:
print: "One bedroom apartment selected"
startingPrice -> 1725

when numberOfBedrooms 2:
print: "Two bedroom apartment selected"
startingPrice -> 2899

default:
print "5 bedroom currently unavailable"

------
"Starting price $1454"
 */