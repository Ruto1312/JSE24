package module2.chapteroop_basics;

public class Lesson6Method {
    //instance method
    void display() {
        System.out.println("This is a display");
    }

    //static method
    static void show() {
        System.out.println("This is a show");
    }

    public static void main(String[] args) {
        Lesson6Method method = new Lesson6Method();
        method.display();
        method.display();
        method.display();


        Lesson6Method.show();
        Lesson6Method.show();
        show();
    }

}
