package module2.chapteroop_basics;



class Company {
    static String companyName = "codewall";
    int employeeNumber = 10;

}




public class Lesson1Variables {
    // global variable//properties//
    int number1 = 5; //instance variable

    static int number2 = 45; //static variable
    public static void main(String[] args) {
        int a = 5; //local variable
        System.out.println(a);

        String name = "Moe Nandar"; //variable initailization

        //Type            objectname          object(new constructor)
        Lesson1Variables lesson1Variables = new Lesson1Variables();
        System.out.println(lesson1Variables.number1);
//        System.out.println(new Lesson1Variables().number1);


        System.out.println(Lesson1Variables.number2);
        System.out.println(number2);


        System.out.println(Company.companyName);
        Company employeeNumber = new Company();
        System.out.println(employeeNumber.employeeNumber);
    }
}
