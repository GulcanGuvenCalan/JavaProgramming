package day09_IfStatements;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        int number = 0;
        String word ="";//Temporary
        if (number >= 0 && number <= 9) {//if the number is valid (1~12)

            if(number==0){
                word="Zero";
            }else if(number==1){
                word ="One";
            }else if(number==2){
                word ="Two";
            }else if(number==3){
                word ="Three";
            }else if(number==4){
                word="Four";
            }else if(number==5){
                word ="Five";
            }else if(number==6){
                word="Six";
            }else if(number==7){
                word="Seven";
            }else if(number==8){
                word="Eight";
            }else{
                word="Nine";
            }

        } else {//if the number is not valid
            word = "Invalid number";

        }
        System.out.println("word = " + word);
    }
}



