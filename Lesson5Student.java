package module2.chapteroop_basics;

public class Lesson5Student {
    int id;
    String name;
    int age;
    static String schoolName = "Codewall";

    public static void main(String[] args) {
        Lesson5Student student1 = new Lesson5Student();
        student1.id = 1;
        student1.name = "Haruto";
        student1.age = 19;

        Lesson5Student student2 = new Lesson5Student();
        student2.id = 2;
        student2.name = "wonwoo";
        student2.age = 25;


        System.out.println(student1.id);
        System.out.println(student2.id);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        Lesson5Student.schoolName = "University";
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }
}
