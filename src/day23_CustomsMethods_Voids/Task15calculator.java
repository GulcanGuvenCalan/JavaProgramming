package day23_CustomsMethods_Voids;

public class Task15calculator<operator> {
    public static void main(String[] args) {
numbers(2.0,5.0,'*');
    }

    public static void numbers(double num1,double num2,char operator){

        String result="";

    if(operator=='+'||operator=='-'||operator=='*'||operator=='/'){

    }
    if(operator=='+'){
        result="addition:"+(num1*num2);
    }else if(operator=='-'){
     result="subtraction:"+(num1-num2);
    }else if(operator=='*'){
        result="multiplication:"+(num1*num2);
    }else{
        result="Division:" +(num1/num2);
    }


        System.out.println(result);


    }

}
/*
create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
 */