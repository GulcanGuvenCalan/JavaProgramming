package day33_Statics;

public class CydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimmy",21,'M',34,'B',32,2);

        CydeoStudent student2 = new CydeoStudent("Cenk",23,'M',21,'A',32,2);

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgrammingLanguage();
        student2.printProgrammingLanguage();


    }
}
