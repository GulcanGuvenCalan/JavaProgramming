package day33_Statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int ID;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName="Cydeo School";
    public static String programmingLanguage="Java";


    public CydeoStudent(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+"is studying");
    }

    public void attendClass(){
        System.out.println(name+"is attending class");
    }

    public static void printSchoolName(){
        System.out.println("schoolName:"+ schoolName);
    }

    public static void printProgrammingLanguage(){
        System.out.println("programming Language:"+programmingLanguage);


    }

    public String toString() {
        return "CydeoStudentTask{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }


}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()


 */