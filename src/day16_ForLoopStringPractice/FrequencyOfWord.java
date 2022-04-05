package day16_ForLoopStringPractice;

public class FrequencyOfWord {
    public static void main(String[] args) {
        
      
        String sentence= "Java Java";
                
        int frequency=0;

        while(sentence.contains("Java")){
            sentence=sentence.replaceFirst("Java" ,"");
            frequency++;
        }
        System.out.println( frequency);
        }
        
    }

/*
write a program that can return the frequency of the a word Java from the sentence 

        Ex:
            sentence = "Java Java";
           
            output:
                2

            Hint: you need to create 
 */