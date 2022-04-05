package day01_JavaIntro;
public class quiz {
    public static void main(String[] args) {


int num=5;
while (isAvailable(num)){
    System.out.println(num--);
}


    }
public static boolean isAvailable(int num){
        return (num-->0)?true:false;
}
}
