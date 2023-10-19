package module2.chapteroop_basics;

public class Lesson7ReturnType {
    static void calculator() {
        int a = 3;
        int b = 5;
        int result = a +b;
        System.out.println("This is " + result);
    }

    static int sum() {
        return 45;
    }

    static String name() {
        System.out.println("Another One");
        return "HAruto";
//        System.out.println("The next one");
    }

    public static void main(String[] args) {
        calculator();

        sum();
        int result =sum();
        System.out.println(result);
        System.out.println(sum());
        name();
    }
}
